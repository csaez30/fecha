/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.vistas;

/**
 *
 * @author tetid
 */
public class VistaMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form vistaMenuPrincipal
     */
    public VistaMenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mFormularioMaterias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mFormularioAlumnos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mManejoInscripciones = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mManipulacionNotas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mListadoAlumnosXMateria = new javax.swing.JMenuItem();
        mListadoAlumnos = new javax.swing.JMenuItem();
        mListadoMaterias = new javax.swing.JMenuItem();

        jMenu6.setText("jMenu6");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        mSalir.setText("Salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materias");

        mFormularioMaterias.setText("Formulario de Materia");
        mFormularioMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFormularioMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(mFormularioMaterias);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Alumnos");

        mFormularioAlumnos.setText("Formulario de Alumnos");
        mFormularioAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFormularioAlumnosActionPerformed(evt);
            }
        });
        jMenu3.add(mFormularioAlumnos);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Inscripciones");

        mManejoInscripciones.setText("Manejo de Inscripciones");
        mManejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mManejoInscripcionesActionPerformed(evt);
            }
        });
        jMenu4.add(mManejoInscripciones);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Carga de Notas");

        mManipulacionNotas.setText("Manipulacion de Notas");
        mManipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mManipulacionNotasActionPerformed(evt);
            }
        });
        jMenu5.add(mManipulacionNotas);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Consultas");

        mListadoAlumnosXMateria.setText("Listado de Alumnos por Materia");
        mListadoAlumnosXMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListadoAlumnosXMateriaActionPerformed(evt);
            }
        });
        jMenu7.add(mListadoAlumnosXMateria);

        mListadoAlumnos.setText("Listado de Alumnnos");
        mListadoAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListadoAlumnosActionPerformed(evt);
            }
        });
        jMenu7.add(mListadoAlumnos);

        mListadoMaterias.setText("Listado de Materias");
        mListadoMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListadoMateriasActionPerformed(evt);
            }
        });
        jMenu7.add(mListadoMaterias);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mSalirActionPerformed

    private void mListadoAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListadoAlumnosActionPerformed
        // TODO add your handling code here:        
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumnoss va = new VistaAlumnoss();
        va.setVisible(true);
        escritorio.add(va);
        escritorio.moveToFront(va);
    }//GEN-LAST:event_mListadoAlumnosActionPerformed

    private void mFormularioAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFormularioAlumnosActionPerformed
        // Creamos la vista
        escritorio.removeAll();
        escritorio.repaint();
        VistaInscripcionAlumno va = new VistaInscripcionAlumno();
        va.setVisible(true);
        escritorio.add(va);
        escritorio.moveToFront(va);
    }//GEN-LAST:event_mFormularioAlumnosActionPerformed

    private void mListadoAlumnosXMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListadoAlumnosXMateriaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumnosMaterias vam = new VistaAlumnosMaterias();
        vam.setVisible(true);
        escritorio.add(vam);
        escritorio.moveToFront(vam);
    }//GEN-LAST:event_mListadoAlumnosXMateriaActionPerformed

    private void mListadoMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListadoMateriasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaMateriass vm = new VistaMateriass();
        vm.setVisible(true);
        escritorio.add(vm);
        escritorio.moveToFront(vm);
    }//GEN-LAST:event_mListadoMateriasActionPerformed

    private void mFormularioMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFormularioMateriasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaInscripcionMateria vm = new VistaInscripcionMateria();
        vm.setVisible(true);
        escritorio.add(vm);
        escritorio.moveToFront(vm);
        
    }//GEN-LAST:event_mFormularioMateriasActionPerformed

    private void mManejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mManejoInscripcionesActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaIncripcionAMateria viam = new VistaIncripcionAMateria();
        viam.setVisible(true);
        escritorio.add(viam);
        escritorio.moveToFront(viam);
    }//GEN-LAST:event_mManejoInscripcionesActionPerformed

    private void mManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mManipulacionNotasActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        escritorio.repaint();
        VistaManipularNotas vmn = new VistaManipularNotas();
        vmn.setVisible(true);
        escritorio.add(vmn);
        escritorio.moveToFront(vmn);
    }//GEN-LAST:event_mManipulacionNotasActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mFormularioAlumnos;
    private javax.swing.JMenuItem mFormularioMaterias;
    private javax.swing.JMenuItem mListadoAlumnos;
    private javax.swing.JMenuItem mListadoAlumnosXMateria;
    private javax.swing.JMenuItem mListadoMaterias;
    private javax.swing.JMenuItem mManejoInscripciones;
    private javax.swing.JMenuItem mManipulacionNotas;
    private javax.swing.JMenuItem mSalir;
    // End of variables declaration//GEN-END:variables
}
