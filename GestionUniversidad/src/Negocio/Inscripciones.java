/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.Alumno;
import Entidades.Nota;
import Entidades.Materia;
import Entidades.Cursada;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejo
 */
public class Inscripciones {
    List<Cursada> cursadas = new ArrayList<>();

    public Inscripciones() {
    }
    
    public void Inscribir(Alumno alumno, Materia materia){
        cursadas.add(new Cursada(alumno, materia));
    }
    
    public List<Materia> getMaterias(Alumno alumno){
        List<Materia> materias = new ArrayList<>();
        
        for(Cursada cursada : cursadas){
            if(cursada.getAlumno().getId() == alumno.getId())
                materias.add(cursada.getMateria());
        }
        return materias;
    }
    
    public List<Alumno> getAlumnos(Materia materia){
        List<Alumno> alumnos = new ArrayList<>();
        
        for(Cursada cursada : cursadas){
            if(cursada.getMateria().getId() == materia.getId())
                alumnos.add(cursada.getAlumno());
        }
        return alumnos;
    }
    
    public void Calificar(Alumno alumno, Materia materia, Nota nota){
        for(Cursada cursada : cursadas){
            if(cursada.getAlumno().getId() == alumno.getId() && cursada.getMateria().getId() == materia.getId())
                cursada.setNota(nota);
        }
    }    
}
