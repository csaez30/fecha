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
public class Padre {

   protected String apellido;
   protected Auto auto;
   protected Casa casa;

    public Padre(String apellido, Auto auto, Casa casa) {
        this.apellido = apellido;
        this.auto = auto;
        this.casa = casa;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    @Override
    public String toString() {
        return  "apellido=" + apellido + ", auto=" + auto + ", casa=" + casa + '}';
    }
   
    
    
}
