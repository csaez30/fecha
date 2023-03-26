/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import gestionproductos.modelo.Producto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ProductoData {
    List<Producto> lista= new ArrayList<Producto>();
            

    
    public void guardarProducto(Producto producto){
     producto.setIdProducto(lista.size()+1);
     
      lista.add(producto);
     JOptionPane.showMessageDialog(null, "categoria"+producto);
    }

    /**
     *
     * @return
     */
    public List<Producto> obtenerProductos(){
      return lista;
    }
    public void borrarProducto(Producto p){
    lista.remove(p);
    
    }
    public void actualizarProducto(Producto p){
        
        for(Producto it:lista){
         if (it.getIdProducto()==p.getIdProducto()){
             it.setCodigo(p.getCodigo());
             it.setDescripcion(p.getDescripcion());
             it.setPrecio(p.getPrecio());
             it.setCategoria(p.getCategoria());
             it.setStock(p.getStock());
             
             break;
             
         
         
         
         }
        
        
        }
    
    
    }
}
