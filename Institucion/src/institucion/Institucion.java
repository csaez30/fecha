/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;

import institucion.data.AlumnoData;
import institucion.data.InscripcionData;
import institucion.data.MateriaData;
import institucion.modelo.Alumno;
import institucion.modelo.Conexion;
import institucion.modelo.Inscripcion;
import institucion.modelo.Materia;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Institucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion conexion;
        Alumno a=new Alumno(4,"Mario", "Rojas", LocalDate.of(1974, 02, 02),true);
        Materia m=new Materia(3,"Ingles", 2, true);
        
        Inscripcion insc=new Inscripcion(m, a, 10);
        try {
            conexion = new Conexion();
        //    AlumnoData ad= new AlumnoData(conexion);
         //   ad.guardarAlumno(a);
           // MateriaData md= new MateriaData(conexion);
          //  md.guardarMateria(m);
            InscripcionData id=new InscripcionData(conexion);
            id.inscribir(insc);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Institucion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
