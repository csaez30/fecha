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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cris
 */
public class AlumnoData {
    
    Connection con = null;
    
    public AlumnoData(Conexion conexion){
    
       con = conexion.getConection();  //obtengo la conexion al mysql
    
    }
    
   
    public void guardarAlumno(Alumno alumno){
    
    String sql = "INSERT INTO alumno (dni,nombre,domicilio,fechaNac) VALUES (?,?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getDomicilio());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.executeUpdate();
             
            ResultSet rs = ps.getGeneratedKeys(); //para recorrer mi bd
            
            if (rs.next()){
            
            alumno.setId(rs.getInt(1)); //recupero el id
            }
            else {
                System.out.println("No se pudo insertar ");
            }
        ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    
    public void actualizarAlumno(Alumno alumno){
    
    String sql = "UPDATE alumno SET dni=?,nombre=?,domicilio=?,fechaNac=? WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getDomicilio());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getId());
            
            ps.executeUpdate();
             
            ResultSet rs = ps.getGeneratedKeys(); //para recorrer mi bd
            
            if (rs.next()){
            
            alumno.setId(rs.getInt(1)); //recupero el id
            }
            else {
                System.out.println("No se pudo actualizar ");
            }
        ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }//fin moficar
    
     public void borrarAlumno(int id){
    
    String sql = "DELETE FROM alumno WHERE id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            ps.setInt(1, id);
            
            ps.executeUpdate();
             
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }//fin borrar

     public Alumno buscarAlumno(int id){
     Alumno alumno = null;
    String sql = "SELECT * FROM alumno WHERE id=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            ResultSet rs= ps.executeQuery();
            
            if (rs.next()){
                alumno = new Alumno();
                alumno.setId(rs.getInt("id"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setDomicilio(rs.getString("domicilio"));
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYY");
                
                 alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                
            }      
            ps.close();
       
       
        } catch (SQLException ex) {
            System.out.println("Error al buscar un alumno: " + ex.getMessage());
        }
        
        return alumno;
    }

     public List<Alumno> OtetenerAlumnos(){
         List <Alumno> alumnos = new ArrayList<Alumno>();
         Alumno alumno = null;
    String sql = "SELECT * FROM alumno;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            
            ResultSet rs= ps.executeQuery();
            
            while (rs.next()){
                alumno = new Alumno();
                alumno.setId(rs.getInt("id"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setDomicilio(rs.getString("domicilio"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumnos.add(alumno);

                
            }      
            ps.close();
       
       
        } catch (SQLException ex) {
            System.out.println("Error al buscar un alumno: " + ex.getMessage());
        }
        
        return alumnos;
    }
     
     
}
