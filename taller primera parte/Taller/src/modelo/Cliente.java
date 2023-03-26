/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author RocaVero
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private String domicilio;
    private String celular;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Cliente() {
    }

    public Cliente(String nombre, String domicilio, String celular) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.celular = celular;
    }

    public Cliente(int idCliente, String nombre, String domicilio, String celular) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.celular = celular;
    }
    
    
}
