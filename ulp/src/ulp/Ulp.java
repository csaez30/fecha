/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulp;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ulp.modelo.Alumno;
import ulp.controlador.AlumnoData;
import ulp.controlador.Conexion;
import ulp.controlador.CursadaData;
import ulp.controlador.MateriaData;
import ulp.modelo.Cursada;
import ulp.modelo.Materia;

/**
 *
 * @author cris
 */
public class Ulp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Conexion conexion;
        try {
            conexion = new Conexion();
           //Alumno juan= new Alumno(1,"Juan Perez",LocalDate.of(1999,10,10),true);
          AlumnoData ad = new AlumnoData(conexion);
           Alumno a1=ad.buscarAlumno(1);
           //Materia ingles = new Materia(2,"Lengua");
           MateriaData md = new MateriaData(conexion);
           Materia m1=md.buscarMateria(1);
           Cursada c1= new Cursada(a1,m1,10);
           CursadaData cd= new CursadaData(conexion);
          // cd.guardarCursada(c1);
         /* List<Cursada> lista= new ArrayList<Cursada>();
          lista = cd.obtenerCursadas();
          for (Cursada it: lista){
              System.out.println("Alumno "+it.getAlumno().getNombre()+" Materia "+it.getMateria().getNombre());
          }*/
        /* List<Cursada> lista= new ArrayList<Cursada>();
          lista = cd.obtenerCursadasAlumno(1);
          for (Cursada it: lista){
              System.out.println("Alumno "+it.getAlumno().getNombre()+" Materia "+it.getMateria().getNombre());
          }*/
         
         List<Materia> lista= new ArrayList<Materia>();
          lista = cd.obtenerMateriasCursadas(1);
         // AlumnoData ad = new AlumnoData(conexion);
          for (Materia it: lista){
              System.out.println("Alumno  "+ad.buscarAlumno(1)+" Materia "+it.getNombre());
          }
             
          cd.actualizarNotaCursada(1, 1, 7);
          //cd.borrarCursadaDeUnaMateriaDeunAlumno(1, 1);
            } 
        
        
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
      
        
    }

    private static void CursadaData(Conexion conexion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
