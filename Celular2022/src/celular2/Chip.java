package celular2;

public class Chip {

    private String empresa;

    private int numero;

    public Chip(String empresa, int numero) {
        this.empresa = empresa;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Chip{" + "empresa=" + empresa + ", numero=" + numero + '}';
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getNumero() {
        return numero;
    }

   
}
