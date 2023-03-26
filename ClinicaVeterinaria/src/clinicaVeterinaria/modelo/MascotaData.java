/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Usuario
 */
public class MascotaData {
    private Connection connection = null;
    private Conexion conexion;   

    public MascotaData(Conexion conexion) {
       
        try {
            this.conexion =conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            Logger.getLogger(MascotaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void guardarMascota(Mascota mascota){
       
        try {
            
            String sql = "INSERT INTO mascota (codigo=?,alias=?,sexo=?,especie=?, raza=?,color=?, fecNac=?,pesoMedio=?,id_cliente=?) VALUES ( ?,?,?,?,?,?,?,?,?);";
           
            Cliente c=buscarCliente(mascota.getDueño().getId());
               
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            if (c != null ){
            
            
            statement.setInt(1,mascota.getCodigo());
            statement.setString(2,mascota.getAlias());
            statement.setString(3,mascota.getSexo());
            statement.setString(4,mascota.getEspecie());
            statement.setString(5,mascota.getRaza());
            statement.setString(6,mascota.getColor());
            statement.setDate(7,Date.valueOf(mascota.getFecNac()));
            statement.setDouble(8,mascota.getPesoMedio());
            statement.setInt(9,c.getId());     
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                mascota.setId(rs.getInt(1));
                 System.out.println("mascota insertada");
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una mascota");
            }
            }
            JOptionPane.showMessageDialog(null, "Debes Insertar el cliente antes de la mascota");
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una mascota: " + ex.getMessage());
        }
    }
    
    
    
    public void agregarMascota(Mascota mascota,int id_cliente){
       
        
        try {
            
            String sql = "INSERT INTO mascota codigo=?,alias=?,sexo=?,especie=?, raza=?,color=?, fecNac=?,pesoMedio=? VALUES ( ?,?,?,?,?,?,?,? ) WHERE id_cliente=?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1,mascota.getCodigo());
            statement.setString(2,mascota.getAlias());
            statement.setString(3,mascota.getSexo());
            statement.setString(4,mascota.getEspecie());
            statement.setString(5,mascota.getRaza());
            statement.setString(6,mascota.getColor());
            statement.setDate(7,Date.valueOf(mascota.getFecNac()));
            statement.setDouble(8,retornarPesoMedio(mascota.getId()));
            statement.setInt(9,id_cliente);     
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                mascota.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una mascota");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una mascota: " + ex.getMessage());
        }
    }
    
    public Cliente obtenerDueño(Mascota m){
   Cliente cliente=null;
            

        try {
            String sql = "SELECT * FROM mascota where id_Clietne=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, m.getDueño().getId());
            ResultSet resultSet = statement.executeQuery();
            Mascota mascota;
            if (resultSet.next()){
              cliente= buscarCliente(resultSet.getInt("id_cliente"));
               
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener el dueño " + ex.getMessage());
        }
        
        
        return cliente;
    }
    
    public Mascota buscarMascota(int id){
       
        Mascota mascota= new Mascota();
    try {
            
            String sql = "SELECT * FROM mascota WHERE id =?";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
               mascota.setId(resultSet.getInt("id"));
               mascota.setCodigo(resultSet.getInt("codigo"));
               mascota.setAlias(resultSet.getString("alias"));
               mascota.setSexo(resultSet.getString("sexo"));
               mascota.setEspecie(resultSet.getString("especie"));
               mascota.setRaza(resultSet.getString("raza"));
               mascota.setColor(resultSet.getString("color"));
               mascota.setFecNac(resultSet.getDate("fecNac").toLocalDate());      
                mascota.setPesoMedio(resultSet.getDouble("pesoMedio"));   
               Cliente c=buscarCliente(resultSet.getInt("id_cliente"));
               mascota.setDueño(c);

                
            }      
            statement.close();
     
        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex.getMessage());
        }
        
        return mascota;
    }
    public void borrarMascota (int id){
    
        
    try {
            
            String sql = "DELETE FROM mascota WHERE id =?";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar una mascota: " + ex.getMessage());
        }
        
    
    
    }
    public void actualizarMascota(Mascota mascota){
    try {
            
            String sql = "UPDATE mascota SET odigo=?,alias=?,sexo=?,especie=?, raza=?,color=?, fecNac=?,pesoMedio=?,id_cliente=? WHERE id = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            statement.setInt(1,mascota.getCodigo());
            statement.setString(2,mascota.getAlias());
            statement.setString(3,mascota.getSexo());
            statement.setString(4,mascota.getEspecie());
            statement.setString(5,mascota.getRaza());
            statement.setString(6,mascota.getColor());
            statement.setDate(7,Date.valueOf(mascota.getFecNac()));
            statement.setDouble(8,mascota.getPesoMedio());
            statement.setInt(9,mascota.getDueño().getId());  
            statement.setInt(10,mascota.getId());  
            
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actulizar: " + ex.getMessage());
        }
     
        
    
    }

    public Cliente buscarCliente(int id) {
         
    
        ClienteData cd=new ClienteData(conexion);
        
        return cd.buscarCliente(id);
        
    
    }
 public List <Mascota> obtenerMascotas(){
     List <Mascota> lista = new ArrayList <Mascota>();
     
     
    try {
            
            String sql = "SELECT * FROM mascota";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                 Mascota mascota= new Mascota();
               mascota.setId(resultSet.getInt("id"));
               mascota.setCodigo(resultSet.getInt("codigo"));
               mascota.setAlias(resultSet.getString("alias"));
               mascota.setSexo(resultSet.getString("sexo"));
               mascota.setEspecie(resultSet.getString("especie"));
               mascota.setRaza(resultSet.getString("raza"));
               mascota.setColor(resultSet.getString("color"));
               mascota.setFecNac(resultSet.getDate("fecNac").toLocalDate());      
                mascota.setPesoMedio(resultSet.getDouble("pesoMedio"));   
               Cliente c=buscarCliente(resultSet.getInt("id_cliente"));
               mascota.setDueño(c);
               lista.add(mascota);

                
            }      
            statement.close();
     
        } catch (SQLException ex) {
            System.out.println("Error al buscar: " + ex.getMessage());
        }
        
        return lista;
     
 }

    private double retornarPesoMedio(int id_m) {
      VisitaData vd = new VisitaData(conexion);
     Visita v = new Visita();
     double p=0;
   
        try {
            String sql = "SELECT * FROM visita where id_mascota=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, id_m);
            ResultSet resultSet = statement.executeQuery();
          
            if (resultSet.next()){
              p = (resultSet.getInt("pesoActual"));
               
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la visita " + ex.getMessage());
        }
     
     
     
     return p;
    }
}

