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
public class Guerrero extends Personaje{
    private boolean tieneCaballo;

    

    Guerrero(boolean caballo, Position ubicacion, String nick) {
       super(ubicacion, nick);
        this.tieneCaballo = caballo;
    }
    
    @Override
    public void avanzar(){
        if(tieneCaballo){
            switch(orientacion) {
            case 'N':
                ubicacion.setY(ubicacion.getY()-10);
                break;
            case 'E':
                ubicacion.setX(ubicacion.getX()+10);
                break;
            case 'S':
                ubicacion.setY(ubicacion.getY()+10);
                break;
            default:
                ubicacion.setX(ubicacion.getX()-10);
                break;
            }
        }
        else{
            super.avanzar();
        }   
    }
    
    @Override
    public void disparar(){
        if(energia<10)
            System.out.println("Te has quedado sin energia valiente guerrero.");
        else{
            System.out.println("*Blasters sounds*");
            energia-=-10;
        }
        if(tieneCaballo && energia<30)
            tieneCaballo=false;
    }
}
