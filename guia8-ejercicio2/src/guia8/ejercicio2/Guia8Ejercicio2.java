/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guia8Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=6, id;
        String nombre;
        Jugador j;
      
       
        Juego juego=new Juego();
        juego.llenarJuego();
//        Iterator it=jugadores.iterator();
//        System.out.println("JUGADORES -----");
//        while (it.hasNext()){
//            System.out.println((Jugador)it.next());
//        }
//       
        juego.ronda();
    }
    
}
