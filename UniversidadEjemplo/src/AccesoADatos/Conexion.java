
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static java.util.Date.UTC;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    
    
    private static final String URL = "jdbc:mariadb://localhost:3306/proyecto transversal";
    private static final String USUARIO= "root";
    private static final String PASSWORD = "";

    private static Connection connection;

   private Conexion (){}
   public static Connection getConexion(){
       if(connection == null){
           try {
               Class.forName("org.mariadb.jdbc.Driver");
               connection = DriverManager.getConnection(URL,USUARIO,PASSWORD);
               
           } catch (ClassNotFoundException ex) {
              JOptionPane.showMessageDialog(null,"error al cargar el driver"+ex.getMessage());
           
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error de conexion"+ex.getMessage());
           }
           
       }
       return connection;
   }
}
