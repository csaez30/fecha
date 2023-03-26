package celular2;

public class Smart {

    private String modelo;

    private int nroChip;

    private Chip[] chips;
    private Bateria bateria;
   

    
    public Smart(String modelo, String marca, double potencia) {
       this.modelo= modelo;
       
       nroChip=0;
       chips = new Chip[2];
       bateria = new Bateria(marca, potencia);
    }

   

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public void mostrar() {
        System.out.println("Smart{" + "modelo=" + modelo + ", nroChip=" + nroChip + ", chips=" + chips +" Bateria "+bateria);
    }

    @Override
    public String toString() {
        return "Smart " + "modelo=" + modelo + ", nroChip=" + nroChip + ", chips=" + chips+" Bateria "+bateria;
    }

    public void agregarChip(Chip nuevoChip) {
       if (nroChip<2){
          chips[nroChip]= nuevoChip;
          nroChip++; 
       }
    }
}
