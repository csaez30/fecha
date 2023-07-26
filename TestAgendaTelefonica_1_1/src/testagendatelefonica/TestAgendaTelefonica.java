/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testagendatelefonica;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MArio
 */
public class TestAgendaTelefonica {

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
        telefono=Long.parseLong("2664222979");
        dir.agregarCliente(telefono, cliente2);
        Cliente cliente3=new Cliente("juarez", "belen", 31356168, "san luis");
        telefono=Long.parseLong("2664548476");
        dir.agregarCliente(telefono, cliente3);
        Cliente cliente4=new Cliente("avaca", "mario", 30377673, "san luis");
        telefono=Long.parseLong("2664778899");
        dir.agregarCliente(telefono, cliente4);
        Cliente cliente5=new Cliente("perez", "juan", 306666777, "san luis");
        telefono=Long.parseLong("2664445566");
        dir.agregarCliente(telefono, cliente5);
        Cliente cliente6=new Cliente("gonzalez", "pedro", 30888999, "san luis");
        telefono=Long.parseLong("2664112233");
        dir.agregarCliente(telefono, cliente6);
        
        
        
        int dni=30377673;
//        directorioSL.borrarCliente(dni);

        Map <Long, Cliente> aux=new HashMap<>();
        aux= dir.getDirectorio();
        System.out.println("Mostrando Agenda");
        for(Map.Entry<Long,Cliente> it: aux.entrySet()){
            System.out.println("Apellido: "+it.getValue().getApellido()+"  Telefono: "+it.getKey().toString());
        }
        
        
    }
    
}
