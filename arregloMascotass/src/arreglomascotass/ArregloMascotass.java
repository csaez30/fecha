/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglomascotass;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ArregloMascotass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String raza;
        char s;
        int edad;
        Mascota m;
        int cont=0;
        Mascota[] mascotas=new Mascota[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese 's' para salir, o cualquier digito para una nueva mascota ");
        s=sc.next().charAt(0);
        while (s!='s'){
            System.out.println("ingrese raza");
            raza=sc.next();
            System.out.println("ingrese edad");
            edad=sc.nextInt();
            m=new Mascota(edad,raza);
            mascotas[cont]=m;
            cont++;
         System.out.println("ingrese 's' para salir, o cualquier digito para una nueva mascota ");
        s=sc.next().charAt(0);
        }
       for (int i=0;i<cont;i++)
        System.out.println(mascotas[i].toString());
    }
    
}
