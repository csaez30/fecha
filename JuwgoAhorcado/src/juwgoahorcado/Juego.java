/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juwgoahorcado;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Juego {
    int jugadasMax, encontradas=0,faltantes=0,oportunidades=3;
    char []vector;
        
    String cadena;
    Scanner leer=new Scanner(System.in);
    
    public Juego() {
        System.out.println("Ingrese la palabra ");
        cadena= leer.next();
        int longitud=cadena.length();
        
        
        vector = new char[longitud];
        faltantes=longitud();
    }

    
    public int longitud(){
      return vector.length;
      
    }
    public boolean buscar(char letra){
      boolean esta=false;
      for (int i=0;i<longitud();i++){
       if (vector[i]==letra){
           System.out.println("la letra "+letra+" pertenece a la palabra");
           esta=true;
           encontradas++;
           faltantes=longitud()-encontradas;
       }
    }
     if (!esta) {
            System.out.println("la letra "+letra+"no pertenece a la palabra");
            oportunidades--;//oportunidades de errar
     }
    jugadasMax--;
    return esta;
    }
    
   public boolean encontradas(char letra){
   boolean enc=buscar(letra);
       System.out.println("las letras encontradas son "+ encontradas);
       System.out.println("las letras faltantes son "+ faltantes);
       System.out.println("quedan "+oportunidades+" oportunidades");
       
       return enc;
   }
   
   
    public int intentos(){
      return oportunidades;
    }
    public void crearJuego(){
        System.out.println("la longitud de la palabra es "+longitud());
        System.out.println("ingrese la cantidad de jugadas maximas");
        jugadasMax=leer.nextInt();
        for (int i=0;i<longitud();i++){
           vector[i] = cadena.charAt(i);
          System.out.println(vector[i]);
           }
        
    }
    public void juego(){
     char letra;
     boolean encontro;
     crearJuego();
     while (jugadasMax>0 && intentos() >0 && faltantes>0){
         System.out.println("ingrese una letra a buscar");
         letra= leer.next().charAt(0);
         encontro=encontradas(letra);
         System.out.println("Numero de jugadas maxima "+jugadasMax);
     }
     if (faltantes==0 )
            System.out.println("HAS GANADO EL JUEGO");
     if (intentos()==0 && faltantes !=0)
            System.out.println("LO SIENTO NO TIENES MAS OPORTUNIDADES");
    }
}
