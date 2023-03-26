/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciafamiliar;

/**
 *
 * @author Admin
 */


import java.util.ArrayList;

import java.util.List;

/**
 * La clase Auto describe o modela un auto genérico que posee una patente,
 * un color determinado y una cantidad de combustible
 * @author alejo
 */
public class Auto {
    //Atributo de clase que almacena la patente del auto
    private String patente;
    //Atributo de clase que almacena el color del auto
    private String color; 
    //Atributo de clase que almacena la cantidad de combustible del auto
    private double combustible; 
    


    public Auto(String patente, String color){
        this.patente = patente;
        this.color = color;
        //Asigno la cantidad inciial de combustible cuando se crea el objeto Auto
        combustible = 50;
    }
    public void avanzar(double metros){
        //El consumo de comuxtible es de 0.1 litro por cada metro recorrido
        double combustibleNecesario = 0.1d * metros;
        
        //verificamos si el combustible que posee el auto es suficiente para 
        //avanzar la cantidad de metros solicitada
        if(combustible >= combustibleNecesario){
            combustible -= combustibleNecesario;
        }else{
            System.out.println("Combustible insuficiente para avanzar, se necesitan: " + combustibleNecesario + " litros y el auto posee: " + combustible + " litors.");
        }
        
    }
    
    public void retroceder(double metros){
    double combustibleNecesario = 0.1d * metros;
        
        //verificamos si el combustible que posee el auto es suficiente para 
        //avanzar la cantidad de metros solicitada
        if(combustible >= combustibleNecesario){
            combustible -= combustibleNecesario;
        }else{
            System.out.println("Combustible insuficiente para retorceder, se necesitan: " + combustibleNecesario + " litros y el auto posee: " + combustible + " litors.");
        }
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

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    
    public void llenar(){
        
        combustible=50;
        System.out.println("Tanque lleno ");
        
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + ", combustible=" + combustible + '}';
    }
    
}
