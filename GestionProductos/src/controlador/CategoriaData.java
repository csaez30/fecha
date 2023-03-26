/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import gestionproductos.modelo.Categoria;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CategoriaData {
    
    public ArrayList<Categoria> obteberCategorias(){
    
    ArrayList<Categoria> lista = new ArrayList<Categoria>();
    lista.add(new Categoria(1,"Lacteos"));
    lista.add(new Categoria(2,"Almacen"));
    lista.add(new Categoria(3,"Fiambreria"));
    lista.add(new Categoria(4,"Panadería"));
    lista.add(new Categoria(5,"Conservas"));
    return lista;
    }
    
}
