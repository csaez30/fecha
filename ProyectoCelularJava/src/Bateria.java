public class Bateria {

    private String marca;

    private int potencia;

    public Bateria(String marcaBateria, int potencia) {
        marca= marcaBateria;
        this.potencia = potencia;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Bateria{" + "marca=" + marca + ", potencia=" + potencia + '}';
    }

    
    
    public void mostrar() {
        System.out.println("Bateria "+marca+" Potencia "+ potencia) ;
    }
}
