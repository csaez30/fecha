/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.modelo;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Visita {
    private int id=1;
    private LocalDate fecha;
 
    private String detalle;
    private double pesoActual;
    private Mascota mascota;
    private Tratamiento tratamiento;

    public Visita() {
        this.id = -1;
    }

    
    public Visita(LocalDate fecha, String detalle, double pesoActual, Mascota mascota, Tratamiento tratamiento) {
        this.fecha = fecha;
        this.detalle = detalle;
        this.pesoActual = pesoActual;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
    }
    
     public Visita(LocalDate fecha, Mascota mascota, Tratamiento trataminto) {
        this.fecha = fecha;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

  

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }
     
     
    
    
    
    
}
