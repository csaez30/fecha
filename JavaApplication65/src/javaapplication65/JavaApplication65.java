/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

import java.util.Scanner;





/**
 *
 * @author Admin
 */
public class JavaApplication65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String nombre;
      int edad;
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese su nombre ");
      nombre= leer.next();
      System.out.println("El nombre es "+nombre );
      System.out.println("Ingrese su edad ");
      edad= leer.nextInt();
      System.out.println("La Edad es "+edad);
        
        
    }  
}
