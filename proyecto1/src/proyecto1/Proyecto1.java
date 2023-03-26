/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Admin
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Auto a1 = new Auto();
        a1.setColor("Rojo");
        a1.setPatente("asd123");
        Auto a2 = new Auto("Azul","er3333tr");
        a2.setCombustible(52);
        
        System.out.println("Auto 1:  "+a1);
        Vehiculo m= new Moto();
        
       
      
    }
    
}
