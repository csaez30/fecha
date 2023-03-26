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
public class Persona {
    String nombre;
    int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    void usarCelular(Smart cel){
        Chip claro= new Chip("claro",1324325);
       cel.agregarChip(claro);
        System.out.println("Realizando llamada desde "+cel.toString());
    }       
    
}
