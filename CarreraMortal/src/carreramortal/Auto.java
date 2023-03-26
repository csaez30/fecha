/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreramortal;

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
    private List ruedas= new ArrayList<Rueda>();
    


    public Auto(String patente, String color){
        
        
        
        
        
        this.patente = patente;
        this.color = color;
        //Asigno la cantidad inciial de combustible cuando se crea el objeto Auto
        combustible = 50;
    }
    public void agregarRueda(Rueda rueda){
        if (ruedas.size()<4)
             ruedas.add(rueda);
        else 
            System.out.println("Ya estan las 4 ruedas!");
    }
    
    public void quitarRueda(Rueda rueda){
        if (ruedas.size()>0)
             ruedas.remove(rueda);
        else 
            System.out.println("no hay ruedas!");
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
    
    public void llenar(){
        
        combustible=50;
        System.out.println("Tanque lleno ");
        
    }
}
