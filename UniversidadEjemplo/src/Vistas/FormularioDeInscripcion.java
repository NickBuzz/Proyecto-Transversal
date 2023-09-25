/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormularioDeInscripcion extends javax.swing.JPanel {

    private List<Alumno> listAlumnos;
    private Alumno alumnos;
    private List<Materia> listMaterias;
    private Materia materias;
    private AlumnoData ad;
    private MateriaData md;
    private InscripcionData id;
    private Inscripcion inscripcion;

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    /**
     * Creates new form FormularioDeInscripcion
     *
     * @param ad
     * @param md
     * @param id
     */
    public FormularioDeInscripcion(AlumnoData ad, MateriaData md, InscripcionData id) {
        initComponents();
        this.ad = ad;
        this.md = md;
        this.id = id;
        comboAlumno();
        armarTabla();
        jBInscribir.setEnabled(false);
        jBAnular.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMaterias = new javax.swing.JTable();
        jBAnular = new javax.swing.JButton();
        jBInscribir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRMatIns = new javax.swing.JRadioButton();
        jRMatNIns = new javax.swing.JRadioButton();

        setMinimumSize(new java.awt.Dimension(600, 650));

        jTMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTMaterias);

        jBAnular.setText("Anular Inscripcion");
        jBAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularActionPerformed(evt);
            }
        });

        jBInscribir.setText("Inscribir");
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281)
                        .addComponent(jBAnular)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Seleccione un alumno:");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setText("Listado de Materias");

        buttonGroup1.add(jRMatIns);
        jRMatIns.setText("Materias Inscriptas");
        jRMatIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMatInsActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRMatNIns);
        jRMatNIns.setText("Materias No Inscriptas");
        jRMatNIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMatNInsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(90, 90, 90)
                .addComponent(jCAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jRMatIns)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRMatNIns))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(jLabel1))))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRMatIns, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRMatNIns, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRMatInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMatInsActionPerformed
        // TODO add your handling code here:

        borrarFilas();
        actualizarTabla();
        jBInscribir.setEnabled(false);
        jBAnular.setEnabled(true);
    }//GEN-LAST:event_jRMatInsActionPerformed

    private void jRMatNInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMatNInsActionPerformed
        // TODO add your handling code here:

        borrarFilas();
        actualizarTabla();
        jBInscribir.setEnabled(true);
        jBAnular.setEnabled(false);
    }//GEN-LAST:event_jRMatNInsActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTMaterias.getSelectedRow();
        int idMateria;
        if (filaSeleccionada != -1) {
            Object valor = jTMaterias.getValueAt(filaSeleccionada, 0);
            idMateria = (int) valor;
            materias = md.buscarMateria(idMateria);
            inscripcion = new Inscripcion(alumnos, materias);
            id.guardarInscripcion(inscripcion);

            borrarFilas();
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Materia");
        }
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTMaterias.getSelectedRow();
        int idMateria;
        int idAlumno;
        if (filaSeleccionada != -1) {
            Object valor = jTMaterias.getValueAt(filaSeleccionada, 0);
            idMateria = (int) valor;
            int index = jCAlumnos.getSelectedIndex();
            idAlumno = jCAlumnos.getItemAt(index).getIdAlumno();

            id.borrarInscripcionMateriaAlumno(idAlumno, idMateria);

            borrarFilas();
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Materia");
        }
    }//GEN-LAST:event_jBAnularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAnular;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JComboBox<Alumno> jCAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRMatIns;
    private javax.swing.JRadioButton jRMatNIns;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMaterias;
    // End of variables declaration//GEN-END:variables

    private void actualizarTabla() {
        int index = jCAlumnos.getSelectedIndex();
        alumnos = jCAlumnos.getItemAt(index);
        if (jRMatIns.isSelected()) {
            listMaterias = id.obtenerMateriasCursadas(alumnos.getIdAlumno());
            listMaterias.forEach((materia) -> {
                modelo.addRow(new Object[]{
                    materia.getIdMateria(),
                    materia.getNombre(),
                    materia.getAnioMateria()
                });
            });

        }
        if (jRMatNIns.isSelected()) {
            listMaterias = id.obtenerMateriasNoCursadas(alumnos.getIdAlumno());
            listMaterias.forEach((materia) -> {
                modelo.addRow(new Object[]{
                    materia.getIdMateria(),
                    materia.getNombre(),
                    materia.getAnioMateria()
                });
            });

        }
    }

    private void comboAlumno() {
        listAlumnos = ad.listarAlumnos();
        DefaultComboBoxModel<Alumno> model = new DefaultComboBoxModel<>();
        listAlumnos.forEach((alumno) -> {
            model.addElement(alumno);
        });
        jCAlumnos.setModel(model);
    }

    private void armarTabla() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jTMaterias.setModel(modelo);
    }

    private void borrarFilas() {
        int filas = jTMaterias.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
