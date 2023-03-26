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
public class Inquilino {
    private int idInquilino;
    private String nombreCompleto;
    private long dni;
    private long celular;
    private boolean activo;

    public Inquilino() {
    }

    public Inquilino(String nombreCompleto, long dni, long celular, boolean activo) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.celular = celular;
        this.activo = activo;
    }

    public Inquilino(int idInquilino, String nombreCompleto, long dni, long celular, boolean activo) {
        this.idInquilino = idInquilino;
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.celular = celular;
        this.activo = activo;
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
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

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
