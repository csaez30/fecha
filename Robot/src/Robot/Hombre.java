/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot;

/**
 *
 * @author alejo
 */
public class Hombre {
    private Robot robot;
    
    
    //Atributo que almacena la cantidad de tuercas que posee una rueda
 
public Hombre(){
        
    }
   
    public Hombre(Robot robot){
        //Asigno la cantidad de tuercas que me pasan por constructor al atributo
        //de la clase cantTuercas 
        this.robot = robot;
    }
    public void setRobot(Robot robot) {
        this.robot = robot;
    }
    
    public Robot getRobot() {
        return robot;
    }
    
  public void jugarConRobot(Robot robot) {
  
     robot.Avanzar(500);
     robot.Retroceder(20);
     robot.energiaActual();
  
  } 
    
}
