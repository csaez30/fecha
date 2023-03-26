/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author Dani Barros
 */
public class TP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        Cliente Barros = new Cliente("Daniel","Barros","San Luis","Calle s/n", "47497200");
//        Cliente Ocaño = new Cliente("Daniela","Ocaño","Villa de Las Rosas","Calle Oscura s/n","32929212");
//        Cliente Julieta = new Cliente("Julieta","Gonzalez","Dolores","Felipe Erdman","32111234");
         Cliente pau = new Cliente("Pau","campos","San luis","mitre","11");
        DirecTelefonico dir = new DirecTelefonico();
        
//        dir.agregarCliente("3544562721", Barros);
//        dir.agregarCliente("351554321", Ocaño);777
//        dir.agregarCliente("3544883322", Julieta);
        dir.agregarCliente("123", pau);
       Cliente resul= dir.buscarClientePorDni("11");
        System.out.println("cliente por dni "+resul);
        dir.borrarCliente("11");
        
       
    }
    
}
