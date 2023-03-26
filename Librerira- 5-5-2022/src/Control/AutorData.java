/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import librerira.Modelo.Autor;
import librerira.Modelo.Conexion;

/**
 *
 * @author Admin
 */
public class AutorData {
    private Connection con=null;

    public AutorData(Conexion conexion) {
        try {
            con=conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }

   
    
    public void guardarAutor(Autor autor){
    
    String sql="INSERT INTO autor (apellido, nombre, fechaNac) VALUES (?,?,?);";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, autor.getApellido());
            ps.setString(2, autor.getNombre());
            ps.setDate(3, Date.valueOf(autor.getFechaNac()));//localDate a Date
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            if (rs.next()){
              autor.setIdAutor(rs.getInt(1));
            }
            else    
                System.out.println("No se Genero el id del autor");
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Erro de conexion "+ex);
        }
    
    }
    public Autor buscarAutor(int id){
    Autor autor=new Autor();
    PreparedStatement ps=null;
    String sql="SELECT apellido, nombre, fechaNac FROM autor WHERE idAutor=?;";
        try {
            ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
        if (rs.next()){    
            autor.setIdAutor(id);
            autor.setApellido(rs.getString("apellido"));
            autor.setNombre(rs.getString("nombre"));
            autor.setFechaNac(rs.getDate("fechaNac").toLocalDate());
            ps.close();
        }
        else
             System.out.println("No nadie con ese id");
        } catch (SQLException ex) {
            System.out.println("Error ");
        }
    
    return autor;
    }
    
    
}
