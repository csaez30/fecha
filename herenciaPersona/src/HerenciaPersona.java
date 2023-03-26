/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */
public class HerenciaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Profesor pp= new Profesor(); 
      Deportista dep= new Deportista("atleta", 12.4,"Juan",432555,53543);
      Profesor prof= new Profesor("Matematicas", "Tecnicatura de Soft","Pablo",432555,53543); 
        
       prof.caminar(); //caminar de la clase persona
        
        dep.caminar();
         ;
         pp.caminar();
    }
    
}
