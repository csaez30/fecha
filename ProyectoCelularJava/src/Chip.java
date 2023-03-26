public class Chip {

    private String empresa;

    private int numero;

    public Chip(String empresa, int numero) {
        this.empresa = empresa;
        this.numero = numero;
    }

    public void mostrar() {
        System.out.println("Chip empresa "+ empresa + " numero= " + numero);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    
    
    @Override
    public String toString() {
        return "Chip{" + "empresa=" + empresa + ", numero=" + numero + '}';
    }
    
    
}
