package accesoabasededatos.vistas;

import accesoabasededatos.modelo.Alumno;
import accesoabasededatos.modelo.AlumnoData;
import accesoabasededatos.modelo.Conexion;
import accesoabasededatos.modelo.Cursada;
import accesoabasededatos.modelo.CursadaData;
import accesoabasededatos.modelo.Materia;
import accesoabasededatos.modelo.MateriaData;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaDeInscripcion3 extends javax.swing.JInternalFrame {
private CursadaData cursadaData;
private MateriaData materiaData;
private AlumnoData alumnoData;
private Conexion conexion;
private List<Alumno> listaAlumnos;
private DefaultTableModel modelo;    
    public VistaDeInscripcion3() {
    initComponents();
    modelo=new DefaultTableModel();    
    try {
        conexion=new Conexion();
        AlumnoData ad=new AlumnoData(conexion);
        listaAlumnos=ad.obtenerAlumnos();
        for(Alumno xx:listaAlumnos){
        
            cbAlumnos.addItem(xx);
        }
        
        
    } catch (ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Error de Conexion");
    }
    armarCabecera();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rbInscriptas = new javax.swing.JRadioButton();
        rbNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        btInscribir = new javax.swing.JButton();
        btAnular = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("FORMULARIO DE INSCRIPCION");

        jLabel2.setText("ALUMNO");

        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("LISTADO DE MATERIAS");

        rbInscriptas.setText("Inscriptas");
        rbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInscriptasActionPerformed(evt);
            }
        });

        rbNoInscriptas.setText("No Inscriptas");
        rbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoInscriptasActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtMaterias);

        btInscribir.setText("Inscribir");
        btInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscribirActionPerformed(evt);
            }
        });

        btAnular.setText("Anular Inscripción");
        btAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnularActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(rbInscriptas)
                        .addGap(55, 55, 55)
                        .addComponent(rbNoInscriptas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btInscribir)
                        .addGap(52, 52, 52)
                        .addComponent(btAnular)
                        .addGap(44, 44, 44)
                        .addComponent(btSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbInscriptas)
                    .addComponent(rbNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInscribir)
                    .addComponent(btAnular)
                    .addComponent(btSalir))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInscriptasActionPerformed
        // TODO add your handling code here:
        rbNoInscriptas.setSelected(false);
        borrarFilas();
        cargarMateriasInscriptas();
        btInscribir.setEnabled(false);
        btAnular.setEnabled(true);
    }//GEN-LAST:event_rbInscriptasActionPerformed

    private void rbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoInscriptasActionPerformed
    rbInscriptas.setSelected(false);
    borrarFilas();
    cargarMateriasNoCursadas();
    btInscribir.setEnabled(true);
    btAnular.setEnabled(false);
    }//GEN-LAST:event_rbNoInscriptasActionPerformed

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        borrarFilas();
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void btInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscribirActionPerformed
        int fs=jtMaterias.getSelectedRow();            
        if(fs!=-1){
            //Recupero el alumno seleccionado del combobox
            Alumno a=(Alumno)cbAlumnos.getSelectedItem();          
            //REcupero los datos de la tabla de la fila seleccionada
            int idMateria=(Integer)modelo.getValueAt(fs,0);
            String nombreMateria=(String)modelo.getValueAt(fs,1);           
            Materia m=new Materia(idMateria,nombreMateria);
            Cursada c=new Cursada(a,m,0);
            CursadaData cd=new CursadaData(conexion);
            cd.guardarCursada(c);
            borrarFilas();
         }
        
    }//GEN-LAST:event_btInscribirActionPerformed

    private void btAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnularActionPerformed
        int fs=jtMaterias.getSelectedRow();
        if(fs!=-1){               
            Alumno a=(Alumno)cbAlumnos.getSelectedItem();                        
            int idMateria=(Integer)modelo.getValueAt(fs,0);            
            CursadaData cd=new CursadaData(conexion);
            cd.borrarCursadaDeUnaMateriaDeunAlumno(a.getId(), idMateria);
            borrarFilas();      
        }              
    }//GEN-LAST:event_btAnularActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnular;
    private javax.swing.JButton btInscribir;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtMaterias;
    private javax.swing.JRadioButton rbInscriptas;
    private javax.swing.JRadioButton rbNoInscriptas;
    // End of variables declaration//GEN-END:variables

private void armarCabecera(){
ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Nombre");
        for(Object it:columnas){        
            modelo.addColumn(it);
        }
        jtMaterias.setModel(modelo);
}

private void borrarFilas(){
    int a =modelo.getRowCount()-1;
    for(int i=a;i>=0;i--){   
        modelo.removeRow(i );
    }
//    rbNoInscriptas.setSelected(false);
//    rbInscriptas.setSelected(false);
}

private void cargarMateriasInscriptas(){
            borrarFilas(); 
        //Llenar filas   
        CursadaData cd =new CursadaData(conexion);
        Alumno seleccionado=(Alumno)cbAlumnos.getSelectedItem();
        List<Materia> listaMaterias = 
        cd.obtenerMateriasCursadas(seleccionado.getId());        
        for(Materia m:listaMaterias){        
        modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre()});
        }
}
private void cargarMateriasNoCursadas(){
         borrarFilas();   
        //Llenar filas   
        CursadaData cd =new CursadaData(conexion);
        Alumno seleccionado=(Alumno)cbAlumnos.getSelectedItem();
        List<Materia> listaMaterias = 
        cd.obtenerMateriasNOCursadas(seleccionado.getId());        
        for(Materia m:listaMaterias){        
        modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre()});
        }
}

}
