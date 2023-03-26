/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaPpal;

import java.util.HashSet;

/**
 *
 * @author Admin
 */
public class Libreria {
   private HashSet<Libro> libros=new HashSet();

    public Libreria() {
    }

    public Libreria(HashSet lib) {
        libros=lib;
    }

    public HashSet<Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libro> libros) {
        this.libros = libros;
    }
    public boolean prestamo(String tit){
    for(Libro l: libros){
       if (tit.equalsIgnoreCase(l.getTitulo()) && l.getEjemplares()>0){
            l.setEjemplaresPrestados(l.getEjemplaresPrestados()+1);
            l.setEjemplares(l.getEjemplares()-1);
            return true;
       }
               
    }
    return false;
    }
    public boolean devolucion(String tit){
    for(Libro l: libros){
       if (tit.equalsIgnoreCase(l.getTitulo()) && l.getEjemplaresPrestados()>0){
            l.setEjemplaresPrestados(l.getEjemplaresPrestados()-1);
            l.setEjemplares(l.getEjemplares()+1);
            return true;
       }
               
    }
    return false;
    }
}
