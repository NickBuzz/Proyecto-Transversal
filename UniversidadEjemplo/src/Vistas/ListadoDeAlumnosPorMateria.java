
package Vistas;

import AccesoADatos.AlumnoData;
<<<<<<< HEAD
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
=======
import AccesoADatos.MateriaData;
>>>>>>> e1a75ff09cfecaf608c2791e8e322f867e46621e
import Entidades.Materia;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
<<<<<<< HEAD
import javax.swing.table.DefaultTableModel;
=======



>>>>>>> e1a75ff09cfecaf608c2791e8e322f867e46621e

public class ListadoDeAlumnosPorMateria extends javax.swing.JInternalFrame {

    private AlumnoData alumno = new AlumnoData();
    private MateriaData materias = new MateriaData();
<<<<<<< HEAD
    private InscripcionData inscripciones = new InscripcionData();
    DefaultTableModel modelo = new DefaultTableModel();
    List<Materia> materiasList = materias.ListarMaterias();

=======
    
    
>>>>>>> e1a75ff09cfecaf608c2791e8e322f867e46621e
    public ListadoDeAlumnosPorMateria() {
     
        initComponents();
        cargarCabecera();
    }

<<<<<<< HEAD
=======

>>>>>>> e1a75ff09cfecaf608c2791e8e322f867e46621e
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCMaterias = new javax.swing.JComboBox<>();
        jBSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAlumnosXMateria = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("DialogInput", 2, 24)); // NOI18N
        jLabel1.setText("Listado de Alumnos Por Materia");

        jLabel2.setText("Seleccione una Materia");

        jCMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMateriasActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");

        jTAlumnosXMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTAlumnosXMateria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2)
                        .addGap(130, 130, 130)
                        .addComponent(jCMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBSalir)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMateriasActionPerformed
<<<<<<< HEAD
        String materiaSeleccionada = (String) jCMaterias.getSelectedItem();

        if (materiaSeleccionada != null) {

            for (Materia materia : materiasList) {
                if (materiaSeleccionada.equals(materia.getNombre())) {

                    int idMateria = materia.getIdMateria();

                    List<Alumno> alumnos = inscripciones.obtenerAlumnosXMateria(idMateria);

                    llenarJTable(alumnos);

                    break;
                }
            }
        }
=======
         String materiaSeleccionada = (String) jCMaterias.getSelectedItem();
       if (materiaSeleccionada != null) {
        
        
    }
        
>>>>>>> e1a75ff09cfecaf608c2791e8e322f867e46621e
    }//GEN-LAST:event_jCMateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAlumnosXMateria;
    // End of variables declaration//GEN-END:variables
<<<<<<< HEAD
private void cargarCabecera() {

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Materia materia : materiasList) {
            model.addElement(materia.getNombre());

        }

        jCMaterias.setModel(model);

    }

    private void llenarJTable(List<Alumno> alumnos) {

        modelo.setRowCount(0);

        for (Alumno alumno : alumnos) {
            Object[] filaDatos = {
                alumno.getIdAlumno(),
                alumno.getNombre(),
                alumno.getApellido(),
                alumno.getDni(),
                alumno.getFechaNac()

            };

            modelo.addRow(filaDatos);
        }
=======

    private void cargarCabecera() {
        List<Materia> materiasList = materias.ListarMaterias();
    
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
    for (Materia materia : materiasList) {
        model.addElement(materia.getNombre()); 
    }
    
    jCMaterias.setModel(model);
        
>>>>>>> e1a75ff09cfecaf608c2791e8e322f867e46621e
    }

}
