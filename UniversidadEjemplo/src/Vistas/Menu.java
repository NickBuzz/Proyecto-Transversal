
package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Menu extends javax.swing.JFrame {

    private AlumnoData ad;
    private MateriaData md;
    private InscripcionData id;
    
    
    public Menu() {
        initComponents();
        
        ad = new AlumnoData();
        md = new MateriaData();
        id = new InscripcionData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        AlumXMateria = new javax.swing.JToggleButton();
        CargaDeAlumnos = new javax.swing.JToggleButton();
        CargaDeMaterias = new javax.swing.JToggleButton();
        FormularioInscripciones = new javax.swing.JToggleButton();
        ManipulacionNota = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Contenido = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 650));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 650));

        Menu.setBackground(new java.awt.Color(255, 248, 247));

        buttonGroup1.add(AlumXMateria);
        AlumXMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/List.png"))); // NOI18N
        AlumXMateria.setText("Alumnos por Materia");
        AlumXMateria.setToolTipText("Listado de Alumnos por Materias");
        AlumXMateria.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        AlumXMateria.setBorderPainted(false);
        AlumXMateria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AlumXMateria.setIconTextGap(10);
        AlumXMateria.setInheritsPopupMenu(true);
        AlumXMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumXMateriaActionPerformed(evt);
            }
        });

        buttonGroup1.add(CargaDeAlumnos);
        CargaDeAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/User.png"))); // NOI18N
        CargaDeAlumnos.setText("Formulario de Alumno");
        CargaDeAlumnos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        CargaDeAlumnos.setBorderPainted(false);
        CargaDeAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CargaDeAlumnos.setIconTextGap(10);
        CargaDeAlumnos.setInheritsPopupMenu(true);
        CargaDeAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaDeAlumnosActionPerformed(evt);
            }
        });

        buttonGroup1.add(CargaDeMaterias);
        CargaDeMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Book.png"))); // NOI18N
        CargaDeMaterias.setText("Formulario de Materia");
        CargaDeMaterias.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        CargaDeMaterias.setBorderPainted(false);
        CargaDeMaterias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CargaDeMaterias.setIconTextGap(10);
        CargaDeMaterias.setInheritsPopupMenu(true);
        CargaDeMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaDeMateriasActionPerformed(evt);
            }
        });

        buttonGroup1.add(FormularioInscripciones);
        FormularioInscripciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Inscription.png"))); // NOI18N
        FormularioInscripciones.setText("Manejo de Inscripciones");
        FormularioInscripciones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        FormularioInscripciones.setBorderPainted(false);
        FormularioInscripciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FormularioInscripciones.setIconTextGap(10);
        FormularioInscripciones.setInheritsPopupMenu(true);
        FormularioInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioInscripcionesActionPerformed(evt);
            }
        });

        buttonGroup1.add(ManipulacionNota);
        ManipulacionNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Task.png"))); // NOI18N
        ManipulacionNota.setText("Manipulación de Notas");
        ManipulacionNota.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        ManipulacionNota.setBorderPainted(false);
        ManipulacionNota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ManipulacionNota.setIconTextGap(10);
        ManipulacionNota.setInheritsPopupMenu(true);
        ManipulacionNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManipulacionNotaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/About.png"))); // NOI18N
        jLabel2.setText("INFO");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CargaDeAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CargaDeMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FormularioInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManipulacionNota, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlumXMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CargaDeAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CargaDeMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FormularioInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ManipulacionNota, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(AlumXMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        Contenido.setMinimumSize(new java.awt.Dimension(600, 650));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Bienvenidos al sistema de gestión de la Universidad de La Punta");

        jLabel4.setText("Aqui podra dar de alta, baja o modificar los alumnos de la institución asi como las materias");

        jLabel5.setText("de cada curso. Tambien tendra acceso a la manipulación de inscripciones y notas, donde");

        jLabel6.setText("podra ver que materia cursa cada alumno y asignarle la nota que le corresponda.");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Proyecto Transversal | Equipo 41");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/LogoULP.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CargaDeAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaDeAlumnosActionPerformed
        // TODO add your handling code here:
        
        showJPanel(Contenido, new CargaDeAlumnos(ad));
        
    }//GEN-LAST:event_CargaDeAlumnosActionPerformed

    private void CargaDeMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaDeMateriasActionPerformed
        // TODO add your handling code here:
        showJPanel(Contenido, new CargaDeMaterias());
    }//GEN-LAST:event_CargaDeMateriasActionPerformed

    private void FormularioInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioInscripcionesActionPerformed
        // TODO add your handling code here:
        showJPanel(Contenido, new FormularioDeInscripcion(ad, md, id));
        
    }//GEN-LAST:event_FormularioInscripcionesActionPerformed

    private void ManipulacionNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManipulacionNotaActionPerformed
        // TODO add your handling code here:
        showJPanel(Contenido, new CargaDeNotas());
    }//GEN-LAST:event_ManipulacionNotaActionPerformed

    private void AlumXMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumXMateriaActionPerformed
        // TODO add your handling code here:
        showJPanel(Contenido, new ListadoDeAlumnosPorMateria(ad, md, id));
        
    }//GEN-LAST:event_AlumXMateriaActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(Color.red);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Proyecto Transversal Equipo 41\n\nNicolas Buzzella\nTania Arce\nJosé Eduardo Maldonado Sarmiento\nRuben Robles");
    }//GEN-LAST:event_jLabel2MouseReleased

   
    public static void main(String args[]) {
        FlatArcDarkIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AlumXMateria;
    private javax.swing.JToggleButton CargaDeAlumnos;
    private javax.swing.JToggleButton CargaDeMaterias;
    private javax.swing.JPanel Contenido;
    private javax.swing.JToggleButton FormularioInscripciones;
    private javax.swing.JToggleButton ManipulacionNota;
    private javax.swing.JPanel Menu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public static void showJPanel(JPanel c, JPanel p) {
        p.setSize(600, 650);
        p.setLocation(0, 0);

        c.removeAll();
        c.add(p, BorderLayout.CENTER);
        c.revalidate();
        c.repaint();
        
    }
}
