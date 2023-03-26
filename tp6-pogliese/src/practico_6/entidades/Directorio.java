/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico_6.entidades;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */
public class Directorio {
    protected TreeMap <Long,Cliente> directorio = new TreeMap();
    
    public Cliente agregarCliente(long telefono, long dni, String apellido, String nombre, String ciudad, String domicilio) {
        return directorio.put(telefono, new Cliente(dni, apellido, nombre, ciudad, domicilio));
    }                          
    
    public Cliente buscarCliente(long telefono) {
        return directorio.get(telefono);
    }
    
    
    public TreeMap buscarClientes(String ciudad) {
        TreeMap <Long,Cliente> filtro = new TreeMap<>();
        Set <Long> claves = directorio.keySet();
        for (long key:claves) {
            if (directorio.get(key).getCiudad().equals(ciudad)) {
                filtro.put(key, directorio.get(key));
            }
        }
        return filtro;
    }
    
    public TreeMap <Long,Cliente> buscarTelefono (String apellido) {
        TreeMap <Long,Cliente> filtro = new TreeMap<>();
        Set <Long> claves = directorio.keySet();
            for (long key:claves) {
                if (directorio.get(key).getApellido().equals(apellido)) {
                    filtro.put(key, directorio.get(key));
                }
            }
        return filtro;
    }
    public Cliente borrarCliente (long dni) {
        Set <Long> claves = directorio.keySet();
            for (long key:claves) {
                if (directorio.get(key).getDni()==dni) {
                    return directorio.remove(key);
                    
                }
            }
        return null;    
    }
    
    public Cliente buscarClienteDni (long dni) {
        Set <Long> claves = directorio.keySet();
            for (long key:claves) {
                if (directorio.get(key).getDni()==dni) {
                    return directorio.get(key);
                    
                }
            }
        return null;    
    }
        
    
    public TreeMap<Long,Cliente> getDirectorio() {
        return directorio;
        
    }

      
}
