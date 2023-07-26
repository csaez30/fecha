/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import control.*;
import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Universidad20223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alu = new Alumno(14,"Bernanrda","Quiroga",LocalDate.of(2000, 02, 23),true);
        AlumnoData ad = new AlumnoData();
       // ad.actualizarAlumno(alu);
        //ad.guardarAlumno(alu);
        System.out.println(" el alumno es "+ad.buscarAlumno(14));
    }
    
}
