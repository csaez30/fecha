/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidadulp.control;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import proyectouniversidadulp.modelo.Alumno;
import proyectouniversidadulp.modelo.Conexion;
import proyectouniversidadulp.modelo.Materia;

/**
 *
 * @author Admin
 */
public class MateriaData {
   

    private Connection con;

    public MateriaData(Conexion conexion) {
       
     
        try {
            con = conexion.getConexion();
            
        } catch (SQLException ex) {
            System.out.println("Error en la conexion ");
        }
   
    
    }
    
    public void guardarMateria(Materia materia){
        String sql = "INSERT INTO materia (nombre, anio, activo) VALUES (?,?,?)";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
           ps.setBoolean(3, materia.isActivo());
            
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys(); //reculepro el idAlumno
            if (rs.next()){
             materia.setIdMateria(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar"+ex);
        }
        
    
    }
      
    
   
    public void desactivarMateria(int id){
    String sql = "UPDATE materia SET activo=? WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al desactivar "+ex);
        }
    }
    
     public void activarMateria(int id){
    String sql = "UPDATE materia SET activo=? WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1,true);
            ps.setInt(2, id);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error al desactivar "+ex);
        }
    }
    
    
    public Materia buscarMateria(int id){
     Materia materia=null;
    
    String sql="SELECT * FROM materia WHERE idMateria=?";
    
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs =ps.executeQuery();
            if (rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt(1));
                materia.setNombre(rs.getString(2));
                materia.setAnio(rs.getInt(3));
                materia.setActivo(rs.getBoolean(4));
               
            }
            
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar ");
        }    
       return materia;    
       
    }
}

    

