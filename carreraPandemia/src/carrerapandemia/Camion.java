package carrerapandemia;

public class Camion implements Vehiculo{

    private String patente;

    private String color;

    private double combustible;

    public Camion() {
        combustible = 60;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void avanzar(double metros) {
        double necesito = 0.3 * metros;
        if (combustible > necesito) {
            combustible -= necesito;
            System.out.println("Avanzo " + metros + " metros");
        } else
            System.out.println("No hay combustible suficiente");
    }

    public void retroceder(double metros) {
        double necesito = 0.3 * metros;
        if (combustible > necesito) {
            combustible -= necesito;
            System.out.println("Retocedio " + metros + " metros");
        } else
            System.out.println("No hay combustible suficiente");
    }

    public void llenarTanque() {
        combustible = 60;
    }
}
