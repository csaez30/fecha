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
public class PropietarioData {
     private Connection con;

    public PropietarioData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error de Conexion");
        }
    }
    
    public void guardarPropietario(Propietario propietario){
        
        
        try {
            String sql = "INSERT INTO propietario (nombreCompleto, dni, celular) Values ( ? , ? , ? );";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, propietario.getNombreCompleto());
            ps.setLong(2, propietario.getDni());
            ps.setLong(3, propietario.getCelular());
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                propietario.setIdPropietario(rs.getInt(1));
            }else {
                System.out.println("No se pudo obtener el id luego de insertar un propietario");
                
            }
           ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar un propietario");
        }
        
    }
    
    public List<Propietario> obtenerPropietarios(){
        List<Propietario> propietarios = new ArrayList<Propietario>();
        try {
            
            
            String sql = "SELECT * FROM propietario";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            
            Propietario propietario;
            
            while(resultSet.next()){
            propietario = new Propietario();
            propietario.setIdPropietario(resultSet.getInt("IdPropietario"));
            propietario.setNombreCompleto(resultSet.getString("nombreCompleto"));
            propietario.setDni(resultSet.getLong("dni"));
            propietario.setCelular(resultSet.getLong("celular"));
            
            
            
                propietarios.add(propietario);
                
                ps.close();
            
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Error al listar los propietarios");
        }
       return propietarios;
    }
     
    public Propietario buscarPropietario(int id_propietario){
        Propietario propietario=null;
        try {
            
            
            String sql = "SELECT * FROM propietario WHERE idPropietario =?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_propietario);
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
            propietario  = new Propietario ();
            propietario.setIdPropietario(resultSet.getInt("IdPropietario"));
            propietario.setNombreCompleto(resultSet.getString("nombreCompleto"));
            propietario.setDni(resultSet.getLong("dni"));
            propietario.setCelular(resultSet.getLong("celular"));
            
            }   
            
            ps.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar un propietario");
        }
        
        return propietario;
        
    }      
    
    
    
     public void actualizarPropietario(Propietario propietario){
         
        try {
            String sql = "UPDATE propietario SET nombreCompleto = ?, dni = ? , celular =? WHERE idPropietario = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, propietario.getNombreCompleto());
            ps.setLong(2, propietario.getDni());
            ps.setLong(3, propietario.getCelular());
            ps.setInt(4,propietario.getIdPropietario());
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un propietario");
        }
     }
    
     public void borrarPropietario(int id_propietario){
         
        try {
            String sql = "DELETE FROM propietario WHERE idPropietario =?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_propietario);
            ps.executeUpdate();
            
            ps.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar un Propietario");
        }
          
     }
    
    
}
