/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.modelo;

/**
 *
 * @author Usuario
 */
public class Inscripcion {
    private int idInscripcion=-1;
    private Alumno alumno;
    private Materia materia;
    private double nota;
    
    public Inscripcion(Materia materia,Alumno alumno, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }
        
    public Inscripcion(int id, Alumno alumno, Materia materia, double nota) {
        this.idInscripcion = id;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(){}
    
    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int id) {
        this.idInscripcion = id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", alumno=" + alumno + ", materia=" + materia + ", nota=" + nota + '}';
    }
  

    
    
    
    
}
