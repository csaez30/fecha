/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.data;

import institucion.modelo.Alumno;
import institucion.modelo.Conexion;
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
 * @author alejo
 */
public class AlumnoData {
    private Connection con;

    public AlumnoData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarAlumno(Alumno alumno){
        try {
            
            String sql = "INSERT INTO alumno (apellido, nombre, fechaNac, activo) VALUES ( ? , ? , ? ,?);";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getApellido());
            ps.setString(2, alumno.getNombre());
            ps.setDate(3, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(4, alumno.isActivo());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                System.out.println("alumno guardado ");  
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alumno");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
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
                alumno.setIdAlumno(resultSet.getInt("idAlumno"));
                 alumno.setApellido(resultSet.getString("apellido"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFechaNac(resultSet.getDate("fechaNac").toLocalDate());
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
            
            String sql = "UPDATE alumno SET activo=0 WHERE idAlumno=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
                      
            ps.executeUpdate();
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un alumno: " + ex.getMessage());
        }
        
    
    }
    public void activarAlumno(int id){
    try {
            
            String sql = "UPDATE alumno SET activo=1 WHERE idAlumno=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
                      
            ps.executeUpdate();
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al activar un alumno: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarAlumno(Alumno alumno){
    
        try {
            
            String sql = "UPDATE alumno SET apellido=?, nombre = ?, fechaNac = ?"
                    + " WHERE idAlumno = ?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getApellido());
            ps.setString(2, alumno.getNombre());
            ps.setDate(3, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(4, alumno.getIdAlumno());
            ps.executeUpdate();
            
          
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un alumno: " + ex.getMessage());
        }
    
    }
    
    public Alumno buscarAlumno(int id){
    Alumno alumno=null;
    try {
            
            String sql = "SELECT * FROM alumno WHERE idAlumno =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
           
            
            ResultSet resultSet=ps.executeQuery();
            
            if (resultSet.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(resultSet.getInt("idAlumno"));
                alumno.setApellido(resultSet.getString("apellido"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFechaNac(resultSet.getDate("fechaNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));

                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
        return alumno;
    }
    
}
