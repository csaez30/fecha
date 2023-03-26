/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidadulp.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectouniversidadulp.modelo.Alumno;
import proyectouniversidadulp.modelo.Conexion;
import proyectouniversidadulp.modelo.Inscripcion;
import proyectouniversidadulp.modelo.Materia;

/**
 *
 * @author Admin
 */
public class InscripcionData {
    private Connection con;
    private Conexion conexion;
    
public InscripcionData(Conexion conexion) {
        try {
            con = conexion.getConexion();
            this.conexion=conexion;
        } catch (SQLException ex) {
            System.out.println("Error en la conexion ");
        }
    }
    
public void guardarInscripcion(Inscripcion ins){
    String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES ( ? , ? , ? );";
  
    try{
          
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ins.getAlumno().getIdAlumno());
            ps.setInt(2, ins.getMateria().getIdMateria());
            ps.setDouble(3, ins.getNota());
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                ins.setIdInsc(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar inscripcion");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una inscripcion: " + ex.getMessage());
        }
    
    }
    
public List<Inscripcion> obtenerInscripcionesMateria(int id){
        List<Inscripcion> lista= new ArrayList<>();
        String sql;
        Inscripcion ins;
        Alumno alumno;
        Materia materia;
        sql = "SELECT * FROM inscripcion,alumno,materia WHERE inscripcion.idAlumno=alumno.idAlumno and inscripcion.idMateria=materia.idMateria and materia.idMateria = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
             ps.setInt(1, id);
             ResultSet rs =ps.executeQuery();
             while (rs.next()){
                ins = new Inscripcion();
                ins.setIdInsc(rs.getInt(1));
                alumno=buscarAlumno(rs.getInt(2));
                ins.setAlumno(alumno);
                materia = buscarMateria(rs.getInt(3));
                ins.setMateria(materia);
                ins.setNota(rs.getDouble(4));
                lista.add(ins);
             }   
             
                
        } catch (SQLException ex) {
            System.out.println("Error al obtener ");
        }
    
        
        return lista;
 }
    
    
public Alumno buscarAlumno(int id){
         AlumnoData ad=new AlumnoData(conexion);
         return ad.buscarAlumno(id);
         
  }  
public Materia buscarMateria(int id){
         MateriaData md=new MateriaData(conexion);
         return md.buscarMateria(id);
         
  }    
}
