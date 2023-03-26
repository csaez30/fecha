public class Profesor extends Persona {

    private String responsable;

    private String carrera;

    public Profesor(String responsable, String carrera, String nombre, int dni, int celular) {
        super(nombre, dni, celular);
        this.responsable = responsable;
        this.carrera = carrera;
    }

    public Profesor() {
    }

    @Override
    public void caminar() {
        System.out.println("camina porque es responsable de la materia "+responsable);
    }
    
}
