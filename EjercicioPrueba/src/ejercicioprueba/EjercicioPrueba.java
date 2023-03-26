/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioprueba;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class EjercicioPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado> empleados = new ArrayList<>(); 
        Empleado e1 = new Empleado(32432432,"Juan Perez",45600);
         Empleado e3 = new Empleado(325552,"Ana Lopez",49600);
        Empleado e2 = new Empleado();
        e2.setDni(5435353);
        e2.setNombre("Mario Sanchez");
        e2.setSueldo(50300);
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        int cont=0;
        for(Empleado e:empleados){
            cont++;
            System.out.println("Empleado "+cont+" "+e);
            
        
        
        }
    }
    
}
