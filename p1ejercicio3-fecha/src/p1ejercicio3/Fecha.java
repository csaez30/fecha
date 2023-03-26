/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1ejercicio3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author juanj
 */
public class Fecha {
    int dia;
    int mes;
    int año;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public void calculaEdad(int dia, int mes, int año) {
        LocalDate fechaNac = LocalDate.of(año, mes, dia);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %s años, %s meses y %s días\n",
        periodo.getYears(), periodo.getMonths(), periodo.getDays()); 
    }
    
    public int diasQueFaltan(int dia, int mes, int año) {
        int diasQF = 0;
        LocalDate fecha1 = LocalDate.of(año, mes, dia);
        LocalDate fecha2 = LocalDate.now();
        if (fecha1.getYear()==fecha2.getYear()){
            Period periodo = Period.between(fecha2, fecha1);
            diasQF = periodo.getDays();
        } else
           System.out.printf("La fecha es del pasado!..."); 
       
        return diasQF;
}
     public void diasVividos(int dia, int mes, int año) {
        LocalDate fechaNac = LocalDate.of(año, mes, dia);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Has vivido en promedio %s días\n",
          (periodo.getYears()*365)+ (periodo.getMonths()*30)+ periodo.getDays()); 
    }
}