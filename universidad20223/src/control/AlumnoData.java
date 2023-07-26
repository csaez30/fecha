/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Alumno;

/**
 *
 * @author Admin
 */
public class AlumnoData {
    private Connection con;

    public AlumnoData() {
        con= Conexion.getConexion();
    }
    
  public void guardarAlumno(Alumno alumno){
  
  String sql= "INSERT INTO alumno (nombre, apellido, fecNac,activo) VALUES (?,?,?,?)";
  
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setDate(3,Date.valueOf(alumno.getFecNac()));
            ps.setBoolean(4, alumno.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
           if (rs.next()){
               alumno.setId(rs.getInt(1));
           } else
                System.out.println("El alumno no pudo guardar  ");   
        
        
        ps.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  }
    
   public void actualizarAlumno(Alumno alumno){
  
  String sql= "UPDATE alumno SET nombre =?,apellido=?,fecNac=?,activo=? WHERE idAlumno=?";
  
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setDate(3,Date.valueOf(alumno.getFecNac()));
            ps.setBoolean(4, alumno.isActivo());
            ps.setInt(5, alumno.getId());
            ps.executeUpdate();
            
            ps.close();
        
        
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  }
   
  public Alumno buscarAlumno(int id){
   Alumno alu=null;   
  String sql = "SELECT idAlumno,nombre, apellido,fecNac, activo FROM alumno WHERE idAlumno=?";
  PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
               alu= new Alumno();
               alu.setId(rs.getInt("idAlumno"));
               alu.setNombre(rs.getString("nombre"));
               alu.setApellido(rs.getString("apellido"));
               alu.setFecNac(rs.getDate("fecNac").toLocalDate());
               alu.setActivo(rs.getBoolean("activo"));
                
              
            }else
                System.out.println("Alumno inexistente");
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }

     return alu;
  } 
    
    
}
