/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicio.pkg3.pkg5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    boolean borro=false;
    HashSet<String> paises = new HashSet();

        String pais;
        String respuesta = "";
        
       do{          
      
           System.out.println("Ingrese un pais ");
            pais = leer.next();
            System.out.println("");
            paises.add(pais);

            System.out.println("Quiere ingresar otro pais ?");
            respuesta = leer.next();
     }while(respuesta.equalsIgnoreCase("si"));
       
       System.out.println("Recorremos el HashSet");
       for(String p: paises){
       
           System.out.println("pais "+p);
       }
       System.out.println("Ordenamos el hashSet");
// Para ordenar un hashset hay que convertirlo en una lista primero
         ArrayList<String> lista = new ArrayList(paises);

        Collections.sort(lista);

        System.out.println("===================================");
        System.out.println("Mostramos el hashSet ordenado ascendente");

        for (String l : lista) {

            System.out.println(l);
        }
        
    System.out.println("===================================");
    System.out.println("Ingrese el elemento que desea borrar ");
    String borrar=leer.next();
    Iterator<String> it = paises.iterator();

        while (it.hasNext()) {

            if (it.next().equals(borrar)) { // Borramos si está el numero 3

                it.remove();
                borro=true;
                break;
            }
        }
        if (borro){
        
         for(String p: paises){
       
           System.out.println("pais "+p);
       }
        } else{
            System.out.println("El elemento no exixte  ");
        }
        
    }
// public static Comparator<String> compararPaises = new Comparator<String>() { // Creamos un objeto comparator 
//        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
//        public int compare(String e1, String e2) { // Le pasamos dos objetos a comparar
//            return e1.compareTo(e2); // Los comparamos usando el get y el compareTo
//        }
//    };    
}
