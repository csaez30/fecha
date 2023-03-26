
package modelo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteData {
    private Connection con;

    
    public ClienteData(Conexion conexion){
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    public void guardarCliente(Cliente cliente){
        try {
            
            String sql = "INSERT INTO `cliente`( `nombre`, `domicilio`, `celular`) VALUES ([?],[?],[?])";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,cliente.getNombre() );
            ps.setString(2, cliente.getDomicilio());
            ps.setString(3, cliente.getCelular());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un cliente");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un cliente: " + ex.getMessage());
        }
    }
    
    public List<Cliente> listarClientes(){
    List<Cliente> clientes = new ArrayList<Cliente>();
            

        try {
            String sql = "SELECT * FROM cliente;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Cliente cliente;
            while(resultSet.next()){
                cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setDomicilio(resultSet.getString("domicilio"));
                cliente.setCelular(resultSet.getString("celular"));

                clientes.add(cliente);
            }      
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los clientes: " + ex.getMessage());
        }
        
        
        return clientes;
    
    }
    
    public void borrarCliente(int id){
    try {
            
            String sql = "DELETE FROM cliente WHERE idCliente =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
                      
            ps.executeUpdate();
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un cliente: " + ex.getMessage());
        }
        
    
    }
    
    public void actualizarCliente(Cliente cliente){
    
        try {
            
            String sql = "UPDATE cliente SET nombre = ?, domicilio = ? , "
                    + "celular =? WHERE idCliente = ?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getDomicilio());
            ps.setString(3, cliente.getCelular());
            ps.setInt(4, cliente.getIdCliente());
            ps.executeUpdate();
            
          
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar cliente: " + ex.getMessage());
        }
    
    }
    public Cliente buscarCliente(int id){
    Cliente cliente=null;
    try {
            
            String sql = "SELECT * FROM cliente WHERE idCliente =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
           
            
            ResultSet resultSet=ps.executeQuery();
            
            while(resultSet.next()){
                cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setDomicilio(resultSet.getString("domicilio"));
                cliente.setCelular(resultSet.getString("celular"));

                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        
        return cliente;
    }
    
    }