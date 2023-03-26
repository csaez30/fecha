/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplouniversidad.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import ejemplouniversidad.entidades.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cris
 */
public class AlumnoData {
   Connection con;

    public AlumnoData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarAlumno(Alumno alumno){
        try {
            
            String sql = "INSERT INTO alumno (nombre, fn_alumno, activo) VALUES ( ? , ? , ? );";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre());
            ps.setDate(2, Date.valueOf(alumno.getFn_alumno()));
            ps.setBoolean(3, alumno.isActivo());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alumno.setId_alumno(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alumno");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
    }
    
    
    public void borrarAlumno(int id){
    
        String sql="DELETE FROM alumno WHERE idAlumno=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public void actualizarAlumno(Alumno alumno){
        try {
             
            String sql = "UPDATE alumno SET nombre=?, fn_alumno=?, activo=? WHERE idAlumno=?";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre());//set
            ps.setDate(2, Date.valueOf(alumno.getFn_alumno()));//set
            ps.setBoolean(3, alumno.isActivo());//set
            ps.setInt(4,alumno.getId_alumno()); //consulta
            
            ps.executeUpdate();
            
            
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al modificar un alumno: " + ex.getMessage());
        }
    }
    
    
   public List<Alumno> obtenerAlumnos(){
        Alumno alumno=null;
        List<Alumno> alumnos= new ArrayList<>();
        String sql="SELECT * FROM `alumno`";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
           
             ResultSet rs=ps.executeQuery();
             
            while (rs.next()) {
             alumno=new Alumno();
             alumno.setId_alumno(rs.getInt("idAlumno"));
             alumno.setNombre_alumno(rs.getString("nombre"));
             alumno.setFn_alumno(rs.getDate("fn_alumno").toLocalDate());
             alumno.setActivo(rs.getBoolean("activo"));
            //  System.out.println(alumno.getNombre_alumno());
             alumnos.add(alumno);
                System.out.println(alumno);
             }
             
              ps.close();
       
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
         return alumnos;
        
   }
    
   
   
   
   public Alumno buscarAlumno(int id){
        Alumno alumno=null;
        String sql="SELECT * FROM `alumno` WHERE idAlumno=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
             ps.setInt(1, id);
             ResultSet rs=ps.executeQuery();
             
             if (rs.next()) {
             alumno=new Alumno();
             alumno.setId_alumno(rs.getInt("idAlumno"));
             alumno.setNombre_alumno(rs.getString("nombre"));
             alumno.setFn_alumno(rs.getDate("fn_alumno").toLocalDate());
             alumno.setActivo(rs.getBoolean("activo"));
             
             
             }
             
              ps.close();
       
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
         return alumno;
        
   }
}
