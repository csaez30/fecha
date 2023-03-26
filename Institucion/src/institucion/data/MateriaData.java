/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.data;

import institucion.modelo.Conexion;
import institucion.modelo.Materia;
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
 * @author Usuario
 */
public class MateriaData {
    private Connection connection = null;

    public MateriaData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarMateria(Materia materia){
        try {
            
            String sql = "INSERT INTO materia (nombre,añoMateria, activo) VALUES ( ?,?,? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, materia.getNombre());
            statement.setInt(2, materia.getAnioMateria());
            statement.setBoolean(3, materia.isActivo());
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                System.out.println("materia guardada");
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una materia");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar materia: " + ex.getMessage());
        }
    }
    
    public List<Materia> obtenerMaterias(){
        List<Materia> materias = new ArrayList<Materia>();
            

        try {
            String sql = "SELECT * FROM materia;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Materia materia;
            while(resultSet.next()){
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnioMateria(resultSet.getInt("añoMateria"));
                 materia.setActivo(resultSet.getBoolean("activo"));

                materias.add(materia);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener materias " + ex.getMessage());
        }
        
        
        return materias;
    }
    
    public Materia buscarMateria(int id){
    
        Materia materia=null;
    try {
            
            String sql = "SELECT * FROM materia WHERE idMateria =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
               

                
            }      
            statement.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar materia: " + ex.getMessage());
        }
        
        return materia;
    }
    public void borrarMateria (int id){
    
        
    try {
            
            String sql = "DELETE FROM materia WHERE idMateria =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar una materia: " + ex.getMessage());
        }
        
    
    
    }
    public void actualizarMateria(Materia materia){
    try {
            
            String sql = "UPDATE materia SET nombre = ? WHERE idMateria = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, materia.getNombre());
            statement.setInt(2, materia.getIdMateria());
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar: " + ex.getMessage());
        }
     
        
    
    }
    }
    

