package ej_fecha;

import java.sql.Date;

public class Ej_fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fecha f =new fecha();
        int ed= f.edad(Date.valueOf("1973-02-24"));
        System.out.println("la edad es "+ed);
        f.mostrar();
    }
    
}
