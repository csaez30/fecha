/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tit,dir, otra;
        double dur;
        ArrayList<Pelicula> peliculas=new ArrayList();
        Scanner leer;
        do{
        leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el titulo ");
        tit= leer.next();
        System.out.println("Ingrese el director ");
        dir= leer.next();
        System.out.println("Ingrese la duracion ");
        dur= leer.nextDouble();
        Pelicula pelicula= new Pelicula(tit,dir,dur);
        peliculas.add(pelicula);
        System.out.println("desea ingresar otra pelicula? ");
        otra=leer.next();
    }while(otra.equalsIgnoreCase("si"));
        System.out.println(" Mostrando lista de Peliculas ............");
        for(Pelicula p: peliculas ){
            System.out.println(" Pelicula "+p.toString());
         
        }
        System.out.println(" Mostrando lista de Peliculas que duran 1 hora.");
        for(Pelicula p: peliculas ){
          if (p.getDuracion()==1.0)
            System.out.println(" Pelicula "+p.toString());
            
        }
        peliculas.sort(Pelicula.compararDuracionAscendente );
        System.out.println(" Mostrando Peliculas ordenadas por duración de Mayor a Menor.");
        for(Pelicula p: peliculas ){
            System.out.println(" Pelicula "+p.toString());
            
        }
        peliculas.sort(Pelicula.compararDuracionDescendente );
        System.out.println(" Mostrando Peliculas ordenadas por duración de Menor a Mayor.");
        for(Pelicula p: peliculas ){
            System.out.println(" Pelicula "+p.toString());
            
        }
        peliculas.sort(Pelicula.compararTitulo );
        System.out.println(" Mostrando Peliculas ordenadas por titutlo.");
        for(Pelicula p: peliculas ){
            System.out.println(" Pelicula "+p.toString());
            
        }
         peliculas.sort(Pelicula.compararDirector );
        System.out.println(" Mostrando Peliculas ordenadas por Director.");
        for(Pelicula p: peliculas ){
            System.out.println(" Pelicula "+p.toString());
            
        }
        
    }
    
    
    
    
    
    
}
