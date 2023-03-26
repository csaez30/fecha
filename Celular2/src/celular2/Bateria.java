/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celular2;

/**
 *
 * @author Admin
 */
public class Bateria {
    private String marca;
    private double potencia;

    public Bateria(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Bateria{" + "marca=" + marca + ", potencia=" + potencia + '}';
    }
    
    
}
