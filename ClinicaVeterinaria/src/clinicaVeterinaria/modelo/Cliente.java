/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.modelo;



/**
 *
 * @author alejo
 */
public class Cliente {
    private int id = 0;
    private String nombreyApellido;
    private String dni;
    private String direccion;
    private String telefono;
    private String contacto;

    public Cliente() {
    this.id=-1;
    }
    

    
    public Cliente(String nombreyApellido, String dni) {
        this.nombreyApellido = nombreyApellido;
        this.dni = dni;
    }

    public Cliente(String nombreyApellido, String dni, String direccion, String telefono, String contacto) {
        this.nombreyApellido = nombreyApellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contacto = contacto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreyApellido() {
        return nombreyApellido;
    }

    public void setNombreyApellido(String nombreyApellido) {
        this.nombreyApellido = nombreyApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

   
    
}
