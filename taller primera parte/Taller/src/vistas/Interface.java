/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author RocaVero
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
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

        jFrameAgregar = new javax.swing.JFrame();
        jLabelFondoAgregar = new javax.swing.JLabel();
        jLabelFondoInterface = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuCliente = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuVer = new javax.swing.JMenu();

        jFrameAgregar.setMaximumSize(new java.awt.Dimension(400, 300));
        jFrameAgregar.setPreferredSize(new java.awt.Dimension(900, 400));
        jFrameAgregar.setResizable(false);

        jLabelFondoAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper gris.png"))); // NOI18N
        jLabelFondoAgregar.setMaximumSize(new java.awt.Dimension(400, 300));
        jLabelFondoAgregar.setPreferredSize(new java.awt.Dimension(400, 300));
        jFrameAgregar.getContentPane().add(jLabelFondoAgregar, java.awt.BorderLayout.PAGE_START);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFondoInterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper gris.png"))); // NOI18N
        getContentPane().add(jLabelFondoInterface, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuArchivo.setText("Archivo");

        jMenuCliente.setText("Cliente");

        jMenuItem1.setText("Agregar Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenuCliente.add(jMenuItem2);

        jMenuArchivo.add(jMenuCliente);

        jMenuBar1.add(jMenuArchivo);

        jMenuVer.setText("Ver");
        jMenuBar1.add(jMenuVer);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jFrameAgregar.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrameAgregar;
    private javax.swing.JLabel jLabelFondoAgregar;
    private javax.swing.JLabel jLabelFondoInterface;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenuVer;
    // End of variables declaration//GEN-END:variables
}
