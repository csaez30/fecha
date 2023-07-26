public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado() {
        lado=12;
    }

    @Override
    public void calcularArea() {
        System.out.println("eL AREA del cuadrado es "+lado*lado);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println(" el perimetro del cuadrado es "+lado*4);
    }
}
