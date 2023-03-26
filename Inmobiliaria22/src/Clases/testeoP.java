/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class testeoP {
    public static void main(String[] args){
         try {
        
        Propietario mabel = new Propietario("Mabel Miranda", 31876345, 154389087 );
          Conexion c = new Conexion();
          PropietarioData ad = new PropietarioData(c);
          ad.guardarPropietario(mabel);
          
          
          
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al conectar");
        }
        
        
        
        
    }
    
}
