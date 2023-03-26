/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author MArio
 */
public class Agenda {
    //Atributos
    Map<Long, Cliente> directorio;
    
    //Metodos

    public Agenda() {
        this.directorio=new HashMap<>();
    }
    
    public void agregarCliente(Long telefono, Cliente cliente){
        directorio.put(telefono, cliente);
    }
    public Cliente buscarCliente(Long clave){
        if(directorio.containsKey(clave)){
            return directorio.get(clave);
        }
        else 
            return null;
    
    }
    public Set<Long> buscarTelefono(String apellido){
        Cliente c;
        HashSet<Long> telefonos=new HashSet<>();
        for(Long telefono: directorio.keySet()){
            c=directorio.get(telefono);
            if(c.getApellido().equals(apellido)){
                telefonos.add(telefono);
            }
        }
        return telefonos;
    }
    /*
    public Set<Long> buscarTelefono(String apellido){
        long clave;
        String ape;
        HashSet<Long> telefonos=new HashSet<>();
        for(Map.Entry<Long,Cliente> it: directorio.entrySet()){
            clave=it.getKey();
            ape=it.getValue().getApellido();
            if(apellido.equals(ape)){
                telefonos.add(clave);
            }
        }
        return telefonos;
    }
    */
    
    public Set<Cliente> buscarClientes(String ciudad){
        Cliente c;
        Set<Cliente> clientes=new HashSet<>();
        directorio.values().stream().filter((lugar) -> (lugar.getCiudad().equals(ciudad))).forEachOrdered((lugar) -> {
            clientes.add(lugar);
        });
        return clientes;
    }
    
    
     public void borrarCliente(int dni){
        List<Long> aux2= new ArrayList<>();
        
        Set<Long> tels=directorio.keySet();
        Iterator it=tels.iterator();
        while(it.hasNext()){
        
            Long telefono=(Long)it.next();
            Cliente c=directorio.get(telefono);
            if(c.getDni()==dni){
                aux2.add(telefono);
               
            }
        }
     it=aux2.iterator();
      while(it.hasNext()){
        
            Long telefono=(Long)it.next();
            System.out.println("borra   "+directorio.get(telefono).getApellido());
             directorio.remove(telefono);
            
     }}
   /* public void borrarCliente(int dni){
        //Long telefono;
        int aux;
        Long telefono;
         Set<Long> tels = directorio.keySet();
       /* List<Long> aux2= new ArrayList<>();
        
       
        for(Map.Entry<Long, Cliente> it: directorio.entrySet()){
        telefono=(Long)it.getKey();
        aux=it.getValue().getDni();
        if(aux == dni){
        System.out.println("borra "+it.getValue().getApellido());
         directorio.remove(aux2);
        }
        
        }
       
        Iterator it=tels.iterator();
       while (it.hasNext()) {
           telefono= (Long)it.next();
            aux = directorio.get(telefono).getDni();
            if(aux == dni){
                System.out.println("Entro aca");
                directorio.remove(telefono);
               
            }
        }
        
    }
*/
    public Map<Long, Cliente> getDirectorio() {
        return directorio;
    }

    
}  
  

