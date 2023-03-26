/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comision3;

import java.util.Scanner;


public class Comision3 {

   
    public static void main(String[] args) {
        int num;
        String nom;
       Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero "); 
        num= leer.nextInt();
        System.out.println("Ingrese un nombre "); 
        nom = leer.next();
        
        System.out.println("Su nombre es "+nom+" su edad es "+num);
    }
    
}
