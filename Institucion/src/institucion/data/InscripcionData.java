/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.data;

import institucion.modelo.Conexion;
import institucion.modelo.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class InscripcionData {
    Connection con;
    public InscripcionData(Conexion conexion){
     try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    
    }
    
    public void inscribir(Inscripcion insc){
    String sql="INSERT INTO inscripcion(idMateria,idAlumno, nota) VALUES (?,?,?)";
    
       
  
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getMateria().getIdMateria());
            ps.setInt(2,insc.getAlumno().getIdAlumno());
            ps.setDouble(3,insc.getNota());
            ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                System.out.println("inscripcion guardado ");  
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alumno");
            }
        
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");;
        }
    

    
    }
    
}
