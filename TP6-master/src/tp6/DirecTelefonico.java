/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;
import java.util.*;
/**
 *
 * @author Dani Barros
 */
public class DirecTelefonico {
    HashMap<String, Cliente> clientes = new HashMap<>();
    
    
    public void mostraClientes(){
        System.out.println(clientes);
    }
    
    public void agregarCliente(String numero, Cliente c){
        clientes.put(numero, c);
    }
    
   public void buscarCliente(String numero){
       System.out.println(clientes.get(numero));
   }
    public Cliente buscarClientePorDni(String dni){
       Set<String> tels = clientes.keySet();
        System.out.println("telefonos "+tels);
       Iterator iterador = tels.iterator();
       while(iterador.hasNext()){
           String telefono = (String)iterador.next();
           Cliente c1 = clientes.get(telefono);
           
           if(c1.getDni().equals(dni)){
               System.out.println("cliente encontrado");
               return c1;
              
           }
       }
       
       return null;
   }
   public Set<String> buscarTelefono(String apellido){
       HashSet<String> telefonos = new HashSet<>();
       
       Set<String> tels = clientes.keySet();
       
       Iterator iterador = tels.iterator();
       while(iterador.hasNext()){
           String telefono = (String)iterador.next();
           Cliente cl = clientes.get(telefono);
           
           if(cl.getApellido().equals(apellido)){
               telefonos.add(telefono);
           }
       }
       System.out.print(telefonos);
       return telefonos;
   }
   
 
    public List<Cliente> buscarClientes(String ciudad){ //Creo un metodo de tipo Cliente en forma de Lista
        ArrayList<Cliente> clientesC=new ArrayList<>(); //Nuevo Arraylist donde se guardan los clientes de tal ciudad

         //lista es un HasMap o TreeMap
         Set<String> tels=clientes.keySet();    //Guardo en tels, las claves de clientes, en este caso los numeros de celular
           Iterator it = tels.iterator();       //Un iterador  es un objeto que nos permite  recorrer una lista 
            while(it.hasNext()){                //bucle, recorre it, hasNext()devuelve true si existe un siguiente elemento a la hora de iterar sobre una colección.

             String telefono=(String)it.next(); // variable telefono es igual al siguiente elemento.
             Cliente c=clientes.get(telefono);  //Guarda en c los clientes con la clave en este caso el telefono
              if(c.getCiudad().equals(ciudad)){ //compara si la ciudad introducida es como la de getCiudad de c.

               clientesC.add(c);                //agrega a clientesC el los clientes con el telefono dicho
           }
     }
               System.out.println(clientesC); //Imprimimos los clientes con el numero de telefono solicitado
               return clientesC;

}
     public void borrarCliente(String dni){
         String temp=null; 
         Set<String> claves=clientes.keySet();
         Iterator it=claves.iterator();
         while (it.hasNext()){
             String clave = (String)it.next();
             Cliente c=clientes.get(clave);
             
             
             if(c.getDni().equals(dni)){
                  it.remove();
                  System.out.println("Cliente borrado...");
             }
         }
          // clientes.remove(temp);
}}