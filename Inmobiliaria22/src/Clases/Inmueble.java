/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author USER
 */
public class Inmueble {
    private int idInmueble;
    private Propietario propietario;
    private String direccion;
    private int cantAmbientes;
    private boolean disponible;
    private double costo;

    public Inmueble() {
    }

    public Inmueble(Propietario propietario, String direccion, int cantAmbientes, boolean disponible, double costo) {
        this.propietario = propietario;
        this.direccion = direccion;
        this.cantAmbientes = cantAmbientes;
        this.disponible = disponible;
        this.costo = costo;
    }

    public Inmueble(int idInmueble, Propietario propietario, String direccion, int cantAmbientes, boolean disponible, double costo) {
        this.idInmueble = idInmueble;
        this.propietario = propietario;
        this.direccion = direccion;
        this.cantAmbientes = cantAmbientes;
        this.disponible = disponible;
        this.costo = costo;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantAmbientes() {
        return cantAmbientes;
    }

    public void setCantAmbientes(int cantAmbientes) {
        this.cantAmbientes = cantAmbientes;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
    
}
