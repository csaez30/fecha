/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author cris
 */
public class Directorio {
    
    private TreeMap<Long,Cliente> dir = new TreeMap<>();
    
    
    public void agregarCliente(long telefono, Cliente cliente ){
    
       dir.putIfAbsent(telefono, cliente);
    }
    
  public Cliente buscarCliente(long tel){
    return dir.get(tel);
   
     
    }
  public Set<Long> buscarTelefono(String apellido){
   HashSet<Long> telefonos = new HashSet<>();
      
   Set<Long> tels =dir.keySet(); //claves telefonos
    Iterator it = tels.iterator();
    while (it.hasNext()){
     Long telefono = (Long)it.next();
      Cliente c= dir.get(telefono);
      if (c.getApellido().equals(apellido)) {
             telefonos.add(telefono);
      }
    
    
    } //fin while
    return telefonos;
  
  }
  
  public List<Cliente> buscarClientes(String ciudad){
    
   ArrayList<Cliente> clientes = new ArrayList<>();
      
   Set<Long> tels =dir.keySet(); //claves telefonos
    Iterator it = tels.iterator();
    while (it.hasNext()){
     Long telefono = (Long)it.next(); //clave
      Cliente c= dir.get(telefono);//valor
      if (c.getCiudad().equals(ciudad)) {
             clientes.add(c);
      }
    
    
    } //fin while
    
    
   

    
    return clientes;
     
    }
}
