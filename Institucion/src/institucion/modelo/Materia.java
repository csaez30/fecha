/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.modelo;

/**
 *
 * @author Usuario
 */

public class Materia {
    
private int idMateria;
private String nombre;
private int anioMateria;
private boolean activo;

    public Materia(String nombre, int anioMateria, boolean activo) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
    }

    public Materia(int idMateria,String nombre, int anioMateria, boolean activo) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activo = activo;
        this.idMateria=idMateria;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
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
    
        return idMateria+"-"+nombre+" "+anioMateria;
    }


}
