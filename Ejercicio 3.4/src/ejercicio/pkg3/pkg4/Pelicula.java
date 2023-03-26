/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg4;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
public static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>() {
@Override
public int compare(Pelicula p1, Pelicula p2) {
return p2.getDuracion().compareTo(p1.getDuracion());
}
};
public static Comparator<Pelicula> compararDuracionDescendente = new Comparator<Pelicula>() {
@Override
public int compare(Pelicula p1, Pelicula p2) {
return p1.getDuracion().compareTo(p2.getDuracion());
}
};
public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {
@Override
public int compare(Pelicula p1, Pelicula p2) {
return p1.getTitulo().compareTo(p2.getTitulo());
}
};
public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>() {
@Override
public int compare(Pelicula p1, Pelicula p2) {
return p1.getDirector().compareTo(p2.getDirector());
}
};

@Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
}
