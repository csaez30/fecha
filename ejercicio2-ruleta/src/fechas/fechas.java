/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author cris
 */
public class fechas {
    
    private int dia;
    private int mes;
    private int año;

    public fechas() {
    }
    
 public fechas(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void calcularEdad(int dia, int mes, int año){
        LocalDate fechaNac = LocalDate.of(año,mes,dia);//mi cumpleaños
        LocalDate actual = LocalDate.now();
        Period periodo = Period.between(fechaNac, actual);
        periodo.getYears();
        periodo.getMonths();
        periodo.getDays();
                
                
                
    
    }
    
}