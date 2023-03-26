/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmueble.Controlador;

import Inmueble.Modelo.ConsultasInmueble;
import Inmueble.Modelo.ConsultasTipoInmueble;
import Vista.Inmueble.FormInmueble;
import Inmueble.Modelo.Inmueble;
import Inmueble.Modelo.TipoInmueble;
import Propietario.Controlador.CtrPropietario;
import Propietario.Modelo.ConsultasPropietario;
import Propietario.Modelo.Propietario;
import Vista.Inmueble.PanelInmueble;
import Vista.fromMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author garba
 */
public class CrlInmueble implements ActionListener{
    private Inmueble inmueble;
    private ConsultasInmueble consulta;
    private static FormInmueble formulario;
    private ArrayList<TipoInmueble> tiposinmueble=new ArrayList<TipoInmueble>();
    private static ArrayList<Propietario> propietarios=new ArrayList<Propietario>();
    private ConsultasTipoInmueble consultatipoinmueble=new ConsultasTipoInmueble();
    private Propietario propietario=new Propietario();
    private static ConsultasPropietario consultaprop=new ConsultasPropietario();
    private TipoInmueble tipoinmueble= new TipoInmueble();
    private ConsultasTipoInmueble consultatipo=new ConsultasTipoInmueble();
    private Propietario propietarioparacombo=new Propietario();
    
    
    
    public CrlInmueble (Inmueble inmueble, ConsultasInmueble consulta, FormInmueble formulario) {
      
        this.inmueble=inmueble;
        this.consulta=consulta;
        this.formulario=formulario;
        this.formulario.btnGuardar.addActionListener(this);
        this.formulario.btnModificar.addActionListener(this);
        this.formulario.btnBorrar.addActionListener(this);
        this.formulario.btnLimpiar.addActionListener(this);
        this.formulario.btnAgregarprop.addActionListener(this);
        
    
    }
    
    
  public void iniciar(){
      formulario.setTitle("Inmuebles");
      cargarTipoInmueble();
      cargarDniPropietario();
      formulario.rbDisponible.setSelected(true);
      formulario.cboPropietarios.setSelectedIndex(-1);
      formulario.cboTipo_inm.setSelectedIndex(-1);
  }
 
    @Override
  public void actionPerformed(ActionEvent e){
      
      if (e.getSource()==formulario.btnGuardar){
           if(campoVacio_guardar()){
              JOptionPane.showMessageDialog(null, "Complete todos los datos del inmueble");
          } else {
          propietario.setDni_propietario(((Propietario)formulario.cboPropietarios.getSelectedItem()).getDni_propietario());
          consultaprop.Buscar(propietario);
          inmueble.setPropietario(propietario);
          inmueble.setTipo_inmueble((TipoInmueble) formulario.cboTipo_inm.getSelectedItem());
          inmueble.setDireccion_inmueble(formulario.txtDireccion.getText());
          if(formulario.rbDisponible.isSelected())
            inmueble.setEstado_inmueble("Disponible");
          else 
              inmueble.setEstado_inmueble("No disponible");
          inmueble.setPrecio_base(Double.parseDouble(formulario.txtPrecio.getText()));
          inmueble.setSuperficie(Double.parseDouble(formulario.txtSuperficie.getText()));
           
          if (consulta.GuardarInmueble(inmueble)){
              JOptionPane.showMessageDialog(null, "Inmueble guardado");
              limpiar();
              PanelInmueble.cargarInmueblesFiltrados();
              PanelInmueble.rbTodos.setSelected(true);
              int i = JOptionPane.showConfirmDialog(null,"¿Desea guardar mas inmuebles?",null,JOptionPane.YES_NO_OPTION);
            if(i==0){}
            else {formulario.dispose();}
              
              
          } else{ JOptionPane.showMessageDialog(null, "Error al guardar inmueble");
              limpiar();
          }
      }
      
  }
      
      if (e.getSource()==formulario.btnModificar){
          if(campoVacio_mod()){
              JOptionPane.showMessageDialog(null, "Complete todos los datos del inmueble");
          } else { 
          propietario.setDni_propietario(((Propietario)formulario.cboPropietarios.getSelectedItem()).getDni_propietario());
          consultaprop.Buscar(propietario);
          inmueble.setPropietario(propietario);
          inmueble.setTipo_inmueble((TipoInmueble) formulario.cboTipo_inm.getSelectedItem()); 
          inmueble.setDireccion_inmueble(formulario.txtDireccion.getText());
          if(formulario.rbDisponible.isSelected())
            inmueble.setEstado_inmueble("Disponible");
          else 
              inmueble.setEstado_inmueble("No disponible");
          inmueble.setPrecio_base(Double.parseDouble(formulario.txtPrecio.getText()));
          inmueble.setSuperficie(Double.parseDouble(formulario.txtSuperficie.getText()));
          
          
          if (consulta.Modificar(inmueble)){
              
              JOptionPane.showMessageDialog(null, "Inmueble modificado");
              PanelInmueble.cargarInmueblesFiltrados();
              
          } else{ JOptionPane.showMessageDialog(null, "Error al modificar");
              limpiar();
          }
      }
      
      }
      
      if (e.getSource()==formulario.btnBorrar){
          
          inmueble.setId_inmueble(Integer.parseInt(formulario.txtID_inmueble.getText()));
          
          if (consulta.Borrar(inmueble.getId_inmueble())){
              
              JOptionPane.showMessageDialog(null, "Inmueble borrado");
              PanelInmueble.cargarInmueblesFiltrados();
              formulario.dispose();
              
              
          } else{ JOptionPane.showMessageDialog(null, "No se pudo eliminar inmueble. Verifique si esta asociado a un contrato.");
              
      }
      
      }
      
     
          
       if(e.getSource()== formulario.btnLimpiar){
              limpiar();
       }
       if(e.getSource()==formulario.btnAgregarprop)
       {
        Propietario pod = new Propietario();
        ConsultasPropietario podP = new ConsultasPropietario ();
        Vista.Propietario.frmPropietario frmP = new Vista.Propietario.frmPropietario();

        CtrPropietario ctrl = new CtrPropietario(pod,podP,frmP);
        ctrl.iniciar();
        //-----------------

        frmP.setVisible(true);
        frmP.btnModificar.setEnabled(false);
        frmP.btnBorrar.setEnabled(false);
       }
       
  }
  public void limpiar(){
      formulario.txtID_inmueble.setText("");
      formulario.txtDireccion.setText("");
      formulario.cboPropietarios.setSelectedIndex(-1);
      formulario.cboTipo_inm.setSelectedIndex(-1);
      formulario.txtPrecio.setText("");
      formulario.txtSuperficie.setText("");    
  }
  public void cargarTipoInmueble(){
      
      consultatipoinmueble.ObtenerTiposInmueble(tiposinmueble);
      for(TipoInmueble elem:tiposinmueble)
      formulario.cboTipo_inm.addItem(elem);
  }
  public static void cargarDniPropietario(){
      propietarios.clear();
      consultaprop.obtenerPropietarios(propietarios);
      formulario.cboPropietarios.removeAllItems();
      for(Propietario prop:propietarios)
          formulario.cboPropietarios.addItem(prop);
      
      
  }
  public boolean campoVacio_mod(){
      if(formulario.txtDireccion.getText().equals("")||
         formulario.txtPrecio.getText().equals("")||
         formulario.txtSuperficie.getText().equals("")||
         formulario.cboPropietarios.getSelectedItem().equals(null)||
         formulario.cboTipo_inm.getSelectedItem().equals(null))
          return true;
      else return false;
      
  }
  public boolean campoVacio_guardar(){
      if(formulario.txtDireccion.getText().equals("")||
         formulario.txtPrecio.getText().equals("")||
         formulario.txtSuperficie.getText().equals("")||
         formulario.cboPropietarios.getSelectedIndex()<0||
         formulario.cboTipo_inm.getSelectedIndex()<0)
          return true;
      else return false;
  }
  /*public void cargarPropietarios(){
      consultaprop
      System.out.println(tiposinmueble.size());
      for(TipoInmueble elem:tiposinmueble)
      formulario.cboTipo_inm.addItem(elem);
  }*/
    
}
