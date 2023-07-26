/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class JavaApplication62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1= new Persona("Laura Sosa","64363");
        Persona persona2 = new Persona();
        
        System.out.println("el nombre es "+persona1.getNombre());
        persona1.setNombre("Laura Marcels Saosa");
         System.out.println("el nombre es "+persona1.getNombre());
        
        
    }
    
}
