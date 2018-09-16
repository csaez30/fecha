/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidad;

import Entidades.Alumno;
import Entidades.Nota;
import Entidades.Materia;
import Negocio.Inscripciones;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alejo
 */
public class Gestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno juan = new Alumno(1, "Juan");
        Alumno maria = new Alumno(2, "Maria");
        Alumno laura = new Alumno(3, "Laura");
        
        Materia matematica = new Materia(1, "Matematica");
        Materia geografia = new Materia(2, "Geografia");
        
        Inscripciones inscripciones = new Inscripciones();

        inscripciones.Inscribir(juan, matematica);
        inscripciones.Inscribir(maria, matematica);
        inscripciones.Inscribir(juan, geografia);
        inscripciones.Inscribir(laura, geografia);
        
        
        inscripciones.Calificar(juan, matematica, new Nota(10, new Date(2018, 9, 12)) );
        
        List<Alumno> mateAlumn = inscripciones.getAlumnos(matematica);
        
        for(Alumno alumno : mateAlumn){
            System.out.println(alumno.getNombre() + " cursa matematica");
        }
        
        List<Materia> materiasJuan = inscripciones.getMaterias(juan);

        for(Materia materia : materiasJuan){
            System.out.println("Juan esta inscripto en: " + materia.getNombre());
        }
        
        
        
    }
    
}
