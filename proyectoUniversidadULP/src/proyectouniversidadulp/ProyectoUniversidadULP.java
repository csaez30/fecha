/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidadulp;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectouniversidadulp.control.AlumnoData;
import proyectouniversidadulp.control.InscripcionData;
import proyectouniversidadulp.control.MateriaData;
import proyectouniversidadulp.modelo.Alumno;
import proyectouniversidadulp.modelo.Conexion;
import proyectouniversidadulp.modelo.Inscripcion;
import proyectouniversidadulp.modelo.Materia;

/**
 *
 * @author Admin
 */
public class ProyectoUniversidadULP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Conexion conexion= new Conexion();
            AlumnoData ad = new AlumnoData(conexion);
            MateriaData md= new MateriaData(conexion);
            InscripcionData id= new InscripcionData(conexion);
            
           // Alumno a = new Alumno(3,1143, "Juan","Lopez", LocalDate.of(2000,2, 24),true);
           // Materia m = new Materia(2,"Matematicas", 1,true);
          //  Inscripcion i=new Inscripcion(a,m,10);
            
           // ad.guardarAlumno(a);
         //   id.guardarInscripcion(i);
            
            for(Inscripcion a1:id.obtenerInscripcionesMateria(1)){
               
                System.out.println(a1);
            
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("En el main"+ ex);
        }
    }
    
}
