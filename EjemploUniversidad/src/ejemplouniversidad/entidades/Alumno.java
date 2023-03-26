/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplouniversidad.entidades;

import java.time.LocalDate;

/**
 *
 * @author cris
 */
public class Alumno {
  
    private int idAlumno;
    private String nombre;
    private LocalDate fn_alumno;
    private boolean activo;

    public Alumno() {
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

   /* @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", fn_alumno=" + fn_alumno + ", activo=" + activo + '}';
    }*/

    public Alumno(int idAlumno, String nombre, LocalDate fn_alumno, boolean activo) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.fn_alumno = fn_alumno;
        this.activo = activo;
    }
    

    public Alumno(String nombre_alumno, LocalDate fn_alumno, boolean activo) {
        this.idAlumno = idAlumno;
        this.nombre = nombre_alumno;
        this.fn_alumno = fn_alumno;
        this.activo = activo;
    }

    public int getId_alumno() {
        return idAlumno;
    }

    public void setId_alumno(int id_alumno) {
        this.idAlumno = id_alumno;
    }

    public String getNombre_alumno() {
        return nombre;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre= nombre_alumno;
    }

    public LocalDate getFn_alumno() {
        return fn_alumno;
    }

    public void setFn_alumno(LocalDate fn_alumno) {
        this.fn_alumno = fn_alumno;
    }

    public boolean isActivo() {
        return activo;
    }

    public String getNombre() {
     return nombre;
    }
    @Override
    public String toString(){
        
        
        return idAlumno+"-"+nombre;
    
        
    }
}
