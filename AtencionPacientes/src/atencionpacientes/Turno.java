/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atencionpacientes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Turno {
    
    private TreeMap<Integer,Paciente> pacientes;

    public Turno() {
        pacientes= new TreeMap<>();
    }
    public TreeMap<Integer, Paciente> getMapa(){
         return pacientes;
    
    }
    public boolean agregarPaciente(int turno, Paciente paciente){
        return pacientes.put(turno, paciente)==null;
//        pacientes.put(3, new Paciente("Mario tojas", 4445365,"leve"));
//        pacientes.put(11, new Paciente("Arian Sara", 111535,"medio"));
//        pacientes.put(1, new Paciente("Jesica Montiveros", 115365,"critico"));
//        pacientes.put(15, new Paciente("Julieta Ochoa", 555365,"critico"));
//        pacientes.put(5, new Paciente("Vivi Blasco", 555365,"leve"));
    
    }
    
    public Paciente buscarPaciente(int turno){
       if  (pacientes.containsKey(turno)){
          return pacientes.get(turno);
       } else 
        return null;
    
    }
    
    public void mostrarPacientes(){
      //VALORES
//      Collection valores = pacientes.values();
//      Iterator it = valores.iterator();
//      while (it.hasNext()){
//         Paciente p = (Paciente)it.next();
//          System.out.println(" El paciS  
      
//CLAVES
   Set<Integer> claves = pacientes.keySet();
   Iterator it = claves.iterator();
   while (it.hasNext()){
            Integer clave = (Integer)it.next();
           System.out.println(" El paciente es "+ pacientes.get(clave));
    

      }
    //PAREJAS  recorriento con entryset
//  for(Map.Entry<Integer, Paciente> pareja:pacientes.entrySet()){
//        Integer clave = pareja.getKey();
//        Paciente valor = pareja.getValue();
//        
//        System.out.println("La clave es "+ clave+" el valor es "+valor);
//        
//  }  

    }
    public void borrarPaciente(Integer turno){
       if (pacientes.remove(turno)!=null){
           JOptionPane.showMessageDialog(null, "Exitosamente borrado");
       }else
           JOptionPane.showMessageDialog(null, "No Exite ");
    }
    
    
    
    public ArrayList<Paciente> otenerPacientes(){
    ArrayList<Paciente> lista = new ArrayList<>();
    
    for(Map.Entry<Integer, Paciente> pareja:pacientes.entrySet()){
        //Integer clave = pareja.getKey();
        Paciente valor = pareja.getValue();
        
        lista.add(valor);
        
    }
    
    return lista;
    
    
    }
}
    
    
    
    
    

