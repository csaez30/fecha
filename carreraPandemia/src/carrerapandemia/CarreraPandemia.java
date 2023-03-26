/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrerapandemia;

/**
 *
 * @author cris
 */
public class CarreraPandemia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Auto auto1 = new Auto("SSSSSADAD","ROJO");
        Rueda r1= new Rueda("fate");
        Rueda r2 = new Rueda("fate"); 
        Rueda r3 = new Rueda("Pirelli");
        Rueda r4 = new Rueda("goodyear");
        Rueda r5 = new Rueda("china");
        
        auto1.quitarRueda(r5);
        auto1.colocarRueda(r1);
        auto1.colocarRueda(r2);
        auto1.colocarRueda(r3);
        auto1.colocarRueda(r4);
        auto1.colocarRueda(r5);
        auto1.quitarRueda(r5);
        
    }
    
}
