package practico_6.formularios;

import javax.swing.JOptionPane;
import practico_6.entidades.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class BorrarClientes extends javax.swing.JInternalFrame {
    private Directorio directorio;
    /**
     * Creates new form Agregar_clientes
     */
    public BorrarClientes(Directorio directorio) {
        this.directorio = directorio;
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

        dni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ciudad = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setTitle("Eliminar Clientes");
        setNextFocusableComponent(dni);
        setPreferredSize(new java.awt.Dimension(610, 340));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        dni.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dni.setName(""); // NOI18N
        dni.setNextFocusableComponent(jbBuscar);
        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("DNI");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("APELLIDO");

        apellido.setEditable(false);
        apellido.setBackground(new java.awt.Color(255, 255, 204));
        apellido.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("CIUDAD");

        ciudad.setEditable(false);
        ciudad.setBackground(new java.awt.Color(255, 255, 204));
        ciudad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        nombre.setEditable(false);
        nombre.setBackground(new java.awt.Color(255, 255, 204));
        nombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("TELEFONO");

        telefono.setEditable(false);
        telefono.setBackground(new java.awt.Color(255, 255, 204));
        telefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jbSalir.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setNextFocusableComponent(dni);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jbSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbSalirKeyPressed(evt);
            }
        });

        jbBorrar.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jbBorrar.setText("Borrar");
        jbBorrar.setNextFocusableComponent(jbSalir);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        jbBorrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbBorrarKeyPressed(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.setNextFocusableComponent(jbBorrar);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jbBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbBuscarKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("DIRECCION");

        direccion.setEditable(false);
        direccion.setBackground(new java.awt.Color(255, 255, 204));
        direccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(nombre))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telefono)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ciudad)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(direccion)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        long nDni = Long.parseLong(dni.getText());
        String tel = telefono.getText();
        String ape = apellido.getText();
        String nom = nombre.getText();
        String ciu = ciudad.getText();
        String dir = direccion.getText();
        int opcion = JOptionPane.showConfirmDialog(null, "Se borrará el cliente\nDNI: "+nDni+"\nNombre: "+ape+", "+nom+"\nCiudad: "+ciu+"\nTelefono: "+tel+"\ndirección: "+dir,
                "Confirme los datos", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        switch (opcion) {
            case 0:
                directorio.borrarCliente(nDni);
                JOptionPane.showMessageDialog(this, "Datos borrados correctamente");
                telefono.setText("");
                apellido.setText("");
                nombre.setText("");
                ciudad.setText("");
                direccion.setText("");

                break;
            case 1:
                break;
        }
        dni.setText("");
        dni.setFocusable(true);
        dni.requestFocusInWindow();
        dni.requestFocus(true);
        dni.requestFocus();

    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        long nDni = 0;
        try {
            nDni = Long.parseLong(dni.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,  "Usted no ingresó un nro de correcto de Dni ",
                "ERROR!", JOptionPane.ERROR_MESSAGE);
            dni.selectAll();
            dni.setFocusable(true);
            dni.requestFocusInWindow();
            dni.requestFocus(true);
            dni.requestFocus();
            return;
        }
        if (directorio.buscarClienteDni(nDni)==null) {
            JOptionPane.showMessageDialog(this,  "No se encontró ningun cliente",
                    "ERROR!", JOptionPane.ERROR_MESSAGE);
            dni.selectAll();
            dni.setFocusable(true);
            dni.requestFocusInWindow();
            dni.requestFocus(true);
            dni.requestFocus();
        } else {
            apellido.setText(directorio.buscarClienteDni(nDni).getApellido());
            telefono.setText(directorio.buscarTelefono(apellido.getText()).firstEntry().getKey()+"");
            nombre.setText(directorio.buscarClienteDni(nDni).getNombre());
            ciudad.setText(directorio.buscarClienteDni(nDni).getCiudad());
            direccion.setText(directorio.buscarClienteDni(nDni).getDomicilio());
            dni.setText(directorio.buscarClienteDni(nDni).getDni()+"");
            jbBorrar.setFocusable(true);
            jbBorrar.requestFocusInWindow();
            jbBorrar.requestFocus(true);
            jbBorrar.requestFocus();
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        jbBuscar.setFocusable(true);
        jbBuscar.requestFocusInWindow();
        jbBuscar.requestFocus(true);
        jbBuscar.requestFocus();        
    }//GEN-LAST:event_dniActionPerformed

    private void jbSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbSalirKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER) dispose();        
    }//GEN-LAST:event_jbSalirKeyPressed

    private void jbBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbBuscarKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER) jbBuscar.doClick();
    }//GEN-LAST:event_jbBuscarKeyPressed

    private void jbBorrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbBorrarKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER) jbBorrar.doClick();
    }//GEN-LAST:event_jbBorrarKeyPressed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        dni.setFocusable(true);
        dni.requestFocusInWindow();
        dni.requestFocus(true);
        dni.requestFocus();
    }//GEN-LAST:event_formFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}