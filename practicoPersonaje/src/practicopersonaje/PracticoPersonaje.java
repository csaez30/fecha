/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicopersonaje;

/**
 *
 * @author Admin
 */
public class PracticoPersonaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Position ubicacion = new Position(100,200);
        Guerrero thor = new Guerrero(true, ubicacion, "Thor");
        
        
        while(thor.getOrientacion()!='O'){
            thor.girar();
        }
        for(int i=0;i<5;i++){
            thor.avanzar();
        }
        for(int i=0;i<8;i++){
            thor.disparar();
        }
        System.out.println(thor.getUbicacion().getX());
        System.out.println(thor.getUbicacion().getY());
        System.out.println(thor.getEnergia());
    }
    }
    

