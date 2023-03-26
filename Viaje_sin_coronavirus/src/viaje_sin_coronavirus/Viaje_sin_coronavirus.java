/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viaje_sin_coronavirus;

import javax.swing.JOptionPane;

/**
 *
 * @author cris
 */
public class Viaje_sin_coronavirus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Viaje v1 = new Viaje(1,1000,"nafta","auto",3,true);
     JOptionPane.showMessageDialog(null, "Distancia es: "+String.valueOf(v1.getDistancia()));
     JOptionPane.showMessageDialog(null, "Distancia es: "+String.valueOf(v1.consumoCombustible("nafta", "auto")));
     JOptionPane.showMessageDialog(null, "Distancia es: "+String.valueOf(v1.costoTotal("auto", "nafta", 3)));
    
    }
    
}
