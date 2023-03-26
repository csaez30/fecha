/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine2020.modelo.controlador;

import cine2020.modelo.*;
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
public class ProyeccionData {
    Connection con;
    Conexion conexion;
     List butacas;

    public ProyeccionData(Conexion conexion) {
        
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            Logger.getLogger(ProyeccionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void altaProyeccion(Proyeccion proyeccion) throws SQLException {
            // Crea nuevo 
            
          // si no esta ocuapada la sala y la hora desde
            String sql = "INSERT INTO proyeccion (horaDesde, horaHasta, idPelicula, idSala) VALUES ( ?, ? , ? , ? );";            
            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setTime(1, proyeccion.getHoraDesde());
            statement.setTime(2, proyeccion.getHoraDesde());
            statement.setInt(3, proyeccion.getPelicula().getIdPelicula());
            statement.setInt(4, proyeccion.getSala().getIdSala());
             
           
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                proyeccion.setIdProyeccion(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar");
            }
             Butaca butaca;
            for (int i=1; i<10; i++){
                 for (int j=1; j<10; j++){
             butaca = new Butaca();
             String sql2 = "INSERT INTO butaca (fila, columna, estado,idProyeccion) VALUES ( ? , ? , ? , ? );";
            statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, i);
            statement.setInt(1, j);
            statement.setInt(1, 0);
            statement.setInt(1, proyeccion.getIdProyeccion());
                 }
            }
            
            
            butacas = new ArrayList();
            ButacaData bd = new ButacaData();
            butacas = obtenerButacas(proyeccion.getIdProyeccion());
            proyeccion.setButacas((ArrayList<Butaca>) butacas);
            
           
           
            
            statement.close();
            
    }
    
    public List<Butaca> obtenerButacas(int id){ //butacas para una proyeccion
    List<Butaca> butacas = new ArrayList<>();
     Proyeccion proy = new Proyeccion();
     Butaca butaca;
        
        try {
            String sql = "SELECT * FROM butaca WHERE idProyeccion = "+id+";";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                butaca = new Butaca();
                butaca.setFila(rs.getInt("fila"));
                butaca.setColumna(rs.getInt("columna"));
                 butaca.setEstado(rs.getInt("estado"));
                 ProyeccionData pd=new ProyeccionData(conexion);
                 proy = pd.buscarProyeccion(id);
                  
                  butaca.setPryeccion(proy);
                  butacas.add(butaca);
                
                
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar  " + ex.getMessage());
        }
        return butacas;
    }
    
    
    public void bajaProyeccion (int id) throws SQLException {
            String sql = "DELETE FROM proyeccion WHERE idProyeccion = ? ;";
            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
    }
    public void modificarProyeccion(Proyeccion proy) throws SQLException {
            String sql = "UPDATE proyeccion SET horaDesde, horaHasta, idPelicula, idSala) VALUES ( ?, ? , ? , ? );";
            PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setTime(1, proy.getHoraDesde());
            statement.setTime(2, proy.getHoraDesde());
            statement.setInt(3, proy.getPelicula().getIdPelicula());
            statement.setInt(4, proy.getSala().getIdSala());
             
           
           
            
            statement.executeUpdate();
            statement.close();
    }
    public Proyeccion buscarProyeccion(int id){
        Proyeccion proy = new Proyeccion();
        
        try {
            String sql = "SELECT * FROM proyeccion WHERE idProyeccion = "+id+";";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                proy.setIdProyeccion(rs.getInt("idProyeccion"));
                 proy.setHoraDesde(rs.getTime("horaDesde"));
                 proy.setHoraDesde(rs.getTime("horaHasta"));
                 SalaData sd = new SalaData(conexion);
                 Sala sala = sd.buscarSala(rs.getInt("idSala"));
                 
                 proy.setSala(sala);
                
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar proyeccion: " + ex.getMessage());
        }
        return proy;
    }
    
    
    
    
    public List<Proyeccion> obtenerProyecciones(){
          List<Proyeccion> proy = new ArrayList<>();
           String sql;
           
           
        
              
        return proy;
 }
    
    
    
    
    
    public List<Proyeccion> obtenerProyeccionesxSala(Sala sala) {
        List<Proyeccion> proySala = new ArrayList<>();
        
        return proySala;
    }
    public List<Proyeccion> obtenerProyeccionesPelicula(Pelicula pelicula) {
        List<Proyeccion> proyPeli = new ArrayList<>();
        
        return proyPeli;
    }
    
}
