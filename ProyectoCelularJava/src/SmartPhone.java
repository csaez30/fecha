public class SmartPhone {

    private String modelo;

    private int nroChip;

    private Bateria bateria;

    private Chip[] chips;

    public SmartPhone(String modelo, String marcaBateria, int potencia) {
        
        this.modelo = modelo;
        this.bateria = new Bateria(marcaBateria, potencia);
        chips = new Chip[2];
        nroChip=0;
        
        
    }

    public void mostrar() {
        System.out.println("SmartPhone " + modelo +" "+nroChip+" Bateria "+bateria.toString());
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "modelo=" + modelo + ", nroChip=" + nroChip + ", bateria=" + bateria + ", chips=" + chips + '}';
    }
    
    

    public void agregarChip(Chip nuevoChip) {
        if (nroChip<2){
            chips[nroChip] = nuevoChip;
            nroChip++;
        }else
            System.out.println("Ya hay dos chips ");
        
        
    }
}
