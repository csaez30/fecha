/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico5;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author cris
 */
public class Practico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
/*        
        //ARREGLO DE ENTEROS
        System.out.println("---Arreglo de Enteros---");
        int[] intArray = new int[] {5, 2, 3, 0, 1};
        Arreglo a = new Arreglo(intArray);
        
        Arreglo.sumarLista(intArray);
        Arreglo.buscarMayor(intArray);
        
        
        Arreglo.cuentaVocales("Mona se queda");
        Arreglo.cuentaCaracter("Mona se queda", 'a');
        Arreglo.agrega();*/
   
    ArrayList lista= new ArrayList();
     lista.add("Luis");
     lista.add("Pablo");
     lista.add("Antonio");
     System.out.println(lista);
     Collections.sort(lista);
     System.out.println(lista);
    
    }

}
    

