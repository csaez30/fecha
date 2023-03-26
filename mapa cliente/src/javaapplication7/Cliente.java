/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author MArio
 */
public class Cliente {
    //Atributos
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    private int dni;
    //Metodos

    public Cliente() {
    }
    
    public Cliente(String apellido, int dni) {
        this.apellido = apellido;
        this.dni=dni;
    }

    public Cliente(String apellido,String nombre, int dni, String ciudad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dni=dni;
    }
     public Cliente(String apellido,String nombre, int dni, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.dni=dni;
    }
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
