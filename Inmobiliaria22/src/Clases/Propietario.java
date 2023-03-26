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
public class Propietario {
    private int idPropietario;
    private String nombreCompleto;
    private long dni;
    private long celular;

    public Propietario() {
    }

    public Propietario(String nombreCompleto, long dni, long celular) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.celular = celular;
    }

    public Propietario(int idPropietario, String nombreCompleto, long dni, long celular) {
        this.idPropietario = idPropietario;
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.celular = celular;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }
    
    
    
}
