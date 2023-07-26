public class Persona {

    private String nombre;

    private String telefono;

    public Persona() {
        nombre= "desconocido";
        telefono= "desconocido";
    }
     public Persona(String nombre, String telefono) {
      this.nombre =nombre;
      this.telefono=telefono;
     }
    
     public String getNombre(){
        return nombre;
     }
     public String getTelefono(){
     
          return telefono;
     }
     
     public void setNombre(String nombre){
     
            this.nombre=nombre;
     }
     

    public void comer() {
    }

    public Void trabajar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
