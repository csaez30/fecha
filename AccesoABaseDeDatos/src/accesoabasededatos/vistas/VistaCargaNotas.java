/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoabasededatos.vistas;


import accesoabasededatos.modelo.Alumno;
import accesoabasededatos.modelo.AlumnoData;
import accesoabasededatos.modelo.Conexion;
import accesoabasededatos.modelo.Cursada;
import accesoabasededatos.modelo.CursadaData;
import accesoabasededatos.modelo.Materia;
import accesoabasededatos.modelo.MateriaData;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class VistaCargaNotas extends javax.swing.JInternalFrame {
  private DefaultTableModel modelo;
private ArrayList<Cursada> listaCursada;
private ArrayList<Materia> listaMaterias;
private CursadaData cursadaData;
private MateriaData materiaData;
private AlumnoData alumnoData;
private ArrayList<Alumno> listaAlumnos;
private Conexion conexion;
    /**
     * Creates new form VistaCargaNotas
     */
    public VistaCargaNotas() {
        initComponents();
              
    
        modelo=new DefaultTableModel();
        
        cursadaData = new CursadaData();
        listaCursada =(ArrayList)cursadaData.obtenerCursadas();
        
        materiaData = new MateriaData();
        listaMaterias =(ArrayList)materiaData.obtenerMaterias();
        
        alumnoData=new AlumnoData();
        listaAlumnos=(ArrayList)alumnoData.obtenerAlumnos();
        cargaAlumnos();//carga combo
        armaCabeceraTabla();
        cargaDatos();//llena tabla con materias cursadas por alumnos
        
     
    }
        
      public void armaCabeceraTabla(){
  
        //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Materia");
        columnas.add("Nota");
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        tNotas.setModel(modelo);
  }
      
      public void borraFilasTabla(){

            int a =modelo.getRowCount()-1;
            System.out.println("Tabla "+a);
            for(int i=a;i>=0;i--){
                modelo.removeRow(i );
                
            }
      }
      
       public void cargaDatos(){
        //Llenar filas
         CursadaData cd =new CursadaData();
        Alumno seleccionado=(Alumno)cbAlumnos.getSelectedItem();
        listaCursada= (ArrayList)cd.obtenerCursadasXAlumno(seleccionado.getId());
        
        for(Cursada m:listaCursada){
        
            modelo.addRow(new Object[]{m.getMateria().getId(),m.getMateria().getNombre(),m.getNota()});
        }
        
        
    }
      
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tNotas = new javax.swing.JTable();
        btGuardar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARGA DE NOTAS");

        jLabel2.setText("ALUMNO");

        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        tNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tNotas);

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btGuardar)
                        .addGap(39, 39, 39)
                        .addComponent(btCancelar)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btCancelar))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        // TODO add your handling code here:
        borraFilasTabla();
        cargaDatos();
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        // TODO add your handling code here:
        
        int filaSeleccionada=tNotas.getSelectedRow();
        if(filaSeleccionada!=-1){
        
            
            Alumno a=(Alumno)cbAlumnos.getSelectedItem();
            
            System.out.println("alumno "+a);
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada,0);
            String n=(String)modelo.getValueAt(filaSeleccionada,2);
            System.out.println("idMateria y nota "+idMateria+" "+n);
            int nota= Integer.parseInt(n);
            System.out.println("nota "+nota);
            CursadaData cd=new CursadaData();
            cd.actualizarNotaCursada(a.getId(), idMateria,nota);
            borraFilasTabla();
      
        }
    }//GEN-LAST:event_btGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tNotas;
    // End of variables declaration//GEN-END:variables
public void cargaAlumnos(){
  
    for(Alumno item:listaAlumnos){
            cbAlumnos.addItem(item);
    }

}
}