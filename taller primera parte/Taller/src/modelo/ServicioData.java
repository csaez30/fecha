/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ServicioData {
    private Connection con;
    
    public ServicioData(Conexion conexion){
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    public void guardarServicio(Servicio servicio){
        try {
            
            String sql = "INSERT INTO `servicio`( `nombre`, `descripcion`, `costo`) VALUES ([?],[?],[?],[?])";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, servicio.getNombre());
            ps.setString(2, servicio.getDescripcion());
            ps.setDouble(3, servicio.getCosto());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                servicio.setCodigo(1);
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un servicio");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un servicio: " + ex.getMessage());
        }
    }
    
    public List<Servicio> listarServicios(){
    List<Servicio> servicios = new ArrayList<Servicio>();
            

        try {
            String sql = "SELECT * FROM servicio;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Servicio servicio;
            while(resultSet.next()){
                servicio = new Servicio();
                servicio.setCodigo(resultSet.getInt("codigo"));
                servicio.setNombre(resultSet.getString("nombre"));
                servicio.setDescripcion(resultSet.getString("descripcion"));
                servicio.setCosto(resultSet.getDouble("costo")); 

                servicios.add(servicio);
            }      
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los servicios: " + ex.getMessage());
        }
        
        
        return servicios;
    
    }
    
    public void borrarServicio(int codigo ){
    try {
            
            String sql = "DELETE FROM servicio WHERE codigo =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, codigo);
                      
            ps.executeUpdate();
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un servicio: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarServicio(Servicio servicio){
    
        try {
            
            String sql = "UPDATE servicio SET nombre = ?, descripcion = ? , "
                    + "costo =? WHERE codigo = ?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, servicio.getNombre());
            ps.setString(2, servicio.getDescripcion());
            ps.setDouble(3, servicio.getCosto());
            ps.setInt(4, servicio.getCodigo());
            ps.executeUpdate();
            
          
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar servicio: " + ex.getMessage());
        }
    
    }
    public Servicio buscarServicio(int id){
        Servicio servicio = null;
    try {
            
            String sql = "SELECT * FROM servicio WHERE codigo =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
           
            
            ResultSet resultSet=ps.executeQuery();
            
            while(resultSet.next()){
                servicio = new Servicio();
                servicio.setCodigo(resultSet.getInt("codigo"));
                servicio.setNombre(resultSet.getString("nombre"));
                servicio.setDescripcion(resultSet.getString("descripcion"));
                servicio.setCosto(resultSet.getDouble("costo"));

                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar un servicio: " + ex.getMessage());
        }
        
        return servicio;
    }
    
}
