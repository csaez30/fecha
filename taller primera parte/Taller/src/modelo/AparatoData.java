
package modelo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class AparatoData {
    
    private Connection con;
    private Conexion conexion;

    public AparatoData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    public void guardarAparato(Aparato aparato){
    try {
            
            String sql = "INSERT INTO `aparato`(`numSerie`, `idDueño`, `tipo`, `fecIngreso`, `fecEgreso`) VALUES ([?],[?],[?],[?],[?])";

              PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, aparato.getNumSerie());
            ps.setInt(2, aparato.getCliente().getIdCliente());
            ps.setString(3, aparato.getTipo());
            ps.setDate(4, Date.valueOf(aparato.getFecIngreso()));
            ps.setDate(5,Date.valueOf(aparato.getFecEgreso()));
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un aparato: " + ex.getMessage());
        }
    }
    public Cliente buscarCliente(int id){
        
        ClienteData cd= new ClienteData(conexion);
        
        return cd.buscarCliente(id);
        
    }
    public List<Aparato> obtenerAparatos(){
        List<Aparato> aparatos = new ArrayList<Aparato>();
            

        try {
            String sql = "SELECT * FROM aparato;";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Aparato aparato;
            while(resultSet.next()){
                aparato = new Aparato();
                aparato.setNumSerie(resultSet.getString("numSerie"));
                Cliente cliente = buscarCliente(resultSet.getInt("idDueño"));
                aparato.setCliente(cliente);
                aparato.setTipo(resultSet.getString("tipo"));
                aparato.setFecEgreso(resultSet.getDate("fecEgreso").toLocalDate());
                aparato.setFecIngreso(resultSet.getDate("fecIngreso").toLocalDate());
                
                aparatos.add(aparato);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las aparatos: " + ex.getMessage());
        }
        
        
        return aparatos;
    }
    public List<Aparato> obtenerAparatoPorDueño(int id){
        List<Aparato> aparatos = new ArrayList<Aparato>();
            

        try {
            String sql = "SELECT * FROM aparato WHERE idDueño = ?;";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            Aparato aparato;
            while(resultSet.next()){
                aparato = new Aparato();
                aparato.setNumSerie(resultSet.getString("numSerie"));
                Cliente cliente = buscarCliente(resultSet.getInt("idDueño"));
                aparato.setCliente(cliente);
                aparato.setTipo(resultSet.getString("tipo"));
                aparato.setFecEgreso(resultSet.getDate("fecEgreso").toLocalDate());
                aparato.setFecIngreso(resultSet.getDate("fecIngreso").toLocalDate());
                
                aparatos.add(aparato);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las aparatos por dueño: " + ex.getMessage());
        }
        
        
        return aparatos;
    }
        
    }
