/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;


/**
 *
 * @author Admin
 */
public class CursadaData {
    
    
     private Connection con;
     private Conexion conexion;
    
    public CursadaData(Conexion conexion ) throws SQLException{
        this.conexion= conexion;
        con = conexion.getConexion();
        
    }
     public void guardarCursada(Cursada cursada){
        try {
            
            String sql = "INSERT INTO cursada (idAlumno, idMateria, nota) VALUES ( ? , ? , ? );";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, cursada.getAlumno().getId());
            statement.setInt(2, cursada.getMateria().getId());
            statement.setInt(3, cursada.getNota());
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                cursada.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alumno");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
    
         }
     
     public List<Cursada> obtenerCursadas(){
     List<Cursada> cursadas = new ArrayList<>();
     String sql="SELECT * FROM cursada";
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs=ps.executeQuery();
             Cursada cur;
             while (rs.next()){
             cur= new Cursada();
             cur.setId(rs.getInt("id"));
             Alumno a = buscarAlumno(rs.getInt("idAlumno"));
             cur.setAlumno(a);
             Materia m = buscarMateria(rs.getInt("idMateria"));
             cur.setMateria(m);
             cur.setNota(rs.getInt("nota"));
             
             cursadas.add(cur);
             
             }
             
             
            
             
         } catch (SQLException ex) {
             Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     
      return cursadas;
     }
     
     public List<Materia> obtenerMateriasCursadas(int idAlum){
     List<Materia> materias = new ArrayList<>();
     String sql="SELECT materia.id, materia.nombre FROM materia, cursada WHERE materia.idMateria= cursada.idMateria AND cursada.idAlumno=?";
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, idAlum);
             ResultSet rs=ps.executeQuery();
             Materia mar;
          while (rs.next()){
             mar= new Materia();
             mar.setId(rs.getInt("id"));
             mar.setNombre(rs.getString("nombre"));
             
             materias.add(mar);
             
             }
             
             
            
             
         } catch (SQLException ex) {
             Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     
      return materias;
     }
     
     public Alumno buscarAlumno(int id){
     
     AlumnoData ad =new AlumnoData(conexion);
     return ad.buscarAlumno(id);
     
     }
    public Materia buscarMateria(int id){
     
     MateriaData md =new MateriaData(conexion);
     return md.buscarMateria(id);
     
     }
    
    
}
