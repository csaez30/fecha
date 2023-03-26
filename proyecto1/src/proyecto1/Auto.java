/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Admin
 */
public class Auto implements Vehiculo{
  private String color;
  private String patente;
  private double combustible= 50;

    public Auto() {
        
    }

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
  public void avanzar(double metros){
     double necesito = 0.1*metros;
     if (combustible >=necesito){
          combustible -=necesito;
     } else{
          System.out.println("No hay combustible para avanzar ");
     }
  }
   public void retroceder(double metros){
     double necesito = 0.1*metros;
     if (combustible >=necesito){
          combustible -=necesito;
     } else{
          System.out.println("No hay combustible para avanzar ");
     }
  }  
  public void llenarTanque(){  
      combustible= 50;
  }  

    @Override
    public String toString() {
        return "Auto{" + "color=" + color + ", patente=" + patente + ", combustible=" + combustible + '}';
    }
   
  
  
}
