/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.excepciones;

/**
 *
 * @author Admin
 */
public class GUIA10EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String []arr = new String[10];
       try{
        for(int i=0; i<=10;i++){
            arr[i]= "aaa"+i;
            System.out.println(arr[i]);
        }
        
    }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Fuera de limite "+e.toString());
        
    }
        System.out.println("continua ejecutando.... ");
    }
    
}
