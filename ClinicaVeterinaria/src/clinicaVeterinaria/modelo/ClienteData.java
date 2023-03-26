/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaVeterinaria.modelo; 

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
 * @author alejo
 */
public class ClienteData {
    private Connection connection = null;
    private Conexion conexion;
    public ClienteData(Conexion conexion) {
       
        try {
            this.conexion = conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void guardarCliente(Cliente cliente){
        try {
            
            String sql = "INSERT INTO cliente (nombreApellido, dni, direccion, telefono,contacto) VALUES ( ? , ? , ? ,?,?);";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, cliente.getNombreyApellido());
            statement.setString(2, cliente.getDni());
            statement.setString(3, cliente.getDireccion());
            statement.setString(4, cliente.getTelefono());
            statement.setString(5, cliente.getContacto());
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                cliente.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un cliente");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar el cliente: " + ex.getMessage());
        }
    }
    
    public void agregarMascota(Mascota mascota, int id_cliente){
        MascotaData md= new MascotaData(conexion);
        md.agregarMascota(mascota, id_cliente);
        
    }
    
    public List<Mascota> obtenerMascotas(Cliente cliente){
        List<Mascota> mascotas = new ArrayList<Mascota>();
            

        try {
            String sql = "SELECT * FROM mascota where id_cliente=?;";
            PreparedStatement statement = connection.prepareStatement(sql);
              statement.setInt(1, cliente.getId());
            ResultSet resultSet = statement.executeQuery();
            Mascota mascota;
            while(resultSet.next()){
             
                mascota = new Mascota();
                mascota.setId(resultSet.getInt("id"));
                mascota.setCodigo(resultSet.getInt("codigo"));
                mascota.setAlias(resultSet.getString("alias"));
                mascota.setSexo(resultSet.getString("sexo"));
                mascota.setEspecie(resultSet.getString("especie"));             
                mascota.setRaza(resultSet.getString("raza"));
                 mascota.setColor(resultSet.getString("color"));
                 mascota.setFecNac(resultSet.getDate("fecNac").toLocalDate());
                Cliente c=buscarCliente(resultSet.getInt("id_cliente"));
                mascota.setDueño(c);
                       
                mascotas.add(mascota);
         
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return mascotas;
    }
    
    public void borrarCliente(int id){
    try {
            
            String sql = "DELETE FROM cliente WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar el cliente: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarCliente(Cliente cliente){
    
        try {
            
            String sql = "UPDATE cliente SET nombreApellido = ?, dni =?, direccion =?, telefono = ?,contacto = ? WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, cliente.getNombreyApellido());
            statement.setString(2, cliente.getDni());
            statement.setString(3, cliente.getDireccion());
            statement.setString(4, cliente.getTelefono());
             statement.setString(5, cliente.getContacto());
            statement.setInt(6, cliente.getId());
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar " + ex.getMessage());
        }
    
    }
    
    public Cliente buscarCliente(int id){
    Cliente cliente=null;
    try {
            
            String sql = "SELECT * FROM cliente WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            
            while(resultSet.next()){
             
                cliente = new Cliente();
                cliente.setId(resultSet.getInt("id"));
                cliente.setNombreyApellido(resultSet.getString("nombreApellido"));
                cliente.setDni(resultSet.getString("dni"));
                cliente.setDireccion(resultSet.getString("direccion"));
                cliente.setTelefono(resultSet.getString("telefono"));
                cliente.setContacto(resultSet.getString("contacto"));
          
                
            }      
            statement.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error cliente no encontrado: " + ex.getMessage());
        }
        
        return cliente;
    }
    
    
      public List<Cliente> obtenerClientes(){
        List<Cliente> clientes = new ArrayList<Cliente>();
            

        try {
            String sql = "SELECT * FROM cliente";
            PreparedStatement statement = connection.prepareStatement(sql);
          
            ResultSet resultSet = statement.executeQuery();
            Cliente cliente;
            while(resultSet.next()){
               cliente = new Cliente();
                cliente.setId(resultSet.getInt("id"));
                cliente.setNombreyApellido(resultSet.getString("nombreApellido"));
                cliente.setDni(resultSet.getString("dni"));
                cliente.setDireccion(resultSet.getString("direccion"));
                cliente.setTelefono(resultSet.getString("telefono"));
                cliente.setContacto(resultSet.getString("contacto"));
          

                clientes.add(cliente);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return clientes;
    }

   
    
    
    
    
}
