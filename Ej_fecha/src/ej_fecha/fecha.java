/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_fecha;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author cris
 */
public class fecha {
    int dia;
    int mes;
    int año;
    
    public fecha(){
     Calendar f = Calendar.getInstance();
     this.año   = f.get(Calendar.YEAR);
     this.mes = f.get(Calendar.MONTH);
     this.dia = f.get(Calendar.DAY_OF_MONTH);

    
    
    } 
  
    public void mostrar(){
        System.out.println("Año "+this.año );
         System.out.println("Mes "+this.mes );
        System.out.println("Dia "+this.dia );
    }
    
    public fecha(int dia, int mes, int año) {
        
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
  
    public int edad (Date f_nac){
         Date f = new Date();
         int edad = f.getYear()- f_nac.getYear();
             
      return (int)edad;
   }
        
    
    public boolean validar_fecha(int dia, int mes, int anio){
         if ((dia>=1 &&  dia<=31 )&& (mes>=1 && mes <=12) && ( anio>0))
                 
                 return true;
               else 
             //&& (1=<mes && mes <=12) && (1500=< anio && anio <=2018))
             return false;
             
         }
     }
    
    

