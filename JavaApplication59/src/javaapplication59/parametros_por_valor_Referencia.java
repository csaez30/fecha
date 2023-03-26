
package javaapplication59;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class parametros_por_valor_Referencia {



 public static void method(int x, String y, List<String> w, List<String> z) {
         x = 999;
         y = "Hola Mundo!";
         w = new ArrayList();
         w.add("Hola mundo !");
         z.add("Hola mundo !.....");
    }

    public static void main(String[] args) {
        int a = 1;
        String b = "Hello World holaaaa!";
        List<String> c = Arrays.asList("Hello", "World", "!");
        List<String> d = new ArrayList();
        d.add("Hello");
        d.add("World !");
        method(a, b, c, d);
        
        System.out.println("a:  x " + a); //no cambia
        System.out.println("b:   y  " + b); //no cambia
        System.out.println("c:  w  " + c); //no cambia
        System.out.println("d:  z  " + d);
    }
}

