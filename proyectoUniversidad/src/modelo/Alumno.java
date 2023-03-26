/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author cris
 */
public class Alumno {
    private int id;
    private int dni;
    private String nombre;
    private String domicilio;
    private LocalDate fechaNac;

    public Alumno() {
    }

    public Alumno(int dni, String nombre, String domicilio,LocalDate fechaNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaNac = fechaNac;
    }

    public int getId() {
        return id;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
   @Override
    public String toString(){
    
        return id+"-"+nombre;
    }
 
    
    
    
    
}
