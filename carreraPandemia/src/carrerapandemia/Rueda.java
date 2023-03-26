/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrerapandemia;

/**
 *
 * @author Admin
 */
public class Rueda {
    String marca;

    public Rueda(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Rueda{" + "marca=" + marca + '}';
    }
    
}
