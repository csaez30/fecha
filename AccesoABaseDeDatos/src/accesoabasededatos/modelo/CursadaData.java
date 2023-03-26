/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoabasededatos.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CursadaData {
     private Connection connection = null;
     private Conexion conexion;

    public CursadaData() {
        
            connection = Conexion.getConexion();
        
    }
    
    
    public void guardarCursada(Cursada cursada){
        try {
            
            String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES ( ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, cursada.getAlumno().getId());
            statement.setInt(2, cursada.getMateria().getId());
            statement.setInt(3, cursada.getNota());
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                cursada.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar cursada");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar cursada: " + ex.getMessage());
        }
    }
    
    public List<Cursada> obtenerCursadas(){
        List<Cursada> cursadas = new ArrayList<Cursada>();
            

        try {
            String sql = "SELECT * FROM inscripcion;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Cursada cursada;
            while(resultSet.next()){
                cursada = new Cursada();
                cursada.setId(resultSet.getInt("idInscripcion"));
                
                Alumno a=buscarAlumno(resultSet.getInt("idAlumno"));
                cursada.setAlumno(a);
                
                Materia m=buscarMateria(resultSet.getInt("idMateria"));
                cursada.setMateria(m);
                cursada.setNota(resultSet.getInt("nota"));
               

                cursadas.add(cursada);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las cursadas: " + ex.getMessage());
        }
        
        
        return cursadas;
    }
    public List<Cursada> obtenerCursadasXAlumno(int id){
        List<Cursada> cursadas = new ArrayList<Cursada>();
            

        try {
            String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            Cursada cursada;
            while(resultSet.next()){
                cursada = new Cursada();
                cursada.setId(resultSet.getInt("idInscripcion"));
                
                Alumno a=buscarAlumno(resultSet.getInt("idAlumno"));
                cursada.setAlumno(a);
                
                Materia m=buscarMateria(resultSet.getInt("idMateria"));
                cursada.setMateria(m);
                cursada.setNota(resultSet.getInt("nota"));
               

                cursadas.add(cursada);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener cursadas " + ex.getMessage());
        }
        
        
        return cursadas;
    }

    
    public Alumno buscarAlumno(int id){
    
        AlumnoData ad=new AlumnoData();
        
        return ad.buscarAlumno(id);
        
    }
    
    public Materia buscarMateria(int id){
    
        MateriaData md=new MateriaData();
        return md.buscarMateria(id);
    
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
    List<Materia> materias = new ArrayList<Materia>();
            

        try {
            String sql = "SELECT materia.idMateria, nombre FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria\n" +
"and inscripcion.idAlumno = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
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
            System.out.println("Error al obtener materias...! " + ex.getMessage());
        }
        
        
        return materias;
      
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int id){
    List<Materia> materias = new ArrayList<Materia>();
            

        try {
            String sql = "Select * from materia where idMateria not in "
                    + "(select idMateria from inscripcion where idAlumno =?);";
            PreparedStatement statement = connection.prepareStatement(sql);
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
            System.out.println("Error al obtener las materias no cursadas: " + ex.getMessage());
        }
        
        
        return materias;
      
    }
    
    public void borrarCursadaDeUnaMateriaDeunAlumno(int idAlumno,int idMateria){
    
        try {
            
            String sql = "DELETE FROM inscripcion WHERE idAlumno =? and idMateria =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idAlumno);
            statement.setInt(2, idMateria);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar: " + ex.getMessage());
        }
        
        
        
        
    
    }
    public void actualizarNotaCursada(int idAlumno,int idMateria, int nota){
    
        try {
            
            String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno =? and idMateria =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1,nota);
            statement.setInt(2, idAlumno);
            statement.setInt(3, idMateria);
           
            
            statement.executeUpdate();
            
            System.out.println("actualizado correctamente ");
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar inscripcion: " + ex.getMessage());
        }
        
        
        
        
    
    }
    
}
