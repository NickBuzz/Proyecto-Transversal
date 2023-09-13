/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;

/**
 *
 * @author Oking
 */
public class Menu extends javax.swing.JFrame {

    private AlumnoData ad;
    private MateriaData md;
    private InscripcionData id;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        ad = new AlumnoData();
        md = new MateriaData();
        id = new InscripcionData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMFormAlum = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMFormMat = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMInscripciones = new javax.swing.JMenuItem();
        jMNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMAlumnoXMat = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1077, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumnos");

        jMFormAlum.setText("Formulario de Alumnos");
        jMFormAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormAlumActionPerformed(evt);
            }
        });
        jMenu1.add(jMFormAlum);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        jMFormMat.setText("Formulario de Materia");
        jMFormMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormMatActionPerformed(evt);
            }
        });
        jMenu2.add(jMFormMat);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administración");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMInscripciones.setText("Manejo de Inscripciones");
        jMInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInscripcionesActionPerformed(evt);
            }
        });
        jMenu3.add(jMInscripciones);

        jMNotas.setText("Manipulacion de Notas");
        jMNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMNotasActionPerformed(evt);
            }
        });
        jMenu3.add(jMNotas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        jMAlumnoXMat.setText("Alumnos por Materia");
        jMAlumnoXMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlumnoXMatActionPerformed(evt);
            }
        });
        jMenu4.add(jMAlumnoXMat);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInscripcionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioDeInscripcion fi = new FormularioDeInscripcion(ad, md, id);
        fi.setVisible(true);
        escritorio.add(fi);
        escritorio.moveToFront(fi);
    }//GEN-LAST:event_jMInscripcionesActionPerformed

    private void jMFormAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormAlumActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CargaDeAlumnos ca = new CargaDeAlumnos(ad);
        ca.setVisible(true);
        escritorio.add(ca);
        escritorio.moveToFront(ca);
    }//GEN-LAST:event_jMFormAlumActionPerformed

    private void jMFormMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormMatActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CargaDeMaterias cm = new CargaDeMaterias();
        cm.setVisible(true);
        escritorio.add(cm);
        escritorio.moveToFront(cm);
    }//GEN-LAST:event_jMFormMatActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMNotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CargaDeNotas cn = new CargaDeNotas();
        cn.setVisible(true);
        escritorio.add(cn);
        escritorio.moveToFront(cn);
    }//GEN-LAST:event_jMNotasActionPerformed

    private void jMAlumnoXMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlumnoXMatActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ListadoDeAlumnosPorMateria lam = new ListadoDeAlumnosPorMateria();
        lam.setVisible(true);
        escritorio.add(lam);
        escritorio.moveToFront(lam);
    }//GEN-LAST:event_jMAlumnoXMatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMAlumnoXMat;
    private javax.swing.JMenuItem jMFormAlum;
    private javax.swing.JMenuItem jMFormMat;
    private javax.swing.JMenuItem jMInscripciones;
    private javax.swing.JMenuItem jMNotas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
