/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author Dani Barros
 */
public class Cliente {
    String nombre;
    String apellido;
    String ciudad;
    String direccion;
    String dni;

    public Cliente() {
    }
    
    Cliente(String n,String a,String c,String d, String dni){
        this.nombre=n;
        this.apellido=a;
        this.ciudad=c;
        this.direccion=d;
        this.dni=dni;
    }
    
    @Override
    public String toString(){
        return nombre+" "+apellido+ " vive en "+ciudad+" en la direccion "+direccion+" su dni es "+dni;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    
}
