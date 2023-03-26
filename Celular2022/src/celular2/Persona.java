package celular2;

public class Persona {

    String nombre;

    int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
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
    public void usarCelular(Celular celu){
        System.out.println("Se esta por utlizar el celular de modelo "+ celu.getModelo());
        if (celu.getNroChip()>0){
            int num=celu.getNroChip();
            if (num==2)
            { num--;}
            System.out.println("Se realiza una llamada desde el numero "+celu.getChips()[num].getNumero());   
          
        }else System.out.println("La llamada no puede realizarse");
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

   
}
