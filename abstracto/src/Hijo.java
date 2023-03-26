public class Hijo extends Padre implements Madre {

    public Hijo(String apellido, String casa) {
        super(apellido, casa);
    }
    
   public void cantar(){
       System.out.println("lalalalalal c");
   }

    public void bailar(){
        System.out.println("me gusta bailar como mama");
    }

    public double darDinero(double pesos){
    
        System.out.println("gracias a mama tengo $$$" +pesos);
        return pesos;
    }
    
}
