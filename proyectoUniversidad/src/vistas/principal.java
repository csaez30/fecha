/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author cris
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mAlumnos = new javax.swing.JMenuItem();
        menuMaterias = new javax.swing.JMenu();
        mMaterias = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mAlumnosMaterias = new javax.swing.JMenuItem();
        mListadoMaterias = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        mArchivo.setText("Archivo");

        mSalir.setText("Salir");
        mArchivo.add(mSalir);

        jMenuBar1.add(mArchivo);

        jMenu2.setText("Alumnos");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        mAlumnos.setText("Formulario de Alumnos");
        mAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAlumnosActionPerformed(evt);
            }
        });
        jMenu2.add(mAlumnos);

        jMenuBar1.add(jMenu2);

        menuMaterias.setText("Materias");

        mMaterias.setText("Formulario de Materias");
        mMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMateriasActionPerformed(evt);
            }
        });
        menuMaterias.add(mMaterias);

        jMenuBar1.add(menuMaterias);

        jMenu4.setText("Cursadas");

        jMenuItem2.setText("Formulario de Cursadas");
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Listados");

        mAlumnosMaterias.setText("Listado de Alumnos por Materia");
        mAlumnosMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAlumnosMateriasActionPerformed(evt);
            }
        });
        jMenu3.add(mAlumnosMaterias);

        mListadoMaterias.setText("Listado de Materias");
        jMenu3.add(mListadoMaterias);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAlumnosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        vistaAlumnos va=new vistaAlumnos();
        va.setVisible(true);
        escritorio.add(va);
        escritorio.moveToFront(va);
    }//GEN-LAST:event_mAlumnosActionPerformed

    private void mMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mMateriasActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void mAlumnosMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAlumnosMateriasActionPerformed
        // TODO add your handling code here:
         escritorio.removeAll();
        escritorio.repaint();
        VistaAlumnosXMateria vam=new VistaAlumnosXMateria();
        vam.setVisible(true);
        escritorio.add(vam);
        escritorio.moveToFront(vam);
    }//GEN-LAST:event_mAlumnosMateriasActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mAlumnos;
    private javax.swing.JMenuItem mAlumnosMaterias;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenuItem mListadoMaterias;
    private javax.swing.JMenuItem mMaterias;
    private javax.swing.JMenuItem mSalir;
    private javax.swing.JMenu menuMaterias;
    // End of variables declaration//GEN-END:variables
}