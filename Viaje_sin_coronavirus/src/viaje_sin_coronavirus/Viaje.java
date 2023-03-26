/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viaje_sin_coronavirus;

import javax.swing.JOptionPane;

/**
 *
 * @author cris
 */
public class Viaje {
    private double origen;
    private double destino;
    private double distancia;
    private String tipoCombustible;  //nafta o gasoil
    private String tipoV; //auto, camioneta, camion
    private int cantPeaje;
    private boolean ruta;

    public Viaje() {
    }

    public Viaje(double origen, double destino, String tipoCombustible, String tipoV, int cantPeaje,boolean ruta) {
        this.origen = origen;
        this.destino = destino;
        this.tipoCombustible = tipoCombustible;
        this.tipoV = tipoV;
        this.cantPeaje = cantPeaje;
        this.ruta= ruta;
        
    }

    public Viaje(double distancia, String tipoCombustible, String tipoV, int cantPeaje, boolean ruta) {
        this.distancia = distancia;
        this.tipoCombustible = tipoCombustible;
        this.tipoV = tipoV;
        this.cantPeaje = cantPeaje;
         this.ruta= ruta;
    }

    public double getOrigen() {
        return origen;
    }

    public void setOrigen(double origen) {
        this.origen = origen;
    }

    public double getDestino() {
        return destino;
    }

    public void setDestino(double destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        if (ruta)
        { return Math.abs(origen-destino);}
        else
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoV() {
        return tipoV;
    }

    public void setTipoV(String tipoV) {
        this.tipoV = tipoV;
    }

    public int getCantPeaje() {
        return cantPeaje;
    }

    public void setCantPeaje(int cantPeaje) {
        this.cantPeaje = cantPeaje;
    }

   
    public double consumoCombustible(String tipoC, String tipoV){
     
        if (tipoV.equals("auto")){
            if (tipoC.equals("nafta"))  {return (7*60);} //nafta
                 else
                 {return (7*50);}  //gasoil
         
                
        }
        if (tipoV.equals("camioneta")){
            if (tipoC.equals("nafta"))  {return (10*60);} //nafta
                 else
                 {return (10*50);}  //gasoil
         
                
        }
       else{  //camion
            if (tipoC.equals("nafta"))  {return (12*60);} //nafta
                 else
                 {return (12*50);}  //gasoil
         
                
        }
    
    }
    public double costoPeaje(int cantPeaje, String tipoV){
        
        if (tipoV.equals("auto") || tipoV.equals("camioneta")){ 
               return 20*cantPeaje;
               
        }   else 
                return 30*cantPeaje;
        
        
        
        }

    public double costoTotal(String tipoV, String tipoC, int cantPeaje){
        double temp =this.getDistancia()*this.consumoCombustible(tipoC, tipoV)+this.costoPeaje(cantPeaje, tipoV);
       JOptionPane.showMessageDialog(null, "El costo total es: "+String.valueOf(temp));
        
        return (this.getDistancia()*this.consumoCombustible(tipoC, tipoV)+this.costoPeaje(cantPeaje, tipoV));
    
    
    
    }
    
    
    }
    
    
    
    
    
    

