/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Guia8Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baraja baraja=new Baraja();
        Scanner leer=new Scanner(System.in);
        int num;
        
        
       baraja.mostrarCartas();
       ArrayList<Carta> darCartas = new ArrayList<>();
       System.out.println("Cuantas cartas quiere");
       num=leer.nextInt();
        System.out.println("CARTAS DADAS "+num);
       Iterator it= baraja.darCartas(num).iterator();
       while (it.hasNext()){
       System.out.println((Carta)it.next());
       
       }
       
       
         System.out.println("cartas del mazo");
         baraja.mostrarCartas();
//       baraja.mostrarCartas();
    }
    
}
