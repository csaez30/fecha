/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


/**
 *
 * @author cris
 */
public class Mapa {

     
    public static void main(String[] args) {
        // TODO code application logic here
        
//   HashSet<Integer> c= new HashSet<Integer>();
//   c.add(13);
//    c.add(16);
//     c.add(11);
//     
//   
//   Iterator it= c.iterator();
//   while (it.hasNext()){
//     System.out.println(it.next());
//   }


Empleado emple = new Empleado();
emple.setNombre("Ivana");
emple.setSueldo(1000000);
Empleado emple2 = new Empleado("Julio", 2000000);

 Map <Integer, Empleado> empleados = new HashMap<>();
     empleados.put(10,new Empleado("Juan"));
     emp.put(30, new Empleado("Roberto",50000));
     emp.put(6, new Empleado("Ana"));
     emp.put(7, new Empleado("Mario"));
     emp.put(11, new Empleado("Rosana"));
     emp.put(1, new Empleado("Martino"));
     emp.put(50, emple);
     emp.put(55, emple2);
     
     emp.get(55);

     System.out.println(emp);   
   for (Map.Entry<Integer,Empleado> e:emp.entrySet()){
     int clave =e.getKey();
     Empleado valor= e.getValue();
       System.out.println("Clave "+clave+" Empleado nombre "+valor.getNombre()+ "Empleado sueldo "+valor.getSueldo());
   
   }     
    
    
 
  
           
           
    
    }
    
}
;