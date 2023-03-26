package celular2;

public class Celular {

    private String modelo;

    private int nroChip;

    private Chip[] chips;

    private Bateria bateria;

    public Celular(String modelo, String marca, double potencia) {
        this.modelo = modelo;
        bateria = new Bateria(marca, potencia);
        nroChip =0;
        chips = new Chip[2];
    }
 
    public void agregarChip(Chip nuevoChip){
          if (nroChip<2){
               chips[nroChip] = nuevoChip;
               nroChip++;
          }
          else 
              System.out.println("No hay espacio para otro chip");
    
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNroChip() {
        return nroChip;
    }

    public void setNroChip(int nroChip) {
        this.nroChip = nroChip;
    }

    public Chip[] getChips() {
        return chips;
    }

    public void setChips(Chip[] chips) {
        this.chips = chips;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Celular{" + "modelo=" + modelo + ", nroChip=" + nroChip + ", bateria=" + bateria + '}';
    }

    public void mostrarChip(){
    
      for (int i=0; i<nroChip;i++){
         
          System.out.println("el chip tiene numero "+chips[i].getNumero()+ " y pertenece a la empresa "+chips[i].getEmpresa());
      }
    
    }
    
    
}
