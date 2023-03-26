/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine2020.modelo.controlador;

import cine2020.modelo.Butaca;
import cine2020.modelo.Conexion;
import cine2020.modelo.Proyeccion;
import cine2020.modelo.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cris
 */
public class SalaData {
    Connection con;
    Conexion conexion;
     public SalaData(Conexion conexion) {
        
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            Logger.getLogger(ProyeccionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void altaSala(Sala sala) throws SQLException {
            // Crea nuevo vuelo
            String sql = "INSERT INTO sala (ubicacion) VALUES ( ?);";            
            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, sala.getUbicacion());
            
             
           
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                sala.setIdSala(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar ");
            }
           
           
           
            
            statement.close();
            
    }
    public void bajaSala (int id) throws SQLException {
            String sql = "DELETE FROM sala WHERE idSala = ? ;";
            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
    }
    public void modificarSala(Sala sala) throws SQLException {
            String sql = "UPDATE sala SET ubicacion) VALUES ( ?);";
            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, sala.getUbicacion());
                    
           
           
            
            statement.executeUpdate();
            statement.close();
    }
    public Sala buscarSala(int id){
        Sala sala = new Sala();
        
        try {
            String sql = "SELECT * FROM sala WHERE idSala = "+id+";";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                sala.setIdSala(rs.getInt("idSala"));
                sala.setUbicacion(rs.getInt("ubicacion"));
                 
                           
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex.getMessage());
        }
        return sala;
    }
    
    
    
    
    public List<Sala> obtenerSala(){
          List<Sala> sala = new ArrayList<>();
           String sql;
           
           
        
              
        return sala;
 }
    
    
    
            
    
}
