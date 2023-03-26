/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidad;

import java.time.LocalDate;
import modelo.Alumno;
import modelo.AlumnoData;
import modelo.Conexion;
import modelo.Cursada;
import modelo.CursadaData;
import modelo.Materia;
import modelo.MateriaData;

/**
 *
 * @author cris
 */
public class ProyectoUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Conexion con = new Conexion();  
        LocalDate fecha1 = LocalDate.of(1973, 02, 24);
       LocalDate fecha2 = LocalDate.now();

      Alumno a1 = new Alumno(124354,"Juan","Mitre 123",fecha1);  
      Alumno a2 = new Alumno(8888,"Marisa","Ayacucho 123",fecha2);  
      Materia m1 = new Materia("Lengua","Profe Manuel","primer cuatrimestre");  
      
     
      
      AlumnoData ad = new AlumnoData(con);
      ad.guardarAlumno(a1);
      ad.guardarAlumno(a2);
      MateriaData md = new MateriaData(con);
      md.guardarMateria(m1);
       Cursada c1 = new Cursada(a1,m1,10);
      CursadaData cd = new CursadaData(con);
      cd.guardarCursada(c1);
    }
    
}
