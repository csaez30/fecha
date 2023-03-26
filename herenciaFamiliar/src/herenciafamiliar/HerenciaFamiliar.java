/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciafamiliar;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HerenciaFamiliar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Padre> familia = new ArrayList();
        Auto auto = new Auto("asd1243", "rojo");
        Casa casa= new Casa("centro", 4);
        Padre p1 = new Padre("Perez", auto, casa);
        Padre p2 = new Padre("Romero", auto, casa);
        Hijo h1 = new Hijo("Mario",p1.getApellido(),p1.getAuto(),p1.getCasa());
        
        Hijo h2 = new Hijo("Rodolfo",p2.getApellido(),p2.getAuto(),p2.getCasa());
        
        familia.add(h1);
        familia.add(h2);
        
        for (Padre f:familia){
            System.out.println(f);
                
        }
          
        h1.bailar();
        h1.cantar();
        h1.heredarDinero(1000000);
        h1.jugarFutbol();
        h1.getAuto().avanzar(100);
       
        System.out.println("la casa esta ubicada en zona "+h1.getCasa().getZona());
        System.out.println("el auto tiene patente "+h1.getAuto().getPatente());    
    }
    
}
