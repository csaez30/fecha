/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    

package coleccion;
import java.util.*;
public class Coleccion {


public static void main(String[] args) {

	ArrayList lista= new ArrayList();
    
        Persona p1=new Persona(23492009,"Luis");
        Persona p2 = new Persona(20314618,"Pablo");
        Persona p3 = new Persona(20314619,"Ana");
	lista.add(p1);
	lista.add(p2);
        lista.add(p3);
	lista.add(new Persona(21569856,"Antonio"));

	System.out.println(lista);
        System.out.println("");
        Collections.sort(lista, Persona.comparaNombre);
         System.out.println(lista);
          System.out.println("");
        Collections.sort(lista, Persona.comparaDni);
         System.out.println(lista);
        
        




}


}


