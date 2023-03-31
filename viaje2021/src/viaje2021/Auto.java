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
public class Auto extends Vehiculo {

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

   
    
    public double costoCombustible(double km){
                return (7*km/100)*combustible.getPrecio();  //litros* precio de la nafta
            }     

    @Override
    public String toString() {
        return "Auto{" + '}';
    }
     
       
}
