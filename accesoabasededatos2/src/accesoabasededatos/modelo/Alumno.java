/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoabasededatos.modelo;

import java.time.LocalDate;

/**
 *
 * @author alejo
 */
public class Alumno {
    private int id = -1;
    private String nombre;
    private LocalDate fechNac;
    private boolean activo;

    

    public Alumno(String nombre, LocalDate fechNac, boolean activo) {
        this.id = -1;
        this.nombre = nombre;
        this.fechNac = fechNac;
    }
    
    public Alumno(){ }
    
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

    public LocalDate getFechNac() {
        return fechNac;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fechNac = fecNac;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public String toString(){
    
        return id+"-"+nombre;
    }
    
    
}
