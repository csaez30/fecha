
import accesoabasededatos.modelo.Alumno;
import accesoabasededatos.modelo.AlumnoData;
import accesoabasededatos.modelo.Conexion;
import accesoabasededatos.modelo.Cursada;
import accesoabasededatos.modelo.CursadaData;
import accesoabasededatos.modelo.Materia;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author cris
 */
public class Accesoabasededatos {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       
            Connection con = Conexion.getConexion();
       
        
 
        
            
                
                 AlumnoData ad = new AlumnoData();
            
                Alumno alu = new Alumno(11,"Martin Romero Gonzalez", LocalDate.of(1973, 11, 22),true);
                Materia mat = new Materia(1,"Laboratorio");
                ad.actualizarAlumno(alu);
                Cursada cur= new Cursada(alu, mat,0);
               CursadaData cd =new CursadaData();
               List<Cursada> lista=cd.obtenerCursadas();
               for (Cursada c:lista){
                   System.out.println("CURSADA "+c);
               }
               
               
               
            
            
                        
           
     
    }
}