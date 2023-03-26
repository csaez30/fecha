
package ej_fecha;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Ej_fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
               
            LocalDate fecha2= LocalDate.now();
            LocalDate fecha1= LocalDate.of(2022, 10, 1);
            
            Period periodo= Period.between(fecha1, fecha2);
            System.out.println("dias "+periodo.getDays());
            
            //Date f =new Date();
           
           
 //           LocalDate fecha2 = LocalDate.parse(fecha_nac, f);//usando String

//            LocalDate fecha1 = LocalDate.of(2018,9,9);   //usando enteros
//            
//           
//             Period p = Period.between(fecha1, fecha2);
//            System.out.println("diferencia de fechas  años "+p.getYears()+" meses "+p.getMonths()+"dias "+p.getDays());
//                      
//             int dias=p.getYears()*365+p.getMonths()*30+p.getDays();
//            System.out.println("distancia dias "+dias);
//             
//             
            
           
    
    }}
    

    
    

