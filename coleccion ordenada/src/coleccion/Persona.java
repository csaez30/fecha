/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion;

/**
 *
 * @author cris
 */
public class Persona implements Comparable {

private int dni;

private String nombre;

public Persona(int dni,String nombre){

this.dni=dni;

this.nombre=nombre;

}

public String toString(){

return dni+" "+nombre;

}

//public int compareTo(Object ob){
//
//int doc=((Persona)ob).dni;

//return dni < doc ?-1 :(dni==doc ?0:1);

//}
public int compareTo(Object ob){

String nom=((Persona)ob).nombre;
return nombre.compareTo(nom) < 0 ?-1 :(nombre.compareTo(nom)==0 ?0:1);

}
}
