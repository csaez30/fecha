/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class ProyectoCelularJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chip claro= new Chip("claro",3243245);
        Chip movistar = new Chip("movistar",64564576);
        Chip personal = new Chip("personal",645646);
        claro.mostrar();
        movistar.mostrar();
        SmartPhone sp= new SmartPhone("Redmi8","xiaomi",3600);
        sp.agregarChip(movistar);
        sp.agregarChip(claro);
        sp.agregarChip(personal);
               
        sp.mostrar();
        Persona juanjo=new Persona("Juanjo ",4325353);
        juanjo.usarCelular(sp);
        
        
    }
    
}
