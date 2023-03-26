public abstract class Alumno extends Persona {

    private String curso;

    private int anio;

    private String carrero;

    public Alumno(String curso, int anio, String carrero, String nombre, int dni, int celular) {
        super(nombre, dni, celular);
        this.curso = curso;
        this.anio = anio;
        this.carrero = carrero;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCarrero() {
        return carrero;
    }

    public void setCarrero(String carrero) {
        this.carrero = carrero;
    }

    
}
