package celular2;

public class Chip {

    private String empresa;

    private int numero;

    public Chip(String empresa, int nro) {
        this.empresa = empresa;
        numero=nro;
    }

    public void mostrar() {
        System.out.println("Empresa "+empresa+" numero "+numero);
    }
}
