/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot;



public class Robot {
   
    private int bateria; 
    private boolean dormido;

  public Robot(){
        this.bateria = 1000;
        this.dormido = false;
       
    }
    
  public void Avanzar(int pasos){
      
    double bateriaNec = 0.1d * pasos;
        
        
        if(bateriaNec <= bateria && !dormido){
            bateria -= bateriaNec;
        }else{
            System.out.println(" no puede avanzar");
        }  
  }
  
  public void Retroceder(int pasos){
      
    double bateriaNec = 0.1d * pasos;
        
        //verificamos si el combustible que posee el auto es suficiente para 
        //avanzar la cantidad de metros solicitada
        if(bateria >= bateriaNec && !dormido){
            bateria -= bateriaNec;
        }else{
            System.out.println(" no puede retroceder");
        }  
  }
  
  public void dormir(){
     dormido = false;
  }
  public void despertar(){
     dormido = true;
  }
  
  public boolean bateriaLllena(){
     if (bateria == 1000) return true;
     else 
      return false;       
  }
  public boolean bateriaVacia(){
     if (bateria == 0) return true;
     else 
      return false;       
  }
  public int energiaActual(){
     return bateria;
  }

  
}
    
   
    
   