/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciafamiliar;

/**
 *
 * @author Admin
 */
public  class Hijo extends Padre implements Madre, Hermano {
    private String nombre;
    

    public Hijo(String nombre, String apellido, Auto auto, Casa casa) {
        super(apellido, auto, casa);
        this.nombre = nombre;
       
    }

    public void conducir(){
        
         super.auto.avanzar(1000);
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    @Override
    public void cantar() {
        System.out.println("Se cantar como mama ");
    }

    @Override
    public void bailar() {
        System.out.println("Se bailar como mama");
    }

    @Override
    public void heredarDinero(double dinero) {
        System.out.println("Mi mama me heredo "+ dinero +" dinero ");  
    }
    

    @Override
    public String toString() {
        return super.toString() + "nombre=" + nombre;
    }

    @Override
    public void jugarFutbol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   
    
    
}
