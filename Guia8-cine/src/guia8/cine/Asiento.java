/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.cina;

/**
 *
 * @author Admin
 */
public class Asiento {
    private char letra;  //A hasta F
    private int numero; //1 a 8
    private Espectador espectador;

    public Asiento(char letra, int numero) {
        this.letra = letra;
        this.numero = numero;
        this.espectador = null;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Asiento{" + "letra=" + letra + ", numero=" + numero;
    }
    
    
    
}
