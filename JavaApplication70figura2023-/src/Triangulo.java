public class Triangulo extends Figura {

    private int base;

    private int altura;

    public Triangulo() {
        base= 13;
        altura=20;
        
    }

    @Override
    public void calcularArea() {
        System.out.println("el area del triangulo es "+base*altura/2);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("el perimetro del triangulo "+(altura+altura+base));
    }
}
