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
public class Viaje2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Combustible nafta=new Combustible("nafta",350);
         Combustible gasoil=new Combustible("gasoil",300);
        Auto a1= new Auto("Fiat", "32dsds",nafta); 
        Camion c1 = new Camion("Scania","ddd2222",gasoil);
        Ciudad sanLuis= new Ciudad(1000,"San Luis",7);
        Ciudad mendoza= new Ciudad(5000,"Mendoza ",7);
        Ciudad bsAs= new Ciudad(3500,"Buenos Aires",10);
        viaje v1 = new viaje (sanLuis,mendoza,a1,3);
        viaje v2 = new viaje (sanLuis,bsAs,1100,c1,3);
        System.out.println("distncia "+v2.calcularDistancia());
        System.out.println("tipo de combustible: "+v2.getVehiculo().getCombustible().getTipoCombust());
        System.out.println("precio "+v2.getVehiculo().getCombustible().getPrecio());
        System.out.println("costo combustible "+v2.getVehiculo().costoCombustible(v2.calcularDistancia()));
//        System.out.println(" Viaje de "+ v1.getOrigen() +" hasta"+v1.getDestino()+" en "+v1.getVehiculo().getClass()+
//                " costo de combustible "+v1.getVehiculo().costoCombustible(v1.calcularDistancia(), v1.getVehiculo().getCombustible()));
//        System.out.println(" Viaje de "+ v2.getOrigen() +" hasta"+v2.getDestino()+" en "+v2.getVehiculo().getClass()+
//                " costo de combustible "+v2.getVehiculo().costoCombustible(v2.calcularDistancia(), v2.getVehiculo().getCombustible()));
//        costoCombustible(km, combustible)
    }
    
}
