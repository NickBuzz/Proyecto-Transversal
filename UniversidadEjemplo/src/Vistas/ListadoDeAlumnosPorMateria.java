package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;

import Entidades.Alumno;
import Entidades.Materia;

import java.util.List;
import javax.swing.DefaultComboBoxModel;

import javax.swing.table.DefaultTableModel;

public class ListadoDeAlumnosPorMateria extends javax.swing.JInternalFrame {

    private AlumnoData ad;
    private MateriaData md;

    private InscripcionData id;
    DefaultTableModel modelo = new DefaultTableModel();
    List<Materia> materiasList;

    public ListadoDeAlumnosPorMateria(AlumnoData ad, MateriaData md, InscripcionData id) {
        this.ad = ad;
        this.md = md;
        this.id = id;
        initComponents();
        materiasList = md.ListarMaterias();
        cargarCabecera();
    }

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
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

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

        String materiaSeleccionada = (String) jCMaterias.getSelectedItem();

        int idMateria = 0;

        if (materiaSeleccionada != null) {

            for (Materia materia : materiasList) {
                if (materiaSeleccionada.equals(materia.getNombre())) {

                    idMateria = materia.getIdMateria();
                    
                    break;
                }
            }

            if (idMateria != 0) {
                List<Alumno> alumnos = id.obtenerAlumnosXMateria(idMateria);
      

                llenarJTable(alumnos);
            }
        }

    }//GEN-LAST:event_jCMateriasActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAlumnosXMateria;
    // End of variables declaration//GEN-END:variables

    private void cargarCabecera() {

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Materia materia : materiasList) {
            model.addElement(materia.getNombre());

        }

        jCMaterias.setModel(model);

        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");

        jTAlumnosXMateria.setModel(modelo);

    }

    private void llenarJTable(List<Alumno> alumnos) {

        modelo.setRowCount(0);

        for (Alumno alumno : alumnos) {
            modelo.addRow(new Object[]{
                alumno.getIdAlumno(),
                alumno.getDni(),
                alumno.getNombre(),
                alumno.getApellido(),
                

            });

        };

    }

}

//     for (Materia materia : materiasList) {
//                if (materiaSeleccionada.equals(materia.getNombre())) {
//
//                    int idMateria = materia.getIdMateria();
//
//                    List<Alumno> alumnos = inscripciones.obtenerAlumnosXMateria(idMateria);
//                    System.out.println(idMateria + "id materia");
//                    
//                    
//                    llenarJTable(alumnos);
//
//                    break;
//                }
//            }
