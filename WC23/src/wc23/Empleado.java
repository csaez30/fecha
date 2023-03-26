/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wc23;

/**
 *
 * @author cris
 */
public class Empleado {
    private String Nombre;
    private long sueldo = 50000;

    public Empleado(String Nombre) {
        this.Nombre = Nombre;
    }
    public Empleado(String Nombre, long sueldo) {
        this.Nombre = Nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    
    
}
