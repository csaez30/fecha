/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viaje2021;

/**
 *
 * @author Admin
 */
public class Ciudad {
    private int km;
    private String nombre;
    private int nroRuta;

    public Ciudad(int km, String nombre, int nroRuta) {
        this.km = km;
        this.nombre = nombre;
        this.nroRuta = nroRuta;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroRuta() {
        return nroRuta;
    }

    public void setNroRuta(int nroRuta) {
        this.nroRuta = nroRuta;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "km=" + km + ", nombre=" + nombre + ", nroRuta=" + nroRuta + '}';
    }
            
    
}
