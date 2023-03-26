/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Bibioteca {
    
    private List<Libro> libros = new ArrayList<>();
    private String localidad;

    public Bibioteca(String localidad, List<Libro> libros) {
        this.localidad = localidad;
        this.libros = libros;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    public void limpiarReservas(){
    for(Libro lib: libros){
      lib.setCantDeReserva(0);
    }
    
    }
}
