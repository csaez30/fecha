/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot;

import java.util.List;

/**
 *
 * @author alejo
 */
public class TestJuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo un objeto del tipo Robot y lo asigno a la variable "auto1"
        Robot r1 = new Robot();
       Hombre h1 = new Hombre();
      // h1.setRobot(r1);
        h1.jugarConRobot(r1);
        System.out.println("Energia Actual " + r1.energiaActual());
        Hombre h2 = new Hombre();
        
        
        h2.jugarConRobot(r1);
        System.out.println("Energia Actual " + r1.energiaActual());
        
        
    }
}
