/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulp.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ulp.modelo.Alumno;
import ulp.modelo.Cursada;
import ulp.modelo.Materia;

/**
 *
 * @author cris
 */
public class CursadaData {
    
    private Connection con = null;
    private Conexion conexion;

    public CursadaData(Conexion conexion) {
        try {
            this.conexion =conexion;
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
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
        List<Cursada> cursadas = new ArrayList<Cursada>();
            

        try {
            String sql = "SELECT * FROM cursada;";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Cursada cursada;
            while(resultSet.next()){
                cursada = new Cursada();
                cursada.setId(resultSet.getInt("id"));
                
                Alumno a=buscarAlumno(resultSet.getInt("idAlumno"));
                cursada.setAlumno(a);
                
                Materia m=buscarMateria(resultSet.getInt("idMateria"));
                cursada.setMateria(m);
                cursada.setNota(resultSet.getInt("nota"));
               

                cursadas.add(cursada);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return cursadas;
    }

     public List<Cursada> obtenerCursadasAlumno(int id){
        List<Cursada> cursadas = new ArrayList<Cursada>();
            

        try {
            String sql = "SELECT * FROM cursada WHERE idAlumno=?;";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet resultSet = st.executeQuery();
            Cursada cursada;
            while(resultSet.next()){
                cursada = new Cursada();
                cursada.setId(resultSet.getInt("id"));
                
                Alumno a=buscarAlumno(resultSet.getInt("idAlumno"));
                cursada.setAlumno(a);
                
                Materia m=buscarMateria(resultSet.getInt("idMateria"));
                cursada.setMateria(m);
                cursada.setNota(resultSet.getInt("nota"));
               

                cursadas.add(cursada);
            }      
            st.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return cursadas;
    }

      public List<Materia> obtenerMateriasCursadas(int id){
    List<Materia> materias = new ArrayList<Materia>();
            

        try {
            String sql = "SELECT idMateria, nombre FROM cursada, materia WHERE cursada.idMateria = materia.id\n" +
"and cursada.idAlumno = ?;";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Materia materia;
            while(resultSet.next()){
                materia = new Materia();
                materia.setId(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materias.add(materia);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return materias;
      
    }
        
   
     
      public void borrarCursadaDeUnaMateriaDeunAlumno(int idAlumno,int idMateria){
    
        try {
            
            String sql = "DELETE FROM cursada WHERE idAlumno =? and idMateria =?;";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idAlumno);
            statement.setInt(2, idMateria);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
        
        
        
    
    }
    public void actualizarNotaCursada(int idAlumno,int idMateria, int nota){
    
        try {
            
            String sql = "UPDATE cursada SET nota = ? WHERE idAlumno =? and idMateria =?;";

            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1,nota);
            statement.setInt(2, idAlumno);
            statement.setInt(3, idMateria);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
        
        
        
    
    }
     
     
     
     public Alumno buscarAlumno(int id){
AlumnoData ad= new AlumnoData(conexion);
return ad.buscarAlumno(id);
}
public Materia buscarMateria(int id){
MateriaData md= new MateriaData(conexion);
return md.buscarMateria(id);
}
}
 