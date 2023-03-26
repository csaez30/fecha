/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anio2022;
  import  java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
 *
 * @author Admin
 */
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
public class Anio2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // devuelve long
   LocalDate desde =LocalDate.of(1976, Month.APRIL, 20);
LocalDate hasta =LocalDate.of(2020, Month.JUNE, 25);
long dias=ChronoUnit.DAYS.between(desde, hasta);//16137
long meses=ChronoUnit.MONTHS.between(desde, hasta);//530
long años=ChronoUnit.YEARS.between(desde, hasta);//44
System.out.println("La diferencias de fecha "+desde+" y "+hasta);
System.out.println(dias+" dias");
System.out.println(meses+ "meses" );
System.out.println(años+ " años ");    }
    
}
