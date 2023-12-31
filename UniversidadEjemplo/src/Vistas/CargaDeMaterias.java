
package Vistas;

import AccesoADatos.MateriaData;
import Entidades.Materia;
import javax.swing.JOptionPane;


public class CargaDeMaterias extends javax.swing.JPanel {

    
    public CargaDeMaterias() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlMaterias = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jlCodigo = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTCodigo = new javax.swing.JTextField();
        jBEliminar = new javax.swing.JButton();
        jlNombre = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jlEstado = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jlAno = new javax.swing.JLabel();
        jTAño = new javax.swing.JTextField();
        jREstado = new javax.swing.JRadioButton();

        setMinimumSize(new java.awt.Dimension(600, 650));

        jlMaterias.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jlMaterias.setText("Formulario de Materias");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jlCodigo.setText("Codigo:");

        jTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.setMaximumSize(new java.awt.Dimension(80, 30));
        jBEliminar.setMinimumSize(new java.awt.Dimension(80, 30));
        jBEliminar.setPreferredSize(new java.awt.Dimension(80, 30));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jlNombre.setText("Nombre:");

        jBNuevo.setText("Nuevo");
        jBNuevo.setMaximumSize(new java.awt.Dimension(80, 30));
        jBNuevo.setMinimumSize(new java.awt.Dimension(80, 30));
        jBNuevo.setPreferredSize(new java.awt.Dimension(80, 30));
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jlEstado.setText("Estado");

        jBGuardar.setText("Guardar");
        jBGuardar.setMaximumSize(new java.awt.Dimension(80, 30));
        jBGuardar.setMinimumSize(new java.awt.Dimension(80, 30));
        jBGuardar.setPreferredSize(new java.awt.Dimension(80, 30));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jlAno.setText("Año:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCodigo)
                            .addComponent(jlAno)
                            .addComponent(jlEstado)
                            .addComponent(jlNombre))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jBBuscar))
                            .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jREstado))
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlMaterias)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlMaterias)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAno)
                    .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlEstado)
                    .addComponent(jREstado))
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        MateriaData buscar = new MateriaData();

        try {

            int id = Integer.parseInt(jTCodigo.getText());
            Materia materia = buscar.buscarMateria(id);
            if (materia != null) {

                jTNombre.setText(materia.getNombre());
                jTAño.setText(Integer.toString(materia.getAnioMateria()));
                jREstado.setSelected(materia.isActivo());

            }

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Por favor recuerde ingresar solo numeros enteros en Codigo");

        }

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoActionPerformed
   
    }//GEN-LAST:event_jTCodigoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        MateriaData eliminar = new MateriaData();

        try {

            int id = Integer.parseInt(jTCodigo.getText());
            eliminar.eliminarMateria(id);

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros enteros en 'Codigo'");

        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed

        jTCodigo.setText("");
        jTNombre.setText("");
        jTAño.setText("");
        jREstado.setSelected(false);

    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        boolean resultado;
        MateriaData guardar = new MateriaData();
        Materia materia = new Materia();

        try {

            materia.setNombre(jTNombre.getText());
            materia.setAnioMateria(Integer.parseInt(jTAño.getText()));
            materia.setActivo(jREstado.isSelected());
            try {

                materia.setIdMateria(Integer.parseInt(jTCodigo.getText()));
                resultado = true;

            } catch (NumberFormatException ex) {

                resultado = false;

            }
            if (resultado) {

                guardar.modificarMateria(materia);

            } else {

                guardar.guardarMateria(materia);

            }

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros enteros en 'Año'");

        }
    }//GEN-LAST:event_jBGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextField jTAño;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JLabel jlAno;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlMaterias;
    private javax.swing.JLabel jlNombre;
    // End of variables declaration//GEN-END:variables
}
