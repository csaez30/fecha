/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofer;

/**
 *
 * @author cris
 */
public class Empleado {
    int documento;
    String nombre;
    String apellido;
    String categoria;
    double sueldo;
    Empresa trabaja;

    public Empresa getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(Empresa trabaja) {
        this.trabaja = trabaja;
    }

    public Empleado(int documento, String nombre, String apellido, String categoria, double sueldo) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        this.sueldo = sueldo;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    

    
    
    
            
}
