/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author cris
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
//        String patron = "dd-MM-yyyy";
//     SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//         Date f= new Date(); //hoy
////       LocalDate dia= LocalDate.of(2022,04,10);
////        System.out.println("dia de entrega"+dia);
//        System.out.println("hoy "+f);
//         Date f2= sdf.parse("16-06-2010");
//         System.out.println("Fecha date formateada "+f2);
//         Date f3= sdf.parse("16-04-2015");
//         String d = sdf.format(f);
//         System.out.println("pasar a string "+d);
////        DateTimeFormatter patron2= DateTimeFormatter.ofPattern("dd-MM-yyyy");
////        LocalDate nuevo= LocalDate.parse("02-04-2022",patron2);
////        System.out.println("nuevo "+nuevo);
//       
//       
//      //after es despues y before antes
// System.out.println("After es despues  osea hoy es posteriror sa 2010 "+f.after(f2));
// System.out.println("Hoy es posterior a 2010   hoy>2010 "+f.compareTo(f2)); //devuelve valor mayor que cero, dos fechas iguales devuelven 0
//       

LocalDate desde =LocalDate.of(1976, 02, 20);
LocalDate hasta =LocalDate.of(2020, 01, 25);
//Period periodo=Period.between(desde, hasta);
//
//
//        System.out.println("periodo "+ periodo);
//        System.out.println("años "+periodo.getYears());
//        System.out.println("dias "+periodo.getDays());
//        System.out.println("meses "+periodo.getMonths());
        
long dias=ChronoUnit.DAYS.between(desde, hasta);//16137
long meses=ChronoUnit.MONTHS.between(desde, hasta);//530
long años=ChronoUnit.YEARS.between(desde, hasta);//44
System.out.println("dias "+dias);
System.out.println("meses "+ meses );
System.out.println("años " +años);


    }
    
}
