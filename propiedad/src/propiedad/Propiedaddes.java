/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propiedad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author cris
 */
public class Propiedaddes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Propiedad> propiedades = new ArrayList<>();
        Casa c1=new Casa("Mitre 123",50);
        
        propiedades.add(c1);
        propiedades.add(new Edificio("Av. IIlia 432",35));
         propiedades.add(new Edificio("Av. España 466",45));
        Inmobiliaria im= new Inmobiliaria("SAN Luis", propiedades);
        
        for (Propiedad p: propiedades)
         {
         System.out.println("Propiedad en "+im.getLocalidad()+" "+p.toString());
                 
         }
}
}
    

