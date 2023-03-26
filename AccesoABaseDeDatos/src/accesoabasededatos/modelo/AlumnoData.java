/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoabasededatos.modelo;

import accesoabasededatos.modelo.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejo
 */
public class AlumnoData {
    private Connection con;

    public AlumnoData() {
            con = Conexion.getConexion();
       
        }
       
    
    
    
    public void guardarAlumno(Alumno alumno){//viene un alumno sin id
       String sql="INSERT INTO alumno (nombre, fecNac, activo) VALUES (?,?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre());
            ps.setDate(2,Date.valueOf(alumno.getFecNac()));
            ps.setBoolean(3, alumno.getActivo());
            
            ps.executeUpdate();//guardo en la bd
            
            ResultSet rs= ps.getGeneratedKeys();//recupero la clave primaria
            
            if (rs.next()){
               alumno.setId(rs.getInt(1));//completo el alumno en java
                System.out.println("Alta exitosa");
            }else
                System.out.println("error al obtener el id ");
            
        
        
        
        
        } catch (SQLException ex) {
            System.out.println("Error al insertar "+ex);;
        }
       
       
    }
    
   public void actualizarAlumno(Alumno alumno){//viene un alumno con id
       String sql="UPDATE alumno SET nombre=?,fecNac=?, activo=? WHERE idAlumno=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, alumno.getNombre());
            ps.setDate(2,Date.valueOf(alumno.getFecNac()));
            ps.setBoolean(3, true);
            ps.setInt(4, alumno.getId());
            
            ps.executeUpdate();//guardo en la bd
            
           
        
        } catch (SQLException ex) {
            System.out.println("Error al modificar "+ex);;
        }
       
       
    }
    
    
    
    
    
    
    
    
    
    public List<Alumno> obtenerAlumnos(){
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
            

        try {
            String sql = "SELECT * FROM alumno;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Alumno alumno;
            while(resultSet.next()){
                alumno = new Alumno();
                alumno.setId(resultSet.getInt("idAlumno"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFecNac(resultSet.getDate("fecNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));

                alumnos.add(alumno);
            }      
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return alumnos;
    }
    
    public void borrarAlumno(int id){
    try {
            
            String sql = "DELETE FROM alumno WHERE idAlumno =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
                      
            ps.executeUpdate();
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
    
    }
    
//    public void actualizarAlumno(Alumno alumno){
//    
//        try {
//            
//            String sql = "UPDATE alumno SET nombre = ?, fecNac = ? , "
//                    + "activo =? WHERE idAlumno = ?;";
//
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setString(1, alumno.getNombre());
//            ps.setDate(2, Date.valueOf(alumno.getFecNac()));
//            ps.setBoolean(3, alumno.getActivo());
//            ps.setInt(4, alumno.getId());
//            ps.executeUpdate();
//            
//          
//            ps.close();
//    
//        } catch (SQLException ex) {
//            System.out.println("Error al actualizar un alumno: " + ex.getMessage());
//        }
    
    //}
    
    public Alumno buscarAlumno(int id){
    Alumno alumno=null;
    try {
            
            String sql = "SELECT * FROM alumno WHERE idAlumno =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
           
            
            ResultSet resultSet=ps.executeQuery();
            
            while(resultSet.next()){
                alumno = new Alumno();
                alumno.setId(resultSet.getInt("idAlumno"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFecNac(resultSet.getDate("fecNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));

                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
        return alumno;
    }
    
}
