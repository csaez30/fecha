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
public class CursadaData {
    
     Connection con = null;
     Conexion conexion;
    
    public CursadaData(Conexion conexion){
       this.conexion = conexion;
       con = conexion.getConection();  //obtengo la conexion al mysql
    
    }
    
   
    public void guardarCursada(Cursada cursada){
    
    String sql = "INSERT INTO cursada (id_Alumno,id_Materia,nota) VALUES (?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cursada.getAlumno().getId());
            ps.setInt(2, cursada.getMateria().getId());
            ps.setDouble(3, cursada.getNota());
            ps.executeUpdate();
             
            ResultSet rs = ps.getGeneratedKeys(); //para recorrer mi bd
            
            if (rs.next()){
            
            cursada.setId(rs.getInt(1)); //recupero el id
            }
            else {
                System.out.println("No se pudo insertar ");
            }
        ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    
    public List<Cursada> OtetenerCursada(){
         List <Cursada> cursadas = new ArrayList<Cursada>();
         Cursada cursada = null;
    String sql = "SELECT * FROM cursada;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            
            ResultSet rs= ps.executeQuery();
            
            while (rs.next()){
                cursada = new Cursada();
                cursada.setId(rs.getInt("id"));
                Alumno alumno = buscarAlumno(rs.getInt("id_Alumno"));
                cursada.setAlumno(alumno);
                 Materia materia = buscarMateria(rs.getInt("id_Materia"));
                cursada.setMateria(materia);
                cursadas.add(cursada);

                
            }      
            ps.close();
       
       
        } catch (SQLException ex) {
            System.out.println("Error al insertar  " + ex.getMessage());
        }
        
        return cursadas;
    }
    
   
    
    
    public Alumno buscarAlumno(int id){
        AlumnoData ad = new AlumnoData(conexion);
        return ad.buscarAlumno(id);
        
    
    }
    public Materia buscarMateria(int id){
        MateriaData md = new MateriaData(conexion);
        return md.buscarMateria(id);
        
    
    }
}
