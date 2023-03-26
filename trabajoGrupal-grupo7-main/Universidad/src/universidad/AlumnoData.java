/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import com.mysql.jdbc.Statement;
import entidades.Alumno;
import entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernan57
 */
public class AlumnoData {
    public AlumnoData(conexion con) {
        this.con = con.Conectar();
    }
    public AlumnoData() {
        
    }
    private Connection con;
    
    
    
    public void guardarAlumno(Alumno alumno){
    
        String sql="INSERT into alumno (nombre, fn_alumno,activo) "
                + "VALUES(?, ?, ?);";
        
        try{
        
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1,alumno.getNombreAalumno());
        ps.setDate(2, Date.valueOf(alumno.getFn_alumno()));
        ps.setBoolean(3, alumno.isActivo());
        
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys(); 
        ps.close();

            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null,"No puedo obtener id");
            }
       
        con.close();
        }catch(SQLException e){
        
            JOptionPane.showMessageDialog(null,"Error al guardar Alumno");
        }
       
    }
    
    public Alumno buscarAlumno(int id){
        Alumno alumno=new Alumno();
        String sql=("SELECT * FROM alumno WHERE idAlumno=?");
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            ps.close();
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombreAlumno(rs.getString("nombre"));
                alumno.setFn_alumno(rs.getDate("fn_alumno").toLocalDate());
                alumno.setActivo(rs.getBoolean("activo"));
            }else{
                JOptionPane.showMessageDialog(null,"El id especificado no existe");
            }
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al buscar alumno");
        }
        return alumno;
    }
    
    public void borrarAlumno(int id){
        String sql=("DELETE FROM alumno WHERE idAlumno=?");
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();  
            con.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al borrar alumno");
        }
    }
   
    public List<Alumno> ObtenerAlumnos(){
        List<Alumno> Alumnos=new ArrayList();
        Alumno alumno=null;
        String sql=("SELECT * FROM alumno");
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = ps.executeQuery();
            ps.close();
            while(rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombreAlumno(rs.getString("nombre"));
                alumno.setFn_alumno(rs.getDate("fn_alumno").toLocalDate());
                alumno.setActivo(rs.getBoolean("activo"));
                Alumnos.add(alumno);
            }
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al obtener alumno");
        }
        return Alumnos;
    }
    
    public void ActualizarAlumno(Alumno alumno){
        String sql="UPDATE alumno SET nombre=?, fn_alumno=?, activo=? WHERE idAlumno=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombreAalumno());
            ps.setDate(2, Date.valueOf(alumno.getFn_alumno()));
            ps.setBoolean(3, alumno.isActivo());
            ps.setInt(4, alumno.getIdAlumno());
            ps.executeUpdate();
            
            ps.close();
            con.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al actualizar alumno");
        }
    }

}
