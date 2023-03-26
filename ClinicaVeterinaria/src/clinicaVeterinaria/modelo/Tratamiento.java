/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.modelo;

/**
 *
 * @author cris
 */
public class Tratamiento {
    
    private int id;
    private int codigo;
    private String tipo;
    private String descripcion;
    private double importe;
    private boolean activo;

        
    public Tratamiento() {
        this.id = -1;
    }

    public Tratamiento(int id) {
        this.id = id;
    }
    
    
    
    public Tratamiento(int codigo, String tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public Tratamiento(int codigo, String tipo, String descripcion, double importe, boolean activo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
