/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.vistas;


import clinicaVeterinaria.modelo.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Usuario
 */
public class VistaVisitas extends javax.swing.JInternalFrame {

private ArrayList<Mascota> listaMascota;
private ArrayList<Tratamiento> listaTrat;
private VisitaData visitaData;
private MascotaData mascotaData;
private TratamientoData tratData;

private Conexion conexion;
    /**
     * Creates new form Inscripciones
     */
    public VistaVisitas() {
        initComponents();
    try {
        conexion = new Conexion("jdbc:mysql://localhost/clinica", "root", "");
    
        
        
        mascotaData = new MascotaData(conexion);
        listaMascota =(ArrayList)mascotaData.obtenerMascotas(); //HACER
        
        TratamientoData  tratData= new TratamientoData(conexion);
        listaTrat =(ArrayList)tratData.obtenerTratamiento();
        
        cargaMascota();
        cargaTratamiento();
        
       } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaVisitas.class.getName()).log(Level.SEVERE, null, ex);
    } 
        
        
       
1    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbTrat = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        cbMascota = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t_fecha = new javax.swing.JTextField();
        t_peso = new javax.swing.JTextField();
        t_detalle = new javax.swing.JTextField();
        btArctualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("FORMULARIO DE VISITAS");

        cbTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTratActionPerformed(evt);
            }
        });

        jLabel2.setText("MASCOTA:");

        btGuardar.setText("GUARDAR");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        cbMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMascotaActionPerformed(evt);
            }
        });

        jLabel3.setText("TRATAMIENTO:");

        jLabel4.setText("FECHA:");

        jLabel5.setText("DETALLLE:");

        jLabel7.setText("PESO ACTUAL:");

        btArctualizar.setText("Actualizar");
        btArctualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArctualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel7))
                                    .addGap(48, 48, 48))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(69, 69, 69)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btGuardar)
                                        .addGap(27, 27, 27)
                                        .addComponent(btArctualizar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t_peso, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(t_fecha)
                            .addComponent(t_detalle, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(cbMascota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbTrat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btSalir)
                                .addGap(60, 60, 60)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btSalir)
                    .addComponent(btArctualizar))
                .addGap(0, 51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        // TODO add your handling code here:
    
       LocalDate fecha = LocalDate.parse(t_fecha.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String detalle= t_detalle.getText();
        double pesoActual= Double.parseDouble(t_peso.getText());
              
       
       
        MascotaData cd= new MascotaData(conexion);
        Mascota mascota = (Mascota) cbMascota.getSelectedItem();
        TratamientoData td= new TratamientoData(conexion);
        Tratamiento trat = (Tratamiento) cbTrat.getSelectedItem();
        Visita visita = new Visita(fecha,detalle,pesoActual,mascota,trat);
       
        visitaData.registrarVisita(visita);
        
        
                                          
    
    
    
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void cbTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTratActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbTratActionPerformed

    private void cbMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMascotaActionPerformed

    private void btArctualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArctualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btArctualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btArctualizar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Mascota> cbMascota;
    private javax.swing.JComboBox<Tratamiento> cbTrat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField t_detalle;
    private javax.swing.JTextField t_fecha;
    private javax.swing.JTextField t_peso;
    // End of variables declaration//GEN-END:variables
  
  
  
  
  



public void cargaMascota(){
    //Carga las materias al ComboBox
     for(Mascota item:listaMascota){
            cbMascota.addItem(item);
    }

}


public void cargaTratamiento(){
    //Carga las materias al ComboBox
     for(Tratamiento item:listaTrat){
            cbTrat.addItem(item);
    }

}

}