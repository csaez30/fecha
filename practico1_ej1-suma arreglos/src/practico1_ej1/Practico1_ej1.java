/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico1_ej1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cris
 */
public class Practico1_ej1 {

    
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        int i=0,suma=0;
        int[][] matriz= {{1,2,3},{4,5,6},{7,8,9}};
           
       for(i=0;i<=9;i++){
        arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Igrese un numero "));
          
        
       }
               
         for(int j:arreglo){
          suma+=j;           
       }
         
          JOptionPane.showMessageDialog(null,"La suma es "+String.valueOf(suma));
          for(i=9;i>0;i--)
             JOptionPane.showMessageDialog(null,arreglo[i]);
    
          System.out.println("MATRIZ---------------");         
          mostrar(matriz);
    
}
    
public static void mostrar(int[][] m){
    int i,j;
    for(i=0;i<3;i++){
         for(j=0;j<3;j++){
             System.out.print(m[i][j]+" ");    
         }
        System.out.println("");    
    }

}    
    
    
}