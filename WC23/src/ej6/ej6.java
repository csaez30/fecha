/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

/**
 *
 * @author cris
 */
public class ej6 {
    
    public static void main(String args[]){
        
        Cliente c1= new Cliente("Juan","Lopez","San Luis","Mitre");
        Cliente c2= new Cliente("Martin","Suarez","Mendoza","Junin");
        Cliente c3= new Cliente("Ana","Prez","San Luis","chacabuco");
        Directorio d =new Directorio();
        d.agregarCliente(1111, c3);
        d.agregarCliente(2222, c3);
        d.agregarCliente(3333, c2);
        d.agregarCliente(5555, c1);
        d.buscarCliente(1111);
        d.buscarClientes("San Luis");
        d.buscarTelefono("Prez");
        
    
    
    
    }
    
}
