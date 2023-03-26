/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viaje2021;

/**
 *
 * @author Admin
 */
public class Camion extends Vehiculo{
    public double costoCombustible(double km, Combustible combust){
        
      
               return 12*(km*0.1)*combust.getPrecio();  //litros* precio*km
           
             }     

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }
     
    
}
