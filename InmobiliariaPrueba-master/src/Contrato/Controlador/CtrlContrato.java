/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contrato.Controlador;

import Contrato.Modelo.*;
import Inmueble.Modelo.ConsultasInmueble;
import Inmueble.Modelo.Inmueble;
import Inquilino.Modelo.*;
import Vista.Contrato.FromBuscarInmueble;
import Vista.Contrato.FromBuscarInquilino;
import Vista.Contrato.FromContrato;
import Vista.Contrato.PanelContratoList;
import Vista.Inmueble.PanelInmueble;
import static Vista.Inmueble.PanelInmueble.cargarInmueblesFiltrados;
import Vista.Inquilino.PanelInquilino;
import Vista.fromMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CtrlContrato  implements ActionListener{
    private Contrato contrato;
    private ConsultaContrato consContr;
    private int id_inmueble;
    private int dni_inquilino;
      private Inmueble inmu;
    private Inquilino inqui;
    private FromContrato frmCon;
    private ConsultasInmueble consultaInmueble=new ConsultasInmueble();    
    private ConsultasInquilno consultaInquilino=new ConsultasInquilno();
    private ArrayList<Inmueble> inmuebles=new ArrayList<Inmueble>();
    private ArrayList<Inquilino> inquilinos=new ArrayList<Inquilino>();
    private FromBuscarInmueble tableroBuscarInmueble;
    private FromBuscarInquilino tableroBuscarInquilino = new FromBuscarInquilino();
    
    public CtrlContrato (Contrato con, ConsultaContrato consContr, FromContrato frmCon) {
      
        this.contrato=con;
        this.consContr = consContr;
        this.frmCon = frmCon;
        this.frmCon.jButtonBuscarInmueble.addActionListener(this);
        this.frmCon.jButtonGuardar.addActionListener(this);
        this.frmCon.jButtonBuscarInquilino.addActionListener(this);
        this.frmCon.jButtonEliminar.addActionListener(this);
       // this.frmCon.jButtonModificar.addActionListener(this);
        this.frmCon.jButtonLimpiar.addActionListener(this);
        
    
    }
    
    
  public void iniciar(){
      frmCon.setTitle("Contrato");
      frmCon.setLocationRelativeTo(null);
      //frmP.jtDni.setVisible(true);
      cargarInmueble();
      cargarInquilino();
      
    
      frmCon.setVisible(true);
      frmCon.jButtonEliminar.setEnabled(!frmCon.txtID_contrato.getText().equals(""));
      
        if(inmu != null){
           this.frmCon.jComboBoxInmueble.setSelectedItem(inmu);
      }
       if(inqui != null){
           this.frmCon.jComboBoxInquilino.setSelectedItem(inqui);
      }
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==frmCon.jButtonEliminar){
          
          try{
                 
                    contrato.setId_contrato(Integer.parseInt(frmCon.txtID_contrato.getText()));
                    contrato.setEstado_contrato(frmCon.jComboBoxEstadoContrato.getSelectedItem().toString());
                   
                    if (consContr.Modificar(contrato)){
                        Inmueble inmueble = new Inmueble();
                        ConsultasInmueble consultainm=new ConsultasInmueble();
                        inmueble.setId_inmueble(contrato.getInmueble().getId_inmueble());
                        consultainm.Buscar(inmueble);
                        if(contrato.getEstado_contrato().equals("VIGENTE")){
                            inmueble.setEstado_inmueble("No disponible");
                        }else{
                             inmueble.setEstado_inmueble("Disponible");
                        }
                        consultaInmueble.ModificarEstado(inmueble);
                        JOptionPane.showMessageDialog(null, "Contrato Modificado y Guardado");
                        PanelContratoList.cargarContratos();
              
                    } else{ JOptionPane.showMessageDialog(null, "Error al Modificar");
                           
                    }
                
            }
            catch(Exception num){JOptionPane.showMessageDialog(null, "Dato invalido");
      
            }
      
      }
        
         if (e.getSource()==frmCon.jButtonBuscarInmueble){
               //Boolean flagCerrar = false;
               tableroBuscarInmueble  = new FromBuscarInmueble();
               frmCon.enable(false);
               tableroBuscarInmueble.setLocation(0, 0);
               tableroBuscarInmueble.setVisible(true);
               tableroBuscarInmueble.addWindowListener(new WindowAdapter(){
                    public void windowClosed(WindowEvent we){
                     
                      tableroBuscarInmueble.setVisible(false);
                      id_inmueble = tableroBuscarInmueble.getId_inmueble();
                       frmCon.enable(true);
                       frmCon.setVisible(true);
                       inmuebles.clear();
                       consultaInmueble.obtenerInmuebles(inmuebles);
                       frmCon.jComboBoxInmueble.removeAllItems();
                       cargarInmueble();
                       for(Inmueble inmu:inmuebles ){
                           if(id_inmueble == inmu.getId_inmueble()){
                               frmCon.jComboBoxInmueble.setSelectedItem(inmu);
                               break;
                           }
                       }
                    }
                    
                     public void windowClosing(WindowEvent we){
                     
                      tableroBuscarInmueble.setVisible(false);
                       frmCon.enable(true);
                       frmCon.setVisible(true);
                    }
               });
               
         }
         if (e.getSource()==frmCon.jButtonBuscarInquilino){
               //Boolean flagCerrar = false;
               tableroBuscarInquilino  = new FromBuscarInquilino();
               frmCon.enable(false);
               tableroBuscarInquilino.setLocation(0, 0);
               tableroBuscarInquilino.setVisible(true);
               tableroBuscarInquilino.addWindowListener(new WindowAdapter(){
                    public void windowClosed(WindowEvent we){
                     
                      tableroBuscarInquilino.setVisible(false);
                      dni_inquilino = tableroBuscarInquilino.getDni_inquilino();
                       frmCon.enable(true);
                       frmCon.setVisible(true);
                       inquilinos.clear();
                       consultaInquilino.obtenerInquilinos(inquilinos);
                       frmCon.jComboBoxInquilino.removeAllItems();
                       cargarInquilino();
                       for(Inquilino inq:inquilinos ){
                           if(dni_inquilino == inq.getDni_inquilino()){
                               frmCon.jComboBoxInquilino.setSelectedItem(inq);
                               break;
                           }
                       }
                    }
                    
                     public void windowClosing(WindowEvent we){
                     
                      tableroBuscarInquilino.setVisible(false);
                       frmCon.enable(true);
                       frmCon.setVisible(true);
                    }
               });
               
         }
         if (e.getSource()==frmCon.jButtonGuardar){
            try{
                  //  con.setId_contrato(Integer.parseInt(frmCon.txtID_contrato.getText()));
                if(camposVacios()){
                    JOptionPane.showMessageDialog(null, "Debe ingresar datos completos de Contrato", "Guardar", JOptionPane.WARNING_MESSAGE); 
                }
                else {
                    if(frmCon.jDateChooserFecFin.getDate().before(frmCon.jDateChooserFecIni.getDate()))
                    {
                        JOptionPane.showMessageDialog(null,"Seleccione una fecha de fin posterior a la fecha de inicio del contrato");
                    }
                    else {
                    contrato.setEstado_contrato(frmCon.jComboBoxEstadoContrato.getSelectedItem().toString());
                    contrato.setMonto(Double.parseDouble(frmCon.txtMonto.getText()));
                    contrato.setInmueble(((Inmueble) frmCon.jComboBoxInmueble.getSelectedItem()));
                    contrato.setInquilino(((Inquilino) frmCon.jComboBoxInquilino.getSelectedItem()));
                    contrato.setFecha_ini(  frmCon.jDateChooserFecIni.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                    contrato.setFecha_fin(  frmCon.jDateChooserFecFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

                    if (consContr.Guardar(contrato)){
              
                        JOptionPane.showMessageDialog(null, "Contrato guardado");
                        
                        PanelContratoList.cargarContratos();
                        //Vista.Inmueble.PanelInmueble.rbTodos.setSelected(true);
                        Vista.Inmueble.PanelInmueble.cargarDisponibles();
                        
              
                    } else{ JOptionPane.showMessageDialog(null, "Error al Guardar");
                            limpiar();
                    } }
                }
        }
            catch(Exception num){JOptionPane.showMessageDialog(null, "Dato invalido");
      
            }
         }
         
         
         if (e.getSource()==frmCon.jButtonBuscarInquilino){
               Boolean flagCerrar = false;
               frmCon.enable(false);
               tableroBuscarInquilino.setLocation(0, 0);
               tableroBuscarInquilino.setVisible(true);
               tableroBuscarInquilino.addWindowListener(new WindowAdapter(){
                    public void windowClosing(WindowEvent we){
                     
                      tableroBuscarInquilino.setVisible(false);
                       frmCon.enable(true);
                       frmCon.setVisible(true);
                       
                    }
               });
         }
         
         if (e.getSource()==frmCon.jButtonLimpiar){
               limpiar();
         }
    }
    
    public void cargarInmueble(){
        inmuebles.clear();
        consultaInmueble.obtenerInmueblesDisponible(inmuebles);
        frmCon.jComboBoxInmueble.removeAllItems();
        this.frmCon.jComboBoxInmueble.addItem(null);
         for(Inmueble elem:inmuebles){
            this.frmCon.jComboBoxInmueble.addItem(elem);
         }
    }
    
    public void cargarInquilino(){
        inquilinos.clear();
        frmCon.jComboBoxInquilino.removeAllItems();
        consultaInquilino.obtenerInquilinos(inquilinos);
        this.frmCon.jComboBoxInquilino.addItem(null);
         for(Inquilino elem:inquilinos){
            this.frmCon.jComboBoxInquilino.addItem(elem);
         }
    }
    
    public void limpiar(){
      
      frmCon.txtID_contrato.setText("");
      frmCon.jComboBoxInquilino.setSelectedItem(null);
      frmCon.jComboBoxInmueble.setSelectedItem(null);
     frmCon.jDateChooserFecFin.setDate(null);
    frmCon.jDateChooserFecIni.setDate(null);
    frmCon.txtMonto.setText("");
      
  }
    
    public boolean camposVacios(){
         if(frmCon.txtMonto.getText().equals("") 
                 || !(frmCon.jDateChooserFecFin.getDate() != null) 
                 || !(frmCon.jDateChooserFecIni.getDate() != null) 
                 || !(frmCon.jComboBoxInquilino.getSelectedItem() != null) 
                 || !(frmCon.jComboBoxInmueble.getSelectedItem() != null) ) 
  { return true;}
  else {return false;}
  }

    /**
     * @return the inmu
     */
    public Inmueble getInmu() {
        return inmu;
    }

    /**
     * @param inmu the inmu to set
     */
    public void setInmu(Inmueble inmu) {
        this.inmu = inmu;
    }

    /**
     * @return the inqui
     */
    public Inquilino getInqui() {
        return inqui;
    }

    /**
     * @param inqui the inqui to set
     */
    public void setInqui(Inquilino inqui) {
        this.inqui = inqui;
    }
}
