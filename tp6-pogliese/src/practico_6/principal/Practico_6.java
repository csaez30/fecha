/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico_6.principal;

import practico_6.entidades.*;
import practico_6.formularios.*;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class Practico_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            Directorio d1 = new Directorio();
            d1.agregarCliente(478205, 25381304, "Pogliese", "Javier", "Merlo", "gribaudo 305");
            d1.agregarCliente(478111, 27462011, "Abram", "Paula", "Merlo", "gribaudo 305");
            d1.agregarCliente(478205, 25381304, "Pogliese", "Javier", "Merlo", "gribaudo 305");
            d1.agregarCliente(266481437, 25381304, "Pogliese", "Javier", "Merlo", "gribaudo 305");
            d1.agregarCliente(266481111, 25381111, "Orti", "pablo", "Rosario", "gribaudo 305");

            System.out.println("de merlo");
            System.out.println(d1.buscarClientes("Merlo"));
            System.out.println("478111");
            System.out.println(d1.buscarCliente(478111));
            System.out.println("Pogliese");
            System.out.println(d1.buscarTelefono("Pogliese").firstEntry());
            System.out.println("borrar");
            System.out.println(d1.borrarCliente(25381304));
            System.out.println("dire");

    }
    
}
