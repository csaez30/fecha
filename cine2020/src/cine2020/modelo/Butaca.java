/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine2020.modelo;

/**
 *
 * @author cris
 */
public class Butaca {
    private int idButaca;
    private int fila;
    private int columna;
    private int estado;
    private Proyeccion proyeccion;

    public int getIdButaca() {
        return idButaca;
    }

    public void setIdButaca(int idButaca) {
        this.idButaca = idButaca;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Proyeccion getPryeccion() {
        return proyeccion;
    }

    public void setPryeccion(Proyeccion pryeccion) {
        this.proyeccion = pryeccion;
    }
    
    
    
    
}
