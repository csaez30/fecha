/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.cina;

/**
 *
 * @author Admin
 */
public class Guia8Cina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Pelicula pelicula= new Pelicula("Rambo 1",2,16,"Spilberg");   
     Cine cine= new Cine(pelicula,400);   
     
     cine.llenarAsientos();
     cine.mostrarSala();
     
    }
    
}
