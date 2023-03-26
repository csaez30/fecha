/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Baraja {
    private Carta cartas[];
    private int siguienteCarta;
   
    public Baraja() {
        siguienteCarta=0;
        cartas= new Carta[40];
        crearBaraja();
      // mostrarCartas();
        barajar();
    }

//    private void crearBaraja(){
//      Carta carta;
//      for (int i=0; i<10;i++){ //de posicion 0 a 6 van 1,2,3,4,5,6,7 y 7 es sota, 8 es caballo 9 es rey 
//         carta=new Carta();
//           carta.setPalo(Palo.ORO);
//         if (i!=7 && i!=8 && i!=9){ //ORO
//                 carta.setNumero(i+1);   
//                 
//        } else if (i==7) {carta.setNumero(10);
//                          
//        }//sota                    
//           else if (i==8) {carta.setNumero(11);
//                          
//           }//caballo
//           else {carta.setNumero(12);
//       }
//        cartas[i]=carta; 
//    }//for
//    for (int i=10; i<20;i++){ //de posicion 0 a 6 van 1,2,3,4,5,6,7 y 7 es sota, 8 es caballo 9 es rey 
//        carta=new Carta();
//           carta.setPalo(Palo.BASTO);
//        if (i!=17 && i!=18 && i!=19){ //BASTO
//                 carta.setNumero(i-9);
//                 cartas[i]=carta;
//        } else if (i==17) {carta.setNumero(10);//sota
//                           cartas[i]=carta;}
//           else if (i==18){ carta.setNumero(11);//caballo
//                          cartas[i]=carta;}
//           else {carta.setNumero(12);
//                cartas[i]=carta;}
//        
//        //System.out.println(cartas[i]);
//    }//for
//    for (int i=20; i<30;i++){ //de posicion 0 a 6 van 1,2,3,4,5,6,7 y 7 es sota, 8 es caballo 9 es rey 
//        carta=new Carta();
//          carta.setPalo(Palo.COPA);
//        if (i!=27 && i!=28 && i!=29){ //COPA
//          carta.setNumero(i-19);
//          cartas[i]=carta;
//        } else if (i==27) {carta.setNumero(10);//sota
//                          cartas[i]=carta;}
//           else if (i==28) {carta.setNumero(11);//caballo
//                            cartas[i]=carta;}
//           else {carta.setNumero(12);//rey
//        cartas[i]=carta;}              
//        //System.out.println(cartas[i]);
//    }//for
//    for (int i=30; i<40;i++){ //de posicion 0 a 6 van 1,2,3,4,5,6,7 y 7 es sota, 8 es caballo 9 es rey 
//        carta=new Carta();
//          carta.setPalo(Palo.ESPADA);
//        if (i!=37 && i!=38 && i!=39){ //del 1 a 7
//                 carta.setNumero(i-29);
//                 cartas[i]=carta;
//        } else if (i==37) {carta.setNumero(10);//sota
//                         cartas[i]=carta;}
//           else if (i==38) {carta.setNumero(11);//caballo
//           cartas[i]=carta;}
//           else {carta.setNumero(12);//rey
//         cartas[i]=carta; }           
//    //System.out.println(cartas[i]);
//    }//for
    
//    }
    //------------------------------------------------------
    
   private void crearBaraja(){
      Carta carta;
      for (int i=0; i<10;i++){ //de posicion 0 a 6 van 1,2,3,4,5,6,7 y 7 es sota, 8 es caballo 9 es rey 
         carta=new Carta();
         carta.setPalo(Palo.ORO);
      switch (i){
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:{carta.setNumero(i+1);break;   }
          case 7: {carta.setNumero(10);break;}
          case 8: {carta.setNumero(11);break;}
          case 9: {carta.setNumero(12);break;}
      }
      cartas[i]=carta;
     }//for
      for (int i=10; i<20;i++){ //de posicion 0 a 6 van 1,2,3,4,5,6,7 y 7 es sota, 8 es caballo 9 es rey 
          carta=new Carta();
          carta.setPalo(Palo.BASTO);
      switch (i){
          case 10:
          case 11:
          case 12:
          case 13:
          case 14:
          case 15:
          case 16:{carta.setNumero(i-9);break;   }
          case 17: {carta.setNumero(10);break;}
          case 18: {carta.setNumero(11);break;}
          case 19: {carta.setNumero(12);break;}
      }
      cartas[i]=carta;
     }//for
      for (int i=20; i<30;i++){ //de posicion 0 a 6 van 1,2,3,4,5,6,7 y 7 es sota, 8 es caballo 9 es rey 
          carta=new Carta();
          carta.setPalo(Palo.COPA);
      switch (i){
          case 20:
          case 21:
          case 22:
          case 23:
          case 24:
          case 25:
          case 26:{carta.setNumero(i-19);break;   }
          case 27: {carta.setNumero(10);break;}
          case 28: {carta.setNumero(11);break;}
          case 29: {carta.setNumero(12);break;}
      }
      cartas[i]=carta;
     }//for
   for (int i=30; i<40;i++){ //de posicion 0 a 6 van 1,2,3,4,5,6,7 y 7 es sota, 8 es caballo 9 es rey 
       carta=new Carta();  
       carta.setPalo(Palo.ESPADA);
      switch (i){
          case 30:
          case 31:
          case 32:
          case 33:
          case 34:
          case 35:
          case 36:{carta.setNumero(i-29);break;   }
          case 37: {carta.setNumero(10);break;}
          case 38: {carta.setNumero(11);break;}
          case 39: {carta.setNumero(12);break;}
      }
      cartas[i]=carta;
     }//for   
   
   }  
     
    //_________________________--
    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }
    public void barajar(){
    Random r=new Random();
    Carta aux;
    int pos;
    for (int i=0; i<40;i++){
     pos = r.nextInt(40); //aleatoreo entre 0 y 39
     aux = cartas[pos];
     cartas[pos]=cartas[i];
     cartas[i]=aux;
     
     }
    
    
    }
    
    public Carta siguienteCarta(){
    Carta carta=null;    
    if (siguienteCarta == 39)
        siguienteCarta=0;
    else{ 
        carta=cartas[siguienteCarta];
        siguienteCarta+=1;}
    return carta;
    }
    
    public List<Carta> darCartas(int numCartas){
   
    if (numCartas>40){
            System.out.println("son demaciadas cartas, mas de las que tiene el mazo");
         
    }else if (cartasDisponibles()<numCartas){
        System.out.println("lo siento, no son suficientes las cartas que tengo disponibles");
         }
    else{
      ArrayList<Carta> darCartas=new ArrayList<>();
     for (int i=siguienteCarta; i<numCartas;i++){
         darCartas.add(siguienteCarta()); //cartas en el mazo
         
        
     }
      return darCartas;
    }
   return null;
    }
    
    
    public int cartasDisponibles(){
       return 40-siguienteCarta;
    
    }

    public void cartasMonton(){
    //mostramos las cartas que ya salieron
    if (cartasDisponibles()==40)
            System.out.println("aun no hemos sacado ninguna carta");
    else{
     System.out.println("cartas del Monton");
     for (int i=0; i<siguienteCarta;i++){
        
         System.out.println(cartas[i]);
    }
    }
    }
    
    public void mostrarCartas(){  
    //mostramos cartas del mazo 
   if (cartasDisponibles()==0)
            System.out.println("No hay cartas den el mazo");
    else{
     
       System.out.println("cartas del Mazo");
       for (int i=siguienteCarta; i<40;i++){
         
         System.out.println(cartas[i]);
    }
    
    }
    }
}
