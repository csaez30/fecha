/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaPpal;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int ejemplares;
    private int ejemplaresPrestados;

    public Libro() {
         this.ejemplaresPrestados=0;
    }

    public Libro(String titulo, String autor, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados=0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public static Comparator<Libro> getComparaTitulo() {
        return comparaTitulo;
    }

    public static void setComparaTitulo(Comparator<Libro> comparaTitulo) {
        Libro.comparaTitulo = comparaTitulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", ejemplaresPrestados=" + ejemplaresPrestados + '}';
    }

    

   

//    @Override
//    public int compareTo(Libro l) {
//       String tit= l.getTitulo();
//       return titulo.compareTo(tit)<0 ?-1 :titulo.compareTo(tit)==0 ?0:1;
//    }
    
   
public static Comparator<Libro> comparaTitulo = new Comparator<Libro>(){    
    public int compare(Libro l1, Libro l2){
    return l1.titulo.compareTo(l2.titulo);
    
    }
};
}
