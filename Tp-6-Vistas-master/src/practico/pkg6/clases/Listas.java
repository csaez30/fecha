/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg6.clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author luciano.echevarne
 */
public class Listas {
    
     static TreeMap <Long,Cliente> lista= new TreeMap<>();
     
     public int agregarCliente(Long telefono,Cliente s){
        if (lista.put(telefono, s)==null){return 1;}
        else return 0;
}
     public Cliente buscarCliente(Long telefono){
        return lista.get(telefono);
     }
     public ArrayList<Long> buscarTelefono (String apellido){
         ArrayList<Long> resultado=new ArrayList<>();
         Set<Long> key=lista.keySet();
         Iterator it=key.iterator();
         while(it.hasNext()){
             Long l1=(Long)it.next();
             Cliente c1=lista.get(l1);
             if(c1.getApellido().equals(apellido)){
                 resultado.add(l1);
             }
         }
         return resultado;
     }
     public ArrayList<String> buscarClientes(String ciudad){
         ArrayList<String> resultado=new ArrayList<>();
         Set<Long> key=lista.keySet();
         Iterator it=key.iterator();
         while(it.hasNext()){
             Long l1=(Long)it.next();
             Cliente c1=lista.get(l1);
             if(c1.getCiudad().equals(ciudad)){
                 resultado.add(c1.toString());
             }
         }
         return resultado;
     }
     public int borrarCliente(String dni){
         int ok=0;
         Set<Long> key=lista.keySet();
         Iterator it=key.iterator();
         while(it.hasNext()){
             Long l1=(Long)it.next();
             Cliente c1=lista.get(l1);
             if(c1.getDni().equals(dni)){
                it.remove();
                ok=1;
             }
         }
         return ok;
     }
}
