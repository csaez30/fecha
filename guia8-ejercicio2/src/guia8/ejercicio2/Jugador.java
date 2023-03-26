/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejercicio2;

/**
 *
 * @author Admin
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre+id;
        this.mojado = true;
    }
    
    public int getId() {
        return id;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
  public boolean  disparo(RevolverDeAgua r){
  r.siguienteChorro();
  if (r.mojar())  { System.out.println("disparo realizado, el jugador fue mojado");
                    mojado=false; //jugador esta mojado vivo=false
                    return true;}
  else{
      
      return false;
      
  }
 
      
  } 

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
  
  }  
    


