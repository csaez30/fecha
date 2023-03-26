/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionproductos.modelo;

/**
 *
 * @author Admin
 */
public class Categoria {
    int idCategoria;
    String nombre;

    public Categoria(int idCategoria, String nombre) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }

    public Categoria() {
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return idCategoria+ " - " + nombre ;
    }
    
    

    @Override
    public int hashCode() {
        int hash = idCategoria;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       
        
       /* if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
         final Categoria other = (Categoria) obj;
        if (this.idCategoria == other.idCategoria) {
            return true;
        }
       
        return true;
        
    }*/
   
        if (obj instanceof Categoria) {

           Categoria other = (Categoria) obj;

            if (this.idCategoria == other.idCategoria) 
                 { return true; } 
            else { return false; }

    } else { return false; }

} //Cierre del método equals

}
