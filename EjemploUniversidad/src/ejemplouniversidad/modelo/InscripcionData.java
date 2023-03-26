/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplouniversidad.modelo;

import ejemplouniversidad.entidades.Alumno;
import ejemplouniversidad.entidades.Inscripcion;
import ejemplouniversidad.entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cris
 */
public class InscripcionData {
      private Connection connection = null;
     private Conexion conexion;

    public InscripcionData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void guardarInscripcion(Inscripcion cursada){
        try {
            
            String sql = "INSERT INTO inscripcion (idAlumno, idMateria, calificacion) VALUES ( ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, cursada.getAlumno().getId_alumno());
            statement.setInt(2, cursada.getMateria().getIdMateria());
            statement.setDouble(3, cursada.getCalificacion());
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                cursada.setIdInscripcion(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar " + ex.getMessage());
        }
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        List<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
            

        try {
            String sql = "SELECT * FROM inscripcion;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Inscripcion inscripcion;
            while(resultSet.next()){
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(resultSet.getInt("idInscripcion"));
                
                Alumno a=buscarAlumno(resultSet.getInt("idAlumno"));
                inscripcion.setAlumno(a);
                
                Materia m=buscarMateria(resultSet.getInt("idMateria"));
                inscripcion.setMateria(m);
                inscripcion.setCalificacion(resultSet.getDouble("calificacion"));
               

                inscripciones.add(inscripcion);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los inscripciones...: " + ex.getMessage());
        }
        
        
        return inscripciones;
    }
    public List<Inscripcion> obtenerCursadasXAlumno(int id){
        List<Inscripcion> inscripciones = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            Inscripcion cursada;
            while(resultSet.next()){
                cursada = new Inscripcion();
                cursada.setIdInscripcion(resultSet.getInt("idInscripcion"));
                
                Alumno a=buscarAlumno(resultSet.getInt("idAlumno"));
                cursada.setAlumno(a);
                
                Materia m=buscarMateria(resultSet.getInt("idMateria"));
                cursada.setMateria(m);
                cursada.setCalificacion(resultSet.getDouble("calificacion"));
               

                inscripciones.add(cursada);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las inscripciones: " + ex.getMessage());
        }
        
        
        return inscripciones;
    }

    
    public Alumno buscarAlumno(int id){
    
        AlumnoData ad=new AlumnoData(conexion);
        
        return ad.buscarAlumno(id);
        
    }
    
    public Materia buscarMateria(int id){
    
        MateriaData md=new MateriaData(conexion);
        return md.buscarMateria(id);
    
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
    List<Materia> materias = new ArrayList<>();
            

        try {
            String sql = "SELECT inscripcion.idMateria, nombre FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria\n" +
"and inscripcion.idAlumno = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Materia materia;
            while(resultSet.next()){
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materias.add(materia);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener materias: " + ex.getMessage());
        }
        
        
        return materias;
      
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int id){
    List<Materia> materias = new ArrayList<Materia>();
            

        try {
            String sql = "Select * from materia where idMateria not in "
                    + "(select inscripcion.idMateria from inscripcion where idAlumno =?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Materia materia;
            while(resultSet.next()){
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materias.add(materia);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las materias: " + ex.getMessage());
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
    public void actualizarNotaCursada(int idAlumno,int idMateria, double nota){
    
        try {
            
            String sql = "UPDATE inscripcion SET calificacion = ? WHERE idAlumno =? and idMateria =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setDouble(1,nota);
            statement.setInt(2, idAlumno);
            statement.setInt(3, idMateria);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar: " + ex.getMessage());
        }
        
        
        
        
    
    }
    
    
}
