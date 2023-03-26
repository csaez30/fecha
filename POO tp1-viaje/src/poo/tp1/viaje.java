/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tp1;

import javax.swing.JOptionPane;

/**
 *
 * @author cris
 */
public class viaje {
    private double origen;
    private double destino;
    private double distania;
    private String tipo_combustible;  //NAFTA O GASOIL
    private String tipo_vehiculo; //auto = 7, camioneta= 10 o camion=12
    private int peaje;   //10, 12 y 14
    private String ruta;

    public viaje() {
    }

    

    public viaje(double distania, String tipo_combustible, String tipo_vehiculo, int peaje, String ruta) {
        this.distania = distania;
        this.tipo_combustible = tipo_combustible;
        this.tipo_vehiculo = tipo_vehiculo;
        this.peaje = peaje;
        this.ruta = ruta;
    }
    

    public viaje(double origen, double destino, String tipo_combustible, String tipo_vehiculo, int peaje, String ruta) {
        this.origen = origen;
        this.destino = destino;
        this.tipo_combustible = tipo_combustible;
        this.tipo_vehiculo = tipo_vehiculo;
        this.peaje = peaje;
        this.ruta = ruta;
        this.distania =destino-origen;
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

    public double getDistania() {
        return distania;
    }

    public void setDistania(double distania) {
        this.distania = distania;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public int getPeaje() {
        return peaje;
    }

    public void setPeaje(int peaje) {
        this.peaje = peaje;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    public  int consumo_cumbuetible(String tipo_v, String tipo_comb){
          
        if (tipo_v.equals("auto"))
             {
             if  (tipo_comb.equals("nafta"))
                        return 7*40;  //litros* precio de la nafta
             else  return 7*30; //litros *precio del gasoil
             }
        else if (tipo_v.equals("camionoeta"))
        { if  (tipo_comb.equals("nafta")) return 10*40;
              else
               return 10*30;
        }
        else{
            if  (tipo_comb.equals("nafta")) return 12*40;
               else
               return 12*30;
        }
            
                
            
            
    }
    
    public double Costo_peaje (String tipo_v, int cant_p){
          if (tipo_v.equals("auto"))
                    return 12.25*cant_p;
        else if (tipo_v.equals("camionoeta"))
                return 20.34*cant_p;
                else
                return 52.34*cant_p;
    }
    
    public double Costo_total (double distanca, double peaje, String tipo_v, String tipo_comb, int cant_p){
         double temp= this.getDistania() *this.consumo_cumbuetible(tipo_v, tipo_comb)+this.Costo_peaje(tipo_v,cant_p);
         
          JOptionPane.showMessageDialog(null, "el costo toale es: "+String.valueOf((temp)));
       return this.getDistania() *this.consumo_cumbuetible(tipo_v, tipo_comb)+Costo_peaje(tipo_v,cant_p);
        
    }
    
   
}
