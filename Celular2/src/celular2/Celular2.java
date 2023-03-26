/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celular2;

/**
 *
 * @author Admin
 */
public class Celular2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Smart sp = new Smart("A20360", "sansumg",3000);
        sp.mostrar();
        Chip claro= new Chip("claro",43243254);
        claro.mostrar();
        Chip movistar = new Chip ("movistar",543545);
        movistar.mostrar();
        
        sp.agregarChip(movistar);
        sp.agregarChip(claro);
        sp.mostrar();
        
        Persona juan= new Persona("juan Perez ", 43536546);
        juan.usarCelular(sp);
        
    }
    
}
