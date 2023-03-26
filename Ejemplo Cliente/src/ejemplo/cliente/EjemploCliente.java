/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cris
 */
public class EjemploCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    
        // TODO code application logic here
        
        Conexion c = new Conexion();
          ClienteData cd = new ClienteData(c);
        
        Cliente c1 = new Cliente(1236,"JUAN", "Mitre 123");
        Cliente c2 = new Cliente(4552, "Martin", "Junin 54");
        Cliente c3 = new Cliente();
        c3.setDni(5455);
        c3.setNombre("Analia");
        c3.setDomicilio("Ayacucho 999");
       
        cd.cargar(c1);
        cd.cargar(c2);
        cd.cargar(c3);
        System.out.println("Cliente 1 "+c1.getNombre()+" "+c1.getDomicilio());
        System.out.println("Cliente 2 "+c2.getNombre()+" "+c2.getDomicilio());
        System.out.println("Cliente 3 "+c3.getNombre()+" "+c3.getDomicilio());
         }
       
        
        
        
    }
        
        
       
        
        
    
    

