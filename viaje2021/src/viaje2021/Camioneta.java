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
public class Camioneta  extends Vehiculo{

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    public double costoCombustible(double km){
         return 10*(km*0.1)*combustible.getPrecio();  //litros* precio de la nafta
            
     }     

   
}
