/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.cina;

/**
 *
 * @author Admin
 */
public class Cine {
   
    private Asiento[][] asientos; 
     private Pelicula pelicula;
    private double precio;

    public Cine(Pelicula pelicula, double precio) {
        this.asientos = new Asiento[4][2];//8 filas 6 columnas
        this.pelicula = pelicula;
        this.precio = precio;
        llenarAsientos();
    }
    
   public void llenarAsientos(){
     int fila= asientos.length;
     int edades;
     double dinero;
     Espectador espectador;
     for (int i=0; i<asientos.length-1;i++){
         for (int j=0; j<asientos[i].length-1;j++){
          edades=(int)(Math.random()*70+10);//edades entre 10 y 70 años 
          dinero = (Math.random()*5000);//dinero entre 0 y 5000$
          espectador= new Espectador("Espe"+(i+j),edades,dinero);   
          //esta libre, tiene edad y dinero
          asientos[i][j]=new Asiento((char)(65+j+i), fila);//65 es A en ascii, Asiento(letra,fila)
          if (asientoLibre(i,j) && tieneDinero(espectador) && tieneEdad(espectador)){   
            asientos[i][j].setEspectador(espectador);
              System.out.println("Espectador "+espectador+" sentado asiento: "+asientos[i][j]);
         
         }else if (!tieneDinero(espectador)) System.out.println("no tiene dinero suficiente");
         else if (tieneEdad(espectador)) System.out.println("No tiene edad suficiente "+espectador);
         
         }
     fila--;
     
     }
    
    }
    public boolean asientoLibre(int fila, int columna){
    
    return asientos[fila][columna].getEspectador()==null;
    
    }
    
    public boolean tieneEdad(Espectador e){
    boolean  tieneEdad=false;
    
       if (pelicula.getEdadMinima()<=e.getEdad())
               tieneEdad=true;
    return tieneEdad;
    }
    
    public boolean tieneDinero(Espectador e){
    
     return e.getDinero()>= precio;   //tiene dinero
    }
    
    public boolean hayLibres(){
    boolean libre=false;
    for (int i=0; i<asientos.length;i++){
         for (int j=0; j<asientos[i].length;i++){
             if (asientos[i][j].getEspectador()==null)
                 libre=true;
         }
    
       }
    return libre;
    }
    

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
public void mostrarSala(){
for (int i=0; i<asientos.length-1;i++){
    for (int j=0; j<asientos[i].length-1;j++){
        System.out.println(" Asiento "+asientos[i][j].getLetra()+asientos[i][j].getNumero()+" "+asientos[i][j].getEspectador().getNombre());
      }
    System.out.println();
} 
}
}
 