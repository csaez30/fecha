/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaPpal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LibreriaPpal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String tit,autor, otra;
         int eje, op;
        HashSet<Libro> libros=new HashSet();
        Scanner leer;
        do{
        leer= new Scanner(System.in).useDelimiter("\n");
       
        System.out.println("Ingrese el titulo ");
        tit= leer.next();
        System.out.println("Ingrese el autor ");
        autor= leer.next();
         System.out.println("Ingrese el numero de ejemplares ");
        eje= leer.nextInt();
        Libro libro= new Libro(tit,autor,eje);
        libros.add(libro);
        System.out.println("desea ingresar otro libro? ");
        otra=leer.next();
    }while(otra.equalsIgnoreCase("si"));
        
     for(Libro l:libros){
         System.out.println(l);
     }   
     
     Libreria libreria= new Libreria(libros);
     
     do{
         System.out.println("Ingrese una opcion: 1 Prestamo, 2 Devolucion, 3 mostrar, 4 salir "); 
         op=leer.nextInt();
         switch(op){
             case 1: System.out.println("Ingrese el titulo para prestar"); 
                     tit=leer.next();
                     if  (libreria.prestamo(tit)) System.out.println("Prestamo exitoso");
                         else
                     System.out.println("No se encontro el titulo");    
                     break;
            case 2: System.out.println("Ingrese el titulo para devolver"); 
                     tit=leer.next();
                     if  (libreria.devolucion(tit)) System.out.println("Devolucion exitosa");
                         else
                     System.out.println("No se encontro el titulo");    
                     break;   
            case 3: for(Libro l:libros){
                       System.out.println(l);
                      }    
                    break;
            case 4: break;         
         }
     
       System.out.println("desea ingresar otra operacion? ");
        otra=leer.next();
    } while(otra.equalsIgnoreCase("si"));
//end
    
}
}