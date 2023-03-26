/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico_6.entidades;

/**
 *
 * @author Usuario
 */
public class Cliente {
    
    protected long dni;
    protected String apellido;
    protected String nombre;
    protected String ciudad;
    protected String domicilio;

    public Cliente(long dni, String apellido, String nombre, String ciudad, String domicilio) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.domicilio = domicilio;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }



    public long getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDomicilio() {
        return domicilio;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (int) (this.dni ^ (this.dni >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    
    
            
        
            
           
}
