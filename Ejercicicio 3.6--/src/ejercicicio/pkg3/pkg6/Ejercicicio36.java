/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicicio.pkg3.pkg6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
          int op=0;
        HashMap<String, Double> productos = new HashMap(); // Primero la llave y despues de los valores

        
        String nombre;
        double precio;
        String respuesta = "";
  

//     OTRA FORMA DE ELIMINAR  

//Iterator<Map.Entry<String, Double>> it = productos.entrySet().iterator();
//        System.out.println("Que producto quiere eliminar ? ");
//        String nom = leer.next();
//
//       while (it.hasNext()) {
//
//            Map.Entry<String, Double> entry = it.next();
//
//            if (entry.getKey() == nom) {
//                  it.remove();
//           }
//      }

       do{ 
       System.out.println("Ingrese las opciones: ");
       System.out.println(" 1 para agregar, 2: modificar, 3: elieminar, 4 Mostrar, 5 Salir");
       op=leer.nextInt();
       switch(op){
           case 1: do { //AGREGAR
            System.out.println("Ingrese el nombre del producto");
            nombre = leer.next();

            System.out.println("Ingrese el precio ");
            precio = leer.nextDouble();

            productos.put(nombre, precio); //agrego al hashMap

            System.out.println("Quiere ingresar otro producto ?");
            respuesta = leer.next();

           } while (respuesta.equalsIgnoreCase("si"));
           break;
           case 2: //MODIFICAR
                   System.out.println("Que producto quiere modificar el precio ? ");
                   String prod = leer.next();
                   System.out.println("ingrese en nuevo precio");
                   double pre=leer.nextDouble();
                   productos.put(prod,pre);//se sobrescibe con es clave
                   break;
           case 3://BORRAR
                  System.out.println("Que producto quiere eliminar ? ");
                  String prodBorrar = leer.next();
                  productos.remove(prodBorrar);        
                  break;
           case 4: //MOSTRAR
                  for (Map.Entry<String, Double> entry : productos.entrySet()) {

                  System.out.println("Nombre=" + entry.getKey() + ", Precio=" + entry.getValue());
                    }
                  break;
           case 5: break;        
          default:        
              System.out.println("Opcion invalida vuelva a ingresar");
              
       }//fin case
       }while(op!=5);
    }
   


}
    

