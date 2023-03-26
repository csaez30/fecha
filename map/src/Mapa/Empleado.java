/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

/**
 *
 * @author cris
 */
public class Empleado {
    private String nombre;
    private long sueldo=10000;

    public Empleado() {
    }

    
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public Empleado(String nombre, long sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }
    public String toString(){
       return nombre+" "+sueldo;
    }
    
    
}
