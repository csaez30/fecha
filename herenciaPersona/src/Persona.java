public abstract class Persona {

    protected String nombre;

    protected int dni;

    protected int celular;

    public Persona() {
    }

    public Persona(String nombre, int dni, int celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public abstract void caminar();
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular + '}';
    }

    
    public void comer() {
    }
}
