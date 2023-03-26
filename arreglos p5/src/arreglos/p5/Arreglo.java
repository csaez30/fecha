/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos.p5;

import java.util.Scanner;

/**
 *
 * @author cris
 */
public class Arreglo {
    Scanner reader = new Scanner(System.in);
    int suma=0;
    

    public Arreglo() {
        
    }
    
    
    public void llenarArreglo(int n[]){
        for(int i=0;i<n.length;i++){
        n[i] = reader.nextInt();
    }
    }
     
    public void sumarLista(int n[]){
        for(int i=0;i<n.length;i++){
            suma = suma + n[i] ;
        }
        int prom = suma/n.length;
        
        System.out.print(suma);
        System.out.print(prom);
    }
}
    
