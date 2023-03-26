/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author cris
 */
public class tablero {
    Numero[] ruleta = new Numero[37];
    Numero num;
   public tablero(){
      
   for (int i=0; i<=36;i++){
        num =new Numero(i);
       ruleta[i] =  num;
   
   }}
   
   public void mostrarTablero(){
      for (int i=0; i<=36;i++){
       System.out.println(" Numero "+ruleta[i].getNum()+" Color "+ruleta[i].getColor());
       
   
   }
   }
   
   
   }
    

