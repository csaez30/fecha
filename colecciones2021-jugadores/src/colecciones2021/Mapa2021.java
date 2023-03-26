/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones2021;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class Mapa2021 {
   private  Map<Integer,Jugador> jugadores;//parejas

    public Mapa2021() {
        jugadores= new HashMap<>();
    }
   
   public void agregarJugadores(){
       jugadores.put(10,new Jugador("Messi","delantero"));
       jugadores.put(2,new Jugador("Acuña","defensor"));
       jugadores.put(22,new Jugador("Otamendi","defensor"));
       jugadores.put(11,new Jugador("Di Maria","mediocampista"));
       jugadores.put(12,new Jugador("Gomez","delantero"));
       jugadores.put(5,new Jugador("Paredes","mediocampista"));
       jugadores.put(1,new Jugador("Martinez","arquero"));
       jugadores.put(2,new Jugador("Muzo","arquero"));
       jugadores.put(9,new Jugador("Aguero","delantero"));
         
   
   }
   
   public void mostrarJugadores(){
   
   Set <Integer> numeros= jugadores.keySet();  //claves
//   Iterator it=numeros.iterator();
//   while (it.hasNext()){
//      Integer numero=(Integer)it.next(); //clave
//      Jugador jugador=jugadores.get(numero); //valor
//       System.out.println("Jugador nro "+numero+" "+jugador);
//      
//   }


//for(Map.Entry<Integer,Jugador> e:jugadores.entrySet()){ //recorro de parejas
//
//     Integer clave= e.getKey();
//     Jugador valor= e.getValue();
//     
//     System.out.println("Clave "+clave+" valor "+valor);
//}
  Collection valores = jugadores.values();
  Iterator it=valores.iterator();
  while (it.hasNext()){
  Jugador valor=(Jugador)it.next();
      System.out.println("valores "+valor);
  }
   
   }
 public Jugador buscarJugador(Integer numero){
     Jugador jugador=null;
     if (jugadores.containsKey(numero)){
       jugador=jugadores.get(numero); 
         
     }
     
  return jugador;
 }    
public List<Jugador> buscarTodos(String posicion){
 ArrayList<Jugador> equipo = new ArrayList<>();
    
  Collection valores = jugadores.values();
  Iterator it=valores.iterator();
  
  while (it.hasNext()){
  Jugador valor=(Jugador)it.next();
    if(valor.getPosicion().equals(posicion)){
        equipo.add(valor);
    }
  }
  
  return equipo;
}


}
 
 
 

  
  
      



 
    

