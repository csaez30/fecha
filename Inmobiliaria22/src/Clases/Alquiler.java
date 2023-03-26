/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Alquiler {
    private int idAlquiler;
    private Inquilino inquilino;
    private Inmueble inmueble;
    private LocalDate fechInicio;
    private double costo;

    public Alquiler() {
    }

    public Alquiler(Inquilino inquilino, Inmueble inmueble, LocalDate fechInicio, double costo) {
        this.inquilino = inquilino;
        this.inmueble = inmueble;
        this.fechInicio = fechInicio;
        this.costo = costo;
    }

    public Alquiler(int idAlquiler, Inquilino inquilino, Inmueble inmueble, LocalDate fechInicio, double costo) {
        this.idAlquiler = idAlquiler;
        this.inquilino = inquilino;
        this.inmueble = inmueble;
        this.fechInicio = fechInicio;
        this.costo = costo;
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public LocalDate getFechInicio() {
        return fechInicio;
    }

    public void setFechInicio(LocalDate fechInicio) {
        this.fechInicio = fechInicio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
}
