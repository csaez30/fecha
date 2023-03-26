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
public class InmuebleData {
     private Connection con;
      private Conexion conexion;


    public InmuebleData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error de Conexion");
        }
    }
    
    public void guardarInmueble(Inmueble inmueble){
        
        
        try {
            String sql = "INSERT INTO inmueble (idPropietario, direccion, cantAmbientes, disponible, costo) Values ( ? , ? , ? , ? , ?);";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inmueble.getPropietario().getIdPropietario());
            ps.setString(2, inmueble.getDireccion());
            ps.setInt(3, inmueble.getCantAmbientes());
            ps.setBoolean(4, inmueble.getDisponible());
            ps.setDouble(5, inmueble.getCosto());
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                inmueble.setIdInmueble(rs.getInt(1));
            }else {
                System.out.println("No se pudo obtener el id luego de insertar un inmueble");
                
            }
           ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al insertar un inmueble");
        }
        
    }
    
    public List<Inmueble> obtenerInmuebles(){
        List<Inmueble> inmuebles = new ArrayList<Inmueble>();
        try {
            
            
            String sql = "SELECT * FROM inmueble";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            
            Inmueble inmueble;
            
            while(resultSet.next()){
            inmueble = new Inmueble();
            inmueble.setIdInmueble(resultSet.getInt("IdInmueble"));
            int idPropietario = resultSet.getInt("idPropietario");
            Propietario p = buscarPropietario(idPropietario);
            inmueble.setPropietario(p);
            inmueble.setDireccion(resultSet.getString("direccion"));
            inmueble.setCantAmbientes(resultSet.getInt("cantAmbientes"));
            inmueble.setDisponible(resultSet.getBoolean("disponible"));
            inmueble.setCosto(resultSet.getDouble("costo"));
            
            
            
                inmuebles.add(inmueble);
                
                ps.close();
            
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Error al listar los inmuebles");
        }
       return inmuebles;
    }
    
     public Propietario buscarPropietario (int id){
    
        PropietarioData pd=new PropietarioData(conexion);
        
        return pd.buscarPropietario(id);
        
    }
    
    
    public Inmueble buscarInmueble(int id_inmueble){
        Inmueble inmueble=null;
        try {
            
            
            String sql = "SELECT * FROM inmueble WHERE idInmueble =?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_inmueble);
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()){
            inmueble  = new Inmueble ();
            inmueble.setIdInmueble(resultSet.getInt("IdInmueble"));
            inmueble.setPropietario(resultSet.getPropietario("IdPropietario"));
            inmueble.setDireccion(resultSet.getString("direccion"));
            inmueble.setCantAmbientes(resultSet.getInt("cantAmbientes"));
            inmueble.setDisponible(resultSet.getBoolean("disponible"));
            inmueble.setCosto(resultSet.getDouble("costo"));
            
            }   
            
            ps.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar un inmueble");
        }
        
        return inmueble;
        
    }      
    
    
    
     public void actualizarInmueble(Inmueble inmueble){
         
        try {
            String sql = "UPDATE inmueble SET direccion = ?, cantAmbientes = ? , disponible =?, costo =? WHERE idInmueble = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, inmueble.getDireccion());
            ps.setLong(2, inmueble.getCantAmbientes());
            ps.setBoolean(3, inmueble.getDisponible());
            ps.setDouble(4, inmueble.getCosto());
            ps.setInt(5, inmueble.getIdInmueble());
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un inmueble");
        }
     }
    
     public void borrarInmueble(int id_inmueble){
         
        try {
            String sql = "DELETE FROM inmueble WHERE idInmueble =?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_inmueble);
            ps.executeUpdate();
            
            ps.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar un Inmueble");
        }
          
     }
    
    
    
}
