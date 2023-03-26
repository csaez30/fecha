public class Deportista extends Persona {

    private String diciplina;

    private double resistencia;

    public Deportista(String diciplina, double resistencia, String nombre, int dni, int celular) {
        super(nombre, dni, celular);
        this.diciplina = diciplina;
        this.resistencia = resistencia;
    }

    @Override
    public void caminar() {
        System.out.println("Camina mas lejos con resistencia " + resistencia);
    }

    @Override
    public String toString() {
        return "Deportista{" + "diciplina=" + diciplina + ", resistencia=" + resistencia + '}';
    }
}
