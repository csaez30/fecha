/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciafamiliar;

/**
 *
 * @author Admin
 */
public class Casa {
    private String zona;
    private int cantAmbiente;

    public Casa(String zona, int cantAmbiente) {
        this.zona = zona;
        this.cantAmbiente = cantAmbiente;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getCantAmbiente() {
        return cantAmbiente;
    }

    public void setCantAmbiente(int cantAmbiente) {
        this.cantAmbiente = cantAmbiente;
    }

    @Override
    public String toString() {
        return "Casa{" + "zona=" + zona + ", cantAmbiente=" + cantAmbiente + '}';
    }
    
    
}
