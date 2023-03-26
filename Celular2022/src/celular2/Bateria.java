package celular2;

public class Bateria {

    private String marca;

    private double potencia;

    public Bateria(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Bateria{" + "marca=" + marca + ", potencia=" + potencia + '}';
    }

   
}
