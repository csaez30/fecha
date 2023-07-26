
package atencionpacientes;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class VistaListaPacientes extends javax.swing.JInternalFrame {
ArrayList<Paciente> lista = new ArrayList<>();

DefaultTableModel modelo= new DefaultTableModel();    
  
    
    public VistaListaPacientes() {
        initComponents();
        lista =(ArrayList)Menu.getTurno().otenerPacientes();
      
        //cargaCombo();// carga alumnos en el combo
        armaCabeceraTabla();
        cargaDatos();
    }

    
    
     public void armaCabeceraTabla(){
  
        //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("Nombre");
        columnas.add("DNI");
        
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
   tPaciente.setModel(modelo);
  }
      
      public void borraFilasTabla(){

            int a =modelo.getRowCount()-1;
          ;
            for(int i=a;i>=0;i--){
                modelo.removeRow(i );
                
            }
      }
      public void cargaCombo(){
         for(Paciente p:lista){
         jComboPacientes.addItem(p.getTipo());
         
         }
     }
      
       public void cargaDatos(){
        //Llenar filas
        String seleccionada = (String)jComboPacientes.getSelectedItem();
        for(Paciente p:lista){
        if (seleccionada.equals(p.getTipo()))
            modelo.addRow(new Object[]{p.getNombre(),p.getDni()});
        }
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboPacientes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPaciente = new javax.swing.JTable();

        jComboPacientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "critico", "leve", "medio" }));
        jComboPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPacientesActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de Pacientes");

        tPaciente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tPaciente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPacientesActionPerformed
        // TODO add your handling code here:
        borraFilasTabla();
        cargaDatos();
    }//GEN-LAST:event_jComboPacientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tPaciente;
    // End of variables declaration//GEN-END:variables
}
