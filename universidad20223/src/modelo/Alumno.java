/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author alejo
 */
public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private LocalDate fecNac;
    private boolean activo;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, LocalDate fecNac, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecNac = fecNac;
        this.activo = activo;
    }

    public Alumno(String nombre, String apellido, LocalDate fecNac, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecNac = fecNac;
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fecNac=" + fecNac + ", activo=" + activo + '}';
    }
    

    
    
    
    
}
