/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejercicio2;

/**
 *
 * @author Admin
 */
public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;
     public RevolverDeAgua() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
     
     
     
     
    public void llenarRevolver(){ 
    posicionActual= (int)(Math.random()*6+1);//genera aleatoreo de 1 a 6
    posicionAgua= (int)(Math.random()*6+1);
    }
    
    public boolean mojar(){
    boolean exito=false;
    if (posicionAgua == posicionActual){
        exito=true;}
     else {
         exito=false;
      }
    siguienteChorro();
    return exito;     
}
    
 public void siguienteChorro(){
 System.out.println("cambio posición de tambor ");
   if (posicionActual==6)
      posicionActual=1;
   else 
   posicionActual++;    
 }   

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

   
    
}