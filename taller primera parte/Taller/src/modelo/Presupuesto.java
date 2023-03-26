
package modelo;

import java.time.LocalDate;
import java.util.List;

public class Presupuesto {
    private int idPresupuesto;
    private Aparato aparato;
    private Servicio servicio;
    private LocalDate FecRealizacion;
    private boolean estado; 

    public LocalDate getFecRealizacion() {
        return FecRealizacion;
    }

    public void setFecRealizacion(LocalDate FecRealizacion) {
        this.FecRealizacion = FecRealizacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public Aparato getAparato() {
        return aparato;
    }

    public void setAparato(Aparato aparato) {
        this.aparato = aparato;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Presupuesto() {
    }

    public Presupuesto(int idPresupuesto, Aparato aparato, Servicio servicio, LocalDate FecRealizacion, boolean estado) {
        this.idPresupuesto = idPresupuesto;
        this.aparato = aparato;
        this.servicio = servicio;
        this.FecRealizacion = FecRealizacion;
        this.estado = estado;
    }

    public Presupuesto(Aparato aparato, Servicio servicio, LocalDate FecRealizacion, boolean estado) {
        this.aparato = aparato;
        this.servicio = servicio;
        this.FecRealizacion = FecRealizacion;
        this.estado = estado;
    }
    
    
    
    
}