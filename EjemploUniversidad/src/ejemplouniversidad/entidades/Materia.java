/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplouniversidad.entidades;

/**
 *
 * @author cris
 */
public class Materia {
    private int idMateria;
    private String nombre;

    public Materia() {
    }
    

    public Materia(int idMateria, String nombre) {
        this.idMateria = idMateria;
        this.nombre = nombre;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

