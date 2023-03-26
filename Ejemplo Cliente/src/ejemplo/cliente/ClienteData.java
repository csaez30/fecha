/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author cris
 */
public class ClienteData {
    private Connection con = null;
    public ClienteData(Conexion conexion) {
        con = conexion.getConection();
    }
    
    
     public void cargar(Cliente cli){
  
      
      try{
           String sql= "INSERT INTO cliente (dni, nombre, domicilio) VALUES (?,?,?);";
           PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,cli.getDni());
            ps.setString(2,cli.getNombre());
            ps.setString(3, cli.getDomicilio());
            
             ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cli.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar ");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar  " + ex.getMessage());
        }   
        }
        
         
     
     
     public void modificar(Cliente cli){
    Cliente c2 = new Cliente();
     PreparedStatement ps =null;
        
        String sql= "UPDATE cliente (dni, nombre, domicilio) VALUES (?,?,?) where id=?";
        
        try{
          
            ps = con.prepareStatement(sql,ps.RETURN_GENERATED_KEYS);
            ps.setInt(1,cli.getDni());
            ps.setString(2,cli.getNombre());
            ps.setString(3, cli.getDomicilio());
             ps.setInt(4, cli.getId());
            
             ps.executeUpdate();
             ps.close();
            }
           
    
         catch (SQLException ex) {
            System.out.println("Error al insertar  " + ex.getMessage());
        }   
     }   
   public void borrar(Cliente cli){
    Cliente c2 = new Cliente();
     PreparedStatement ps =null;
        
        String sql= "DELETE from cliente where id=?";
        
        try{
          
            ps = con.prepareStatement(sql,ps.RETURN_GENERATED_KEYS);
            
             ps.setInt(1, cli.getId());
            
             ps.executeUpdate();
             ps.close();
            }
           
    
         catch (SQLException ex) {
            System.out.println("Error al borrar " + ex.getMessage());
        }   
        
        }
   
   public Cliente buscar(int id){
    Cliente cli =null;
     PreparedStatement ps =null;
        
        String sql= "SELECT from cliente where id=?";
        
        try{
          
            ps = con.prepareStatement(sql,ps.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
                      
            
            ResultSet rs =  ps.executeQuery();
            while (rs.next()) {
                cli = new Cliente();
                cli.setDni(rs.getInt("id"));
                cli.setId(rs.getInt("dni"));
                cli.setNombre(rs.getString("nombre"));
                cli.setDomicilio(rs.getString("domicilio"));
            }
             
             ps.close();
            }
           
    
         catch (SQLException ex) {
            System.out.println("Error al borrar " + ex.getMessage());
        }   
        return cli;
        }
   
    }//fin
        
      
   
    
    
    
    
    
    
