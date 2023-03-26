/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofer;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author juanj
 */
public class Empresa {
      String razonSocial;
      int CUIT;
      ArrayList <Empleado> listaEmpleado;

    public Empresa() {
        listaEmpleado= new ArrayList<Empleado>();
    }
    
    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }
      
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }    
    
    public void agregaEmpleado(Empleado emp1){
        listaEmpleado.add(emp1);
    }
    public void mostrarEmp(){

     int i=0;
     
     if (this.listaEmpleado.size()==0)
     {
         JOptionPane.showMessageDialog(null, "Esta empresa no tiene empleados ");
     }
         
         
     else {
     for (i=0; i<this.listaEmpleado.size();i++){
         JOptionPane.showMessageDialog(null, this.listaEmpleado.get(i).getNombre()+" "+this.listaEmpleado.get(i).getApellido());
          } 
         
         
     }

}
}