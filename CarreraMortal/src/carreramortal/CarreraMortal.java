/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreramortal;

import java.util.List;

/**
 *
 * @author alejo
 */
public class CarreraMortal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo un objeto del tipo Auto y lo asigno a la variable "auto1"
        Auto auto1 = new Auto("RRR 232", "Azul");
        Auto auto2 =new Auto();
        auto1.avanzar(300);
        auto1.retroceder(300);
        auto1.llenar();
        Rueda r1=new Rueda("Michelin");
        Rueda r2=new Rueda("GoodYear");
        Rueda r3=new Rueda("Fate");
        Rueda r4=new Rueda("Kumbo");
        Rueda r5=new Rueda("Pirelli");
        auto1.quitarRueda(r1);
        auto1.agregarRueda(r1);
        auto1.agregarRueda(r2);
        auto1.agregarRueda(r3);
        auto1.agregarRueda(r4);
        auto1.agregarRueda(r5);
        
    }
    
}
