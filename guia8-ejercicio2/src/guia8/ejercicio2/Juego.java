/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Juego {
   private ArrayList<Jugador> jugadores;
   private RevolverDeAgua revolver;
    
     public Juego() {
        jugadores= new ArrayList<>();
        revolver = new RevolverDeAgua();
    }
    public void llenarJuego() {
       Jugador j;
       
        int num,id;
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.println("elija en numero de jugadores entre 1 y 6");
        num=leer.nextInt();
        if (num>6 || num<0)
            num=6;
        for (int i=0; i<num;i++){
            System.out.println("Ingrese id del Jugador");
            id= leer.nextInt();
            System.out.println("Ingrese el nombre ");
            nombre = leer.next();
            j=new Jugador(id,nombre);
            jugadores.add(j);
        }
    }

   public void ronda(){
     Jugador jugador=null;  
     boolean ganado=false;
    Iterator it;
  while (!ganado){  //sigue hasta que gane alguno
    it= jugadores.iterator();
    while (it.hasNext()){ //cada jugador dispara una vez
                
       jugador= (Jugador)it.next();
      
      if (jugador.disparo(revolver) && !jugador.isMojado()){
          System.out.println("HAS GANADO EL JUEGO!!!! "+jugador.getNombre());
          ganado=true;
      } else
           System.out.println("El jugador "+jugador.getNombre()+" no fue mojado "); 
          
   
   }
  }
   if (!ganado) System.out.println("Ningun Jugador Gano el Juego ");
   
   }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }
    
    
}
