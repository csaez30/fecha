/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoabasededatos.vistas;

import accesoabasededatos.modelo.Alumno;
import accesoabasededatos.modelo.AlumnoData;
import accesoabasededatos.modelo.Conexion;
import java.time.LocalDate;

/**
 *
 * @author Javier
 */
public class TestConexion {
    public static void main(String...ar){
     Conexion conexion;
 
        try {
            conexion = new Conexion("jdbc:mysql://localhost/universidad", "root", "");
            
                        
            AlumnoData alumnoData = new AlumnoData(conexion);
            
            Alumno karina = new Alumno("Lopez Karina", LocalDate.of(1976, 01, 20),true);
            alumnoData.guardarAlumno(karina);
            
            
            for(Alumno it:alumnoData.obtenerAlumnos()){
            
                System.out.println("ID: "+it.getId());
                System.out.println("Nombre: "+it.getNombre());
            
            
            }
            
            alumnoData.borrarAlumno(karina.getId());
            
            for(Alumno it:alumnoData.obtenerAlumnos()){
            
                System.out.println("ID: "+it.getId());
                System.out.println("Nombre: "+it.getNombre());
            
            
            }
            //System.out.println("El id del alumno es: " + alumno1.getId());

            /*alumnoData.obtenerAlumnos().forEach(alumno -> {
                System.out.println("Nombre: " + alumno.getNombre() );
            });
            
            */
        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
   
        
    }
    
}
