/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author cris
 */
public class Materia {
    
    private int id;
    private String nombre;
    private String responsable;
    private String periodo;

    public Materia() {
    }

    public Materia(String nombre, String responsable, String periodo) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.periodo = periodo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    @Override
    public String toString(){
    
        return id+"-"+nombre;
    }

    
    
    
}
