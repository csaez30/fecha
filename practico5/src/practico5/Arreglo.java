/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico5;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author cris
 */
public class Arreglo {
    
    public static int totalSuma;
    public static int mayor = 0;
    public int array[];
    public static int vocales;
    
    
//    Constructor
    public Arreglo(int array[]) {
        this.array = array;
    }
    
//    Metodos
    public static void sumarLista(int array[]){
        for (int i = 0; i < array.length; i++) {
            totalSuma += array[i];
           
            System.out.println(array[i]);
        }System.out.println("La suma total es: " + totalSuma);
    }
    
    public static void buscarMayor(int array[]){
        for (int i = 0; i < array.length; i++) {
            if(mayor < array[i]){
                mayor = array[i];
            }
        }System.out.println("El mayor es: " + mayor);
    }
    
    public static void cuentaVocales(String string){
        for (int i = 0; i < string.length(); i++) {
            int a = string.length();
            if ((string.charAt(i)=='a') 
                || (string.charAt(i)=='e') 
                || (string.charAt(i)=='i') 
                || (string.charAt(i)=='o') 
                || (string.charAt(i)=='u')){ 
                vocales ++;
            }
        }
        System.out.println("Cantidad de vocales: " + vocales);
    }
    
    public static void cuentaCaracter(String string, char a){
        int cont = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == a){
            cont ++;
            }
        }
        System.out.println("El caracter: " + a + " se repite " + cont + " veces");
    }

public static void agrega(){
Collection lista=new ArrayList();
lista.add("MARIELA");
lista.add("BELEN");
lista.add("CELESTE");
Object arreglo[];
arreglo = lista.toArray();//devuelve un arreglo de //Objects.
for(Object o:arreglo){
  System.out.println("recorro arreglo "+o);



}
}
}