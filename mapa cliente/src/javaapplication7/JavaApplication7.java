/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author cris
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Agenda dir=new Agenda();
         Long telefono;
        System.out.println("Esta gregando clientes");
        Cliente cliente1=new Cliente("avaca", "mario", 30377673, "san luis");
        telefono=Long.parseLong("2664222979");
        dir.agregarCliente(telefono, cliente1);
        //Probando que no ingrese numero de tel repetido
        Cliente cliente2=new Cliente("avaca", "mario", 30377673, "san luis");
        telefono=Long.parseLong("2664222978");
        dir.agregarCliente(telefono, cliente2);
        
        dir.borrarCliente(30377673);
    }
    
}
