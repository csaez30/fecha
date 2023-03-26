/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librerira.Modelo;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Autor {
    private int idAutor;
    private String apellido;
    private String nombre;
    private LocalDate fechaNac;

    public Autor() {
    }

    public Autor(String apellido, String nombre, LocalDate fechaNac) {
        this.idAutor = idAutor;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Autor{" + "idAutor=" + idAutor + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNac=" + fechaNac + '}';
    }
    
    
}
