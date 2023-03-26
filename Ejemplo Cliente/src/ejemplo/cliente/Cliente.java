/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.cliente;

/**
 *
 * @author cris
 */
public class Cliente {
    private int id;
    private int dni;
    private String nombre;
    private String domicilio;

    public Cliente() {    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public Cliente(int dni, String nombre, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    

    
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }
    
    
    
    
    
}
