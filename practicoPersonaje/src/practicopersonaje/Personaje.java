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
public class Personaje {
    protected Position ubicacion;
    protected String nick;
    protected int vidas=3;
    protected int energia=100;
    protected char orientacion='N';
    
    Personaje(Position ubicacion,String nick){
        this.ubicacion=ubicacion;
        this.nick=nick;
    } 
    public void disparar(){
        if(energia<10)
            System.out.println("Te has quedado sin energia valiente guerrero.");
        else{
            System.out.println("*Bang");
            energia-=10;
        }    
    }
    
    public void girar(){
        switch (orientacion) {
            case 'N':
                orientacion='E';
                System.out.println("Ahora se encuentra mirando al este.");
                break;
            case 'E':
                orientacion='S';
                System.out.println("Ahora se encuentra mirando al sur.");
                break;
            case 'S':
                orientacion='O';
                System.out.println("Ahora se encuentra mirando al oeste.");
                break;
            default:
                orientacion='N';
                System.out.println("Ahora se encuentra mirando al norte.");
                break;
        }
    }
    
    public void avanzar(){
        switch(orientacion) {
            case 'N':
                ubicacion.setY(ubicacion.getY()-1);
                break;
            case 'E':
                ubicacion.setX(ubicacion.getX()+1);
                break;
            case 'S':
                ubicacion.setY(ubicacion.getY()+1);
                break;
            default:
                ubicacion.setX(ubicacion.getX()-1);
                break;
        }
    }

    public char getOrientacion() {
        return orientacion;
    }

    public Position getUbicacion() {
        return ubicacion;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
   
}

