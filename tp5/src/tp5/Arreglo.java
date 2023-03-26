package tp5;
public class Arreglo {
    
    static void sumarLista(int enteros[]){
        int total = 0;
        float promedio;
        for (int n : enteros) {
            total += n;
        }
        System.out.println("Suma: "+total);
        promedio = (float)total / enteros.length;
        System.out.println("Promedio: "+promedio);
    }
    
    static void buscarMayor(int enteros[]){
        int mayor = enteros[0];
        for (int n : enteros) {
            if(n > mayor)
                mayor = n;
        }
        System.out.println("Mayor: "+mayor);
    }
    
    static void cuentaVocales(String palabra){
        int cantidad = 0;
        String letras[] = palabra.split("");
        for (String l : letras) {
            l = l.toLowerCase();
            if(l.equals("a") || l.equals("e") || l.equals("i") || l.equals("o") || l.equals("u") || l.equals("á") || l.equals("é") || l.equals("í") || l.equals("ó") || l.equals("ú"))
                cantidad++;
        }
        System.out.println("Cantidad de vocales: "+cantidad);
    }
    
    static void cuentaCaracter(String palabra, char caracter){
        int cantidad = 0;
        String letras[] = palabra.split("");
        String letra = String.valueOf(caracter);
        for (String l : letras) {
            if(l.equals(letra))
                cantidad++;
        }
        System.out.println("Cantidad de "+caracter+" en "+palabra+": "+cantidad);
    }
}
