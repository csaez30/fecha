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
           
       for(i=0;i<=9;i++){
        arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Igrese un numero "));
          
           
       }
               
         for(i=0;i<9;i++){
          suma+=arreglo[i];
           
       }
         
          JOptionPane.showMessageDialog(null,"La suma es "+String.valueOf(suma));
          for(i=9;i>0;i--)
             JOptionPane.showMessageDialog(null,arreglo[i]);
              
              
             
          
           
       
       
        

        
        
        
        // TODO code application logic here
  
    
}
}