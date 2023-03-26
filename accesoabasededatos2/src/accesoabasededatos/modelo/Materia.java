/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoabasededatos.modelo;

/**
 *
 * @author Usuario
 */
public class Materia {

private int idMateria=-1;
private String nombre;

   
  public Materia( String nombre) {
        
        this.nombre = nombre;
    }
    
    public Materia(){}

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int id) {
        this.idMateria = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@Override
    public String toString(){
    
        return idMateria+"-"+nombre;
    }


}
