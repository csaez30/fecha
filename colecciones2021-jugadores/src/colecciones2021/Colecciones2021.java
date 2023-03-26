/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones2021;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Colecciones2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//    ArrayList<Empleado> empleados = new ArrayList<>(); //lista
//   Empleado e1=new Empleado("Rosas",65000);
//    
//    empleados.add(new Empleado("Lopez",50000));
//    empleados.add(e1);
//    empleados.add(new Empleado("Lucero",80000));
//    empleados.add(new Empleado("Sosa",150000));
//    empleados.add(new Empleado("Martinez",180000));
//    
//    
//    for(Empleado e:empleados){  //muestra
//         System.out.println(e);
//  
//   }
// 
//    
// for(Iterator it=empleados.iterator();it.hasNext();){  //muestra
//        Empleado e= (Empleado)it.next();
//        if (e.getNombre().equals("Lucero")){
//                it.remove();
//        
//        }
//  
//   }
// 
//        System.out.println();
//    for(Empleado e:empleados){  //muestra
//         System.out.println(e);
//  
//   }
        
     Mapa2021 m = new Mapa2021();

     m.agregarJugadores();
     m.mostrarJugadores();
        System.out.println("Buscado "+m.buscarJugador(100));
       // m.borrar(11);

     m.mostrarJugadores();
     
     List<Jugador> lista=new ArrayList<>();
     
     lista=m.buscarTodos("delantero");
     
    for(Jugador j:lista) {
    
        System.out.println(" Jugador "+j);
    }
     
     
     
    }
    
    
}
