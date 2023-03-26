/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecouniversisdad2021;

import control.AlumnoData;
import control.CursadaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import modelo.Alumno;
import modelo.Conexion;
import modelo.Cursada;
import modelo.Materia;

/**
 *
 * @author Admin
 */
public class ProyecoUniversisdad2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
         
        Conexion conexion= new Conexion("jdbc:mysql://localhost/universidad","root","");
                       
        LocalDate fecha= LocalDate.of(2020,2, 12);
        Alumno a = new Alumno("Casandra",fecha, false); //creo un objeto alumno
        AlumnoData ad= new AlumnoData(conexion);
        ad.guardarAlumno(a); //lo guardo en la base
        System.out.println(ad.buscarAlumno(1));
        Materia m = new Materia("Matematica aplicada");
        Cursada cursada = new Cursada(a,m,9);
       // CursadaData cd = new CursadaData(conexion);
        //cd.guardarCursada(cursada);
        
    }
    
}
