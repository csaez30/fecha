/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;
import modelo.AlumnoData;
import modelo.Conexion;
import modelo.Cursada;
import modelo.CursadaData;
import modelo.Materia;
import modelo.MateriaData;

/**
 *
 * @author cris
 */
public class VistaAlumnosXMateria extends javax.swing.JInternalFrame {
private DefaultTableModel modelo;
private ArrayList<Cursada> listaCursada;
private ArrayList<Materia> listaMaterias;
private ArrayList<Alumno> listaAlumnos;
private CursadaData cursadaData;
private MateriaData materiaData;
private AlumnoData alumnoData;

private Conexion conexion;
   


    public VistaAlumnosXMateria() {
        initComponents();
        
         conexion = new Conexion();
        modelo=new DefaultTableModel();
        cursadaData = new CursadaData(conexion);
        listaCursada =(ArrayList)cursadaData.OtetenerCursada();
        materiaData = new MateriaData(conexion);
        listaMaterias =(ArrayList)materiaData.obtenerMaterias();
        alumnoData=new AlumnoData(conexion);
        listaAlumnos=(ArrayList)alumnoData.OtetenerAlumnos();
        //Método encargado de llenar el combobox
        cargaMaterias();
        armaCabeceraTabla();
        cargaDatos();
        
    }

  void cargaMaterias(){
    
   for (Materia it:listaMaterias){
      
      cbMateria.addItem((Materia)it);
  
  }
  }
    
  void  armaCabeceraTabla(){
  
    ArrayList<Object> col = new ArrayList<Object>();
    col.add("Código");
    col.add("Nombre");
    col.add("Nota");
    
    
    for(Object it:col){
       modelo.addColumn(it);
    
    }
  
  tAlumnos.setModel(modelo);
  }
    
   public void borraFilasTabla(){

            int a =modelo.getRowCount()-1;
            System.out.println("Tabla "+a);
            for(int i=a;i>=0;i--){
                modelo.removeRow(i );
                System.out.println("Tabla "+i);
            }
      }
   void cargaDatos(){
      Materia mat = (Materia)cbMateria.getSelectedItem();
      
      for (Cursada m:listaCursada){
    
        if (m.getMateria().getId()== mat.getId()){
        
           modelo.addRow(new Object[]{m.getAlumno().getId(),m.getAlumno().getNombre(),m.getNota()});
   
       }
   }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlumnos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Alumnos por Materia");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Materia:");

        cbMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMateriaActionPerformed(evt);
            }
        });

        tAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tAlumnos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(26, 26, 26)
                            .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> cbMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tAlumnos;
    // End of variables declaration//GEN-END:variables
}
