/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplouniversidad.entidades;

/**
 *
 * @author cris
 */
public class Inscripcion {
    private int idInscripcion;
    private Alumno Alumno;
    private Materia Materia;
    private double calificacion;
    public Inscripcion(){}

    public Inscripcion(int idInscripcion, Alumno Alumno, Materia Materia, double calificacion) {
        this.idInscripcion = idInscripcion;
        this.Alumno = Alumno;
        this.Materia = Materia;
        this.calificacion = calificacion;
    }

    public Inscripcion(Alumno Alumno, Materia Materia, double calificacion) {
        this.Alumno = Alumno;
        this.Materia = Materia;
        this.calificacion = calificacion;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return Alumno;
    }

    public void setAlumno(Alumno Alumno) {
        this.Alumno = Alumno;
    }

    public Materia getMateria() {
        return Materia;
    }

    public void setMateria(Materia Materia) {
        this.Materia = Materia;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    

    
    
    
}
