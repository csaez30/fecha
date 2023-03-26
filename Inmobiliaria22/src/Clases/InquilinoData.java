/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class InquilinoData {
     private Connection con;

    public InquilinoData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error de Conexion");
        }
    }
    
    public void guardarInquilino(Inquilino inquilino){
        
        
        try {
            String sql = "INSERT INTO inquilino (nombreCompleto, dni, celular, activo) Values ( ? , ? , ? , ? );";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, inquilino.getNombreCompleto());
            ps.setLong(2, inquilino.getDni());
            ps.setLong(3, inquilino.getCelular());
            ps.setBoolean(4, inquilino.getActivo());
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                inquilino.setIdInquilino(rs.getInt(1));
            }else {
                System.out.println("No se pudo obtener el id luego de insertar un inquilino");
                
            }
           ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar un inquilino");
        }
        
    }
    
    public List<Inquilino> obtenerInquilinos(){
        List<Inquilino> inquilinos = new ArrayList<Inquilino>();
        try {
            
            
            String sql = "SELECT * FROM inquilino";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            
            Inquilino inquilino;
            
            while(resultSet.next()){
            inquilino = new Inquilino();
            inquilino.setIdInquilino(resultSet.getInt("IdInquilino"));
            inquilino.setNombreCompleto(resultSet.getString("nombreCompleto"));
            inquilino.setDni(resultSet.getLong("dni"));
            inquilino.setCelular(resultSet.getLong("celular"));
            inquilino.setActivo(resultSet.getBoolean("activo"));
            
            
            
                inquilinos.add(inquilino);
                
                ps.close();
            
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Error al listar los inquilinos");
        }
       return inquilinos;
    }
     
    public Inquilino buscarInquilino(int id_inquilino){
        Inquilino inquilino=null;
        try {
            
            
            String sql = "SELECT * FROM inquilino WHERE idInquilino =?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_inquilino);
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
            inquilino  = new Inquilino ();
            inquilino.setIdInquilino(resultSet.getInt("IdInquilino"));
            inquilino.setNombreCompleto(resultSet.getString("nombreCompleto"));
            inquilino.setDni(resultSet.getLong("dni"));
            inquilino.setCelular(resultSet.getLong("celular"));
            inquilino.setActivo(resultSet.getBoolean("activo"));
            
            }   
            
            ps.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar un inquilino");
        }
        
        return inquilino;
        
    }      
    
    
    
     public void actualizarInquilino(Inquilino inquilino){
         
        try {
            String sql = "UPDATE inquilino SET nombreCompleto = ?, dni = ? , celular =?, activo =? WHERE idPropietario = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, inquilino.getNombreCompleto());
            ps.setLong(2, inquilino.getDni());
            ps.setLong(3, inquilino.getCelular());
            ps.setBoolean(4, inquilino.getActivo());
            ps.setInt(5, inquilino.getIdInquilino());
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un inquilino");
        }
     }
    
     public void borrarInquilino(int id_inquilino){
         
        try {
            String sql = "DELETE FROM inquilino WHERE idInquilino =?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_inquilino);
            ps.executeUpdate();
            
            ps.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar un Inquilino");
        }
          
     }
    
    
}
