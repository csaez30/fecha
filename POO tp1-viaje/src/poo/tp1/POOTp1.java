/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tp1;

import javax.swing.JOptionPane;

/**
 *
 * @author cris
 */
public class POOTp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       viaje v1,v2,v3;
       double peaje,dist;
        System.out.println("Si km de origen, km destino, tipo de combustible, tipo de vehiculo,cantidad de peaje, si es la misma ruta o distinta"); 
       v1 = new viaje(12,1500,"nafta","auto",3,"igual");
 
          JOptionPane.showMessageDialog(null, "el costo de peaje: "+String.valueOf((v1.Costo_peaje("nafta", 3))));
                
          JOptionPane.showMessageDialog(null, "el costo de combuetibñe: "+String.valueOf((v1.consumo_cumbuetible("auto", "nafta"))));
           peaje=v1.Costo_peaje("nafta", 3);
           dist=v1.getDistania();
           
  
          JOptionPane.showMessageDialog(null, "el costo de combuetibñe: "+String.valueOf((v1.Costo_total(dist, peaje,"auto", "nafta", 3))));
       
       v2 = new viaje(1500,"nafta","auto",3,"igual"); 
       
       v3 = new viaje();
       v3.setOrigen(0);
       v3.setDestino(800);
       v3.setTipo_combustible("gasoil");
       v3.setTipo_vehiculo("camion");
       v3.setPeaje(4);
       v3.setRuta("igual");
       
       JOptionPane.showMessageDialog(null, "el costo de peaje: v3 "+String.valueOf((v3.Costo_peaje("gasoil", 4))));
                
          JOptionPane.showMessageDialog(null, "el costo de combuetibñe: "+String.valueOf((v3.consumo_cumbuetible("camion", "gasoil"))));
        JOptionPane.showMessageDialog(null,"km destino de vieaje 3 "+String.valueOf((v3.getDestino())));
       
       
    }
    
}
