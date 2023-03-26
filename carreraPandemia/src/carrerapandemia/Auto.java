package carrerapandemia;

import java.util.ArrayList;
import java.util.List;

public class Auto implements Vehiculo {

    private String patente;

    private String color;

    private double combustible;
     private ArrayList<Rueda> ruedas = new ArrayList<>();
   

    public Auto() {
        combustible = 50;
    }

    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
        combustible = 50;
    }

   
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void avanzar(double metros) {
        double necesito = 0.1 * metros;
        if (combustible > necesito) {
            combustible -= necesito;
            System.out.println("Avanzo " + metros + " metros");
        } else
            System.out.println("No hay combustible suficiente");
    }

    public void retroceder(double metros) {
        double necesito = 0.1 * metros;
        if (combustible > necesito) {
            combustible -= necesito;
            System.out.println("Retocedio " + metros + " metros");
        } else
            System.out.println("No hay combustible suficiente");
    }

    public void llenarTanque() {
        combustible = 50;
    }
    
    public void colocarRueda(Rueda rueda){
            
            if (ruedas.size()<4){
                ruedas.add(rueda);
                
            }
            else
            System.out.println("ya tiene todas la ruedas ");
      }
    
    public void quitarRueda(Rueda rueda){
           if (ruedas.size()>0 && ruedas.contains(rueda)){
                ruedas.remove(rueda);
                
           }else if (ruedas.size()==0)
            System.out.println("No ha ruedas para sacar ");   
           else System.out.println("la rueda especificada NO ESTA ");
    
    
    }
     
         
     
    }
     


