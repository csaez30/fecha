/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
public class MateriaData {
     Connection con = null;
    
    public MateriaData(Conexion conexion){
    
       con = conexion.getConection();  //obtengo la conexion al mysql
    
    }
    
   
    public void guardarMateria(Materia materia){
    
    String sql = "INSERT INTO materia (nombre,responsable,periodo) VALUES (?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          
            ps.setString(1, materia.getNombre());
            ps.setString(2, materia.getResponsable());
            ps.setString(3, materia.getPeriodo());
            ps.executeUpdate();
             
            ResultSet rs = ps.getGeneratedKeys(); //para recorrer mi bd
            
            if (rs.next()){
            
            materia.setId(rs.getInt(1)); //recupero el id
            }
            else {
                System.out.println("No se pudo insertar ");
            }
        ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    
    public void actualizarMateria(Materia materia){
    
    String sql = "UPDATE materia SET nombre=?,responsable=?, periodo=? WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setString(2, materia.getResponsable());
            ps.setString(3, materia.getPeriodo());
            ps.setInt(4,materia.getId());
            
            ps.executeUpdate();
             
            ResultSet rs = ps.getGeneratedKeys(); //para recorrer mi bd
            
            if (rs.next()){
            
            materia.setId(rs.getInt(1)); //recupero el id
            }
            else {
                System.out.println("No se pudo actualizar ");
            }
        ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }//fin moficar
    
     public void borrarMateria(int id){
    
    String sql = "DELETE FROM materia WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            ps.setInt(1, id);
            
            ps.executeUpdate();
             
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }//fin borrar

     public Materia buscarMateria(int id){
     Materia materia = null;
    String sql = "SELECT * FROM materia WHERE id=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            ResultSet rs= ps.executeQuery();
            
            if (rs.next()){
                materia = new Materia();
                materia.setId(rs.getInt("id"));
                materia.setNombre(rs.getString("nombre"));
                materia.setResponsable(rs.getString("responsable"));
                materia.setPeriodo(rs.getString("periodo"));

                
            }      
            ps.close();
       
       
        } catch (SQLException ex) {
            System.out.println("Error al insertar : " + ex.getMessage());
        }
        
        return materia;
    }

     public List<Materia> obtenerMaterias(){
     Materia materia = null;
     List<Materia> materias = new ArrayList<Materia>();
    String sql = "SELECT * FROM materia";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            
            ResultSet rs= ps.executeQuery();
            
            while (rs.next()){
                materia = new Materia();
                materia.setId(rs.getInt("id"));
                materia.setNombre(rs.getString("nombre"));
                materia.setResponsable(rs.getString("responsable"));
                materia.setPeriodo(rs.getString("periodo"));
               materias.add(materia);
                
            }      
            ps.close();
       
       
        } catch (SQLException ex) {
            System.out.println("Error al insertar : " + ex.getMessage());
        }
        
        return materias;
    } 
}
