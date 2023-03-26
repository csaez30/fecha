/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testagendatelefonica;

import java.util.HashMap;
import java.util.HashSet;
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
        Long telefono;
        int aux;
        for(Map.Entry<Long, Cliente> it: directorio.entrySet()){
            telefono=it.getKey();
            aux=it.getValue().getDni();
            if(aux == dni){
                System.out.println("Entro aca");
                directorio.remove(telefono);
            }
        }
    }

    public Map<Long, Cliente> getDirectorio() {
        return directorio;
    }

    
}  
  

