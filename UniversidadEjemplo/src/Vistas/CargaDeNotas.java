
package Vistas;

import javax.swing.table.DefaultTableModel;
import Entidades.Alumno;
import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import Entidades.Inscripcion;
import java.util.List;
import javax.swing.JOptionPane;

public class CargaDeNotas extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int fila, int columna) {
            if (columna == 2) {
                return true;
            }
            return false;
        }
    };
    
    public CargaDeNotas() {
        initComponents();
        cargarCabecera();
        cargarCombo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlCargaDeNotas = new javax.swing.JLabel();
        jlSeleccioneUnAlumno = new javax.swing.JLabel();
        jCAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTNotasxMateria = new javax.swing.JTable();
        jBGuardar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(600, 650));

        jlCargaDeNotas.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jlCargaDeNotas.setText("Manipulación de Notas");

        jlSeleccioneUnAlumno.setText("Seleccione un alumno: ");

        jCAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAlumnosActionPerformed(evt);
            }
        });

        jTNotasxMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTNotasxMateria);

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlCargaDeNotas)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jlSeleccioneUnAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(84, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlCargaDeNotas)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSeleccioneUnAlumno)
                    .addComponent(jCAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAlumnosActionPerformed

        borrarFilas();
        InscripcionData id = new InscripcionData();
        int index = jCAlumnos.getSelectedIndex();
        Alumno alumnoSeleccionado = jCAlumnos.getItemAt(index);

        List<Inscripcion> listIns = id.obtenerInscripcionesPorAlumno(alumnoSeleccionado.getIdAlumno());

        listIns.forEach((Inscripcion) -> {

            modelo.addRow(new Object[]{
                Inscripcion.getMateria().getIdMateria(),
                Inscripcion.getMateria().getNombre(),
                Inscripcion.getNota()
            });

        });
    }//GEN-LAST:event_jCAlumnosActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        InscripcionData id = new InscripcionData();
        Alumno alumnoSeleccionado = (Alumno) jCAlumnos.getSelectedItem();
        int filaS = jTNotasxMateria.getSelectedRow();
        if (filaS == -1) {

            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla");
            return;

        }

        try {

            int idMateria = (Integer) jTNotasxMateria.getValueAt(filaS, 0);
            double nota = Double.parseDouble((String) jTNotasxMateria.getValueAt(filaS, 2));
            if (nota > 10 || nota < 0) {

                JOptionPane.showMessageDialog(null, "La nota debe oscilar entre 0 y 10");
                return;

            }
            id.actualizarNota(alumnoSeleccionado.getIdAlumno(), idMateria, nota);

        } catch (NullPointerException ex) {

            JOptionPane.showMessageDialog(null, "La columna 'nota' esta vacio");

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Ingrese un numero valido en 'nota'");

        }

        JOptionPane.showMessageDialog(null, "Se a modificado la nota con exito");
    }//GEN-LAST:event_jBGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox<Alumno> jCAlumnos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTNotasxMateria;
    private javax.swing.JLabel jlCargaDeNotas;
    private javax.swing.JLabel jlSeleccioneUnAlumno;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {

        AlumnoData ad = new AlumnoData();
        List<Alumno> listaAlumnos = ad.listarAlumnos();
        for (int i = 0; i < listaAlumnos.size(); i++) {
            jCAlumnos.addItem(listaAlumnos.get(i));
        }

    }

    private void cargarCabecera() {

        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        jTNotasxMateria.setModel(modelo);

    }

    private void borrarFilas() {

        int filas = jTNotasxMateria.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }

    }
}
