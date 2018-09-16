package ej_fecha;

import java.sql.Date;
import java.util.Scanner;

public class Ej_fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ed;
        String fecha_nac;
        fecha f =new fecha();
        Scanner en;
          en=new Scanner(System.in);
        fecha_nac= en.nextLine();
       System.out.println("Ingrese fecha de Nacimiento YYYY-MM-DD");
       
        
        ed= f.edad(Date.valueOf(fecha_nac));
       System.out.println("la edad es "+ed);
       f.mostrar();
        
       System.out.println("Dias vividos "+f.diasVividos(fecha_nac));
        System.out.println("Ingrese fecha futura del 2018 YYYY-MM-DD");
        en =new Scanner(System.in);
        fecha_nac= en.nextLine();
        ed = f.diasFaltan(fecha_nac);
        System.out.println("Los dias que faltan para esa fecha son  "+ed);
    }

    
    
}
