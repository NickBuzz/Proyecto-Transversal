package AccesoADatos;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();

    }

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia(nombre,año ,estado )"
                + "VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        }

    }

    public void buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT nombre ,año,estado FROM materia WHERE idMateria=? AND estado=1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "no existe esa Materia");
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia" + ex.getMessage());
        }

    }

    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre=?,año=?, estado=?WHERE idMateria=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, true);
            ps.setInt(4, materia.getIdMateria());
            int exito = ps.executeUpdate();
            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Modifiado exitosamente.");

            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");
        }

    }

    public void eliminarMateria(int id) {
        String sql = "UPDATE materia SET estado=0 WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila >= 1) {
                JOptionPane.showMessageDialog(null, "Se elimino la materia");
            }
            ps.close();

        } catch (SQLException ex) {

        }
        JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");
    }

    public List<Materia> ListarMaterias() {
List<Materia> materias=new ArrayList<>();
String sql="SELECT * FROM materia WHERE estado=1";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
              Materia materia=new Materia();
              
              materia.setIdMateria(rs.getInt("idMateria"));
              materia.setNombre(rs.getString("nombre"));
              materia.setAnioMateria(rs.getInt("año"));
              materia.setActivo(rs.getBoolean("estado"));
              materias.add(materia);
               System.out.println("esta es la materia: " + materia);
         
                
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia"+ex.getMessage());
        }
               System.out.println("estas son las materias: " + materias);

return materias;
    }
    
  
    
}
