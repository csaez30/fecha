/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

/**
 *
 * @author Admin
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int cantDeReserva;

    public Libro(String titulo, String autor, int cantDeReserva) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantDeReserva = cantDeReserva;
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

    public int getCantDeReserva() {
        return cantDeReserva;
    }

    public void setCantDeReserva(int cantDeReserva) {
        this.cantDeReserva = cantDeReserva;
    }
 public void registrarReserva(){
        cantDeReserva++;
 }    
    
    
}
