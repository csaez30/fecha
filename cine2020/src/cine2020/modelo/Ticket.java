/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine2020.modelo;

import java.time.LocalDate;

/**
 *
 * @author cris
 */
public class Ticket {
    private int idTicket;
    private LocalDate fechaTicket;
    private double monto;
    private int estado;
    private String metodoPago;
    private Cliente cliente;
    private Butaca butaca;

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public LocalDate getFechaTicket() {
        return fechaTicket;
    }

    public void setFechaTicket(LocalDate fechaTicket) {
        this.fechaTicket = fechaTicket;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Butaca getButaca() {
        return butaca;
    }

    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }
    
    
}
