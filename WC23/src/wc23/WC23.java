/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wc23;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cris
 */
public class WC23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer,Empleado> emp= new HashMap<>();
        emp.put(10, new Empleado("Juan"));
        emp.put(3, new Empleado("Maria"));
         emp.put(5, new Empleado("Roberto"));
         emp.put(7, new Empleado("Mario"));
     for (Map.Entry<Integer, Empleado> ec:emp.entrySet()){
          int clave = ec.getKey();
          Empleado valor= ec.getValue();
          System.out.println("[Clave: "+clave+ " Valor: "+valor.getNombre()+"]");
          
         
     
     }
           
        
        
    }
     
}
