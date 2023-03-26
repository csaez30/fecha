/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cris
 */
public class TratamientoData {
    
    private Connection connection = null;
    private Conexion conexion; 
    public TratamientoData(Conexion conexion) {
        try {
            this.conexion = conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarTratamiento(Tratamiento trat){
        try {
            
            String sql = "INSERT INTO tratamiento codigo=?,tipo=?,descripciona=?,importe=?, activo=? VALUES ( ?,?,?,?,? )";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1,trat.getCodigo());
            statement.setString(2,trat.getTipo());
            statement.setString(3,trat.getDescripcion());
            statement.setDouble(4,trat.getImporte());
            statement.setBoolean(5,trat.getActivo());
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                trat.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un tratamiento");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una tratamiento: " + ex.getMessage());
        }
    }
    public Tratamiento buscarTratamiento(int id){
    
        Tratamiento trat= new Tratamiento(id);
        
    try {
            
            String sql = "SELECT * FROM tratamiento WHERE id =?";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
               trat.setId(resultSet.getInt("id"));
               trat.setCodigo(resultSet.getInt("codigo"));
               trat.setTipo(resultSet.getString("tipo"));
               trat.setDescripcion(resultSet.getString("descripcion"));
               trat.setImporte(resultSet.getDouble("importe"));
               trat.setActivo(resultSet.getBoolean("activo"));
                              
            }      
            statement.close();
                     
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar " + ex.getMessage());
        }
        
        return trat;
    }
    
     public List <Tratamiento> tratamientoActivo(){
         List<Tratamiento> list = new ArrayList<Tratamiento>();
         
        Tratamiento trat;
        
    try {
           String sql = "SELECT * FROM tratamiento WHERE activo =?";   
         PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
      

            statement.setBoolean(1, true);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
               trat = new Tratamiento();
               trat.setId(resultSet.getInt("id"));
               trat.setCodigo(resultSet.getInt("codigo"));
               trat.setTipo(resultSet.getString("tipo"));
               trat.setDescripcion(resultSet.getString("descripcion"));
               trat.setImporte(resultSet.getDouble("importe"));
               trat.setActivo(resultSet.getBoolean("activo"));
               list.add(trat);
            }      
            statement.close();
                
             
        } catch (SQLException ex) {
            System.out.println("Error al buscar " + ex.getMessage());
        }
        
        return list;
    }
     
    public void borrarTratamiento (int id){
    
        
    try {
            
            String sql = "DELETE FROM tratamiento WHERE id =?";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar una tratamiento: " + ex.getMessage());
        }
         
    
    }
    
    
    public void actualizarTratamiento(Tratamiento trat){
    try {
            
            String sql = "UPDATE tratamiento SET odigo=?,tipo=?,descripcion=?,importe=?, activo=? WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            statement.setInt(1,trat.getCodigo());
            statement.setString(2,trat.getTipo());
            statement.setString(3,trat.getDescripcion());
            statement.setDouble(4,trat.getImporte());
            statement.setBoolean(5,trat.getActivo());
              
            
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actulizar: " + ex.getMessage());
        }
     
        
    
    }
    
    public List <Tratamiento> obtenerTratamiento(){
     List <Tratamiento> lista = new ArrayList <Tratamiento>();
      Tratamiento trat; 
     
    try {
            
            String sql = "SELECT * FROM tratamiento";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
           
            
            ResultSet resultSet=statement.executeQuery();
            
           while(resultSet.next()){
               trat= new Tratamiento();
               trat.setId(resultSet.getInt("id"));
               trat.setCodigo(resultSet.getInt("codigo"));
               trat.setTipo(resultSet.getString("tipo"));
               trat.setDescripcion(resultSet.getString("descripcion"));
               trat.setImporte(resultSet.getDouble("importe"));
               trat.setActivo(resultSet.getBoolean("activo"));
                lista.add(trat);              
            }      
            statement.close();
     
        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex.getMessage());
        }
        
        return lista;
     
 }
    
}
