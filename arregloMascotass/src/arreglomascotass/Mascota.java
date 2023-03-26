/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglomascotass;

/**
 *
 * @author Admin
 */
public class Mascota {
    private int edad;
    private String raza;

    public Mascota() {
    }

    public Mascota(int edad, String raza) {
        this.edad = edad;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Mascota{" + "edad=" + edad + ", raza=" + raza + '}';
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
