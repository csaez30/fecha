/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viaje2021;

/**
 *
 * @author Admin
 */
public class viaje {
    private Ciudad origen;
    private Ciudad destino;
    private double distancia;
    private Vehiculo vehiculo;
    private  int cantPeaje;

    public viaje(Ciudad origen, Ciudad destino, double distancia, Vehiculo vehiculo, int cantPeaje) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.cantPeaje = cantPeaje;
    }
    
    public viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int cantPeaje) {
        this.origen = origen;
        this.destino = destino;
         distancia= calcularDistancia();
        this.vehiculo = vehiculo;
        this.cantPeaje = cantPeaje;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantPeaje() {
        return cantPeaje;
    }

    public void setCantPeaje(int cantPeaje) {
        this.cantPeaje = cantPeaje;
    }
    public double calcularDistancia(){
    
      if (origen.getNroRuta()==destino.getNroRuta())  //si estan en la misma ruta calculo, sino viene calculada
      {
        distancia = Math.abs(origen.getKm()-destino.getKm());
      
      }
      return distancia;    
    }
    
    public double calcularCostoPeajes(){
     if (vehiculo.getClass().equals("Auto") || vehiculo.getClass().equals("Camioneta"))
                    return 60.25*cantPeaje;
        else 
                return 120.34*cantPeaje;
    
    }
    
    public double costoTotal(){
     double precio=0;
     
      if (vehiculo.getCombustible().getTipoCombust().equals("nafta")) 
              precio = 120;
      else precio=80;
      
    
      return (vehiculo.costoCombustible(calcularDistancia())+calcularCostoPeajes());
    
    }
    
}
