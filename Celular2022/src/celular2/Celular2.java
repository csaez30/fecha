package celular2;

import java.util.ArrayList;

public class Celular2 {

    public static void main(String[] args) {
       ArrayList<Celular>  celulares= new ArrayList();
        
       Chip claro = new Chip("claro", 6567766); 
       Chip personal = new Chip("personal", 3255766);
       Chip moviestar = new Chip("moviestar", 4563525); 
       Celular cel1 = new Celular("Samsumg A50", "Samsumg", 150);
       Celular cel2 = new Celular("Nokia 1100", "nokia", 50); 
       Celular cel3 = new Celular("Redmi note 10", "xiaomi", 200);
       cel1.agregarChip(claro);
       cel1.agregarChip(personal);
       cel1.agregarChip(moviestar);
       Persona pers = new Persona("Rosa Lopez",424235);
       pers.usarCelular(cel2);
       celulares.add(cel3);
       celulares.add(cel1);
       celulares.add(cel2);
       
       for(Celular cel:celulares){
           System.out.println(cel);
           cel.mostrarChip(); 
       }
        
  }}
    

