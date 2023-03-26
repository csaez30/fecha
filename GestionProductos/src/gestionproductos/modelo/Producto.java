/*strin
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionproductos.modelo;

/**
 *
 * @author Admin
 */
public class Producto {
    int idProducto;
    int codigo;
    String descripcion;
    double precio;
    Categoria categoria;
    int stock;

    public Producto(int codigo, String descripcion, double precio, Categoria categoria, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public Producto(int idProducto, int codigo, String descripcion, double precio, Categoria categoria, int stock) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", categoria=" + categoria + ", stock=" + stock + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = idProducto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj instanceof Producto) {

           Producto other = (Producto) obj;

            if (this.idProducto == other.idProducto) 
                 { return true; } 
            else { return false; }

    } else { return false; }
     
    
}}
