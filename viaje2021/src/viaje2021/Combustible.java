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
public class Combustible {
    private String tipoCombust;
    private double precio;

    public Combustible(String tipoCombust, double precio) {
        this.tipoCombust = tipoCombust;
        this.precio = precio;
    }

    public String getTipoCombust() {
        return tipoCombust;
    }

    public void setTipoCombust(String tipoCombust) {
        this.tipoCombust = tipoCombust;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
        
    
}
