/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author lucas
 */
public class Numero {
    private int num,n=0;
    private String color;

    public Numero(int num) {
        this.num = num;
        color();
        
    
    }
 public void color(){
 //Sin embargo los colores de los números dependen de la suma que dan las cifras que los componen, como los pares son de color negro y los impares de color rojo. Un ejemplo: 1, 3, 5, 7, 9 son de color rojo y todos son impares. 
 //Los números 12, 14, 16, etc
 if (num<10){//menores de 10
        if (num==0) this.color="verde";
        else
        if (num%2 ==0) this.color ="negro";
           else 
            this.color = "rojo";} 
        else{  //mayores sumo los digitos
        n += num%10+num/10;
        if (n%2==0) this.color="negro";
          else
            this.color = "rojo";
        
    }
 
 }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Numero() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public boolean es_par( int num){
       if (num%2==0) System.out.println(" Par");
        
        
        return (num%2==0);
          
    }
    public int docena(int num){
     if (1>=num && num<=12) return 1;
     else if (12>num && num<=18) return 2;
     else return 3;
    }
}
