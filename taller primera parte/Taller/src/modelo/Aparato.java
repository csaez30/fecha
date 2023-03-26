/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author RocaVero
 */
public class Aparato {
    private String numSerie;
    private String tipo;
    private Cliente cliente;
    private LocalDate fecIngreso;
    private LocalDate fecEgreso;

    public LocalDate getFecIngreso() {
        return fecIngreso;
    }

    public void setFecIngreso(LocalDate fecIngreso) {
        this.fecIngreso = fecIngreso;
    }

    public LocalDate getFecEgreso() {
        return fecEgreso;
    }

    public void setFecEgreso(LocalDate fecEgreso) {
        this.fecEgreso = fecEgreso;
    }


    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Aparato() {
    }

    public Aparato(String tipo, Cliente cliente, LocalDate fecIngreso) {
        this.tipo = tipo;
        this.cliente = cliente;
        this.fecIngreso = fecIngreso;
    }

    
    public Aparato(String numSerie, String tipo, Cliente cliente,LocalDate fecIngreso) {
        this.numSerie = numSerie;
        this.tipo = tipo;
        this.cliente = cliente;
        this.fecIngreso = fecIngreso;
        
    }
    
    
    
}
