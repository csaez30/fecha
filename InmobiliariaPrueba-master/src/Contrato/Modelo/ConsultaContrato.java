/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contrato.Modelo;

import Inmueble.Modelo.ConsultasInmueble;
import Inmueble.Modelo.ConsultasTipoInmueble;
import Inmueble.Modelo.Inmueble;
import Inmueble.Modelo.TipoInmueble;
import Inquilino.Modelo.ConsultasInquilno;
import Inquilino.Modelo.Inquilino;
import Propietario.Modelo.ConsultasPropietario;
import Propietario.Modelo.Propietario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Conexion.Conexion;

import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class ConsultaContrato extends  Conexion {
   
    private Connection con = conexion();
    private PreparedStatement ps = null;

   public boolean Guardar(Contrato cont){
       
        String sql = "INSERT INTO contrato (id_inmueble, dni_inquilino, estado_contrato, monto, fecha_ini, fecha_fin) VALUES (?,?,?,?,?,?);"
                 ; 
        String sql2="UPDATE inmueble SET estado_inmueble = ? where id_inmueble = ?";
         try {
            ps=con.prepareStatement(sql);
            //ps.setInt(1,cont.getId_contrato());
            ps.setInt(1, cont.getInmueble().getId_inmueble());
            ps.setInt(2, cont.getInquilino().getDni_inquilino());
            ps.setString(3, cont.getEstado_contrato());
            ps.setDouble(4,cont.getMonto());
            ps.setDate(5, Date.valueOf(cont.getFecha_ini().toString()));
            ps.setDate(6, Date.valueOf(cont.getFecha_fin().toString()));

                        

            
            
            ps.execute();
            
            ps=con.prepareStatement(sql2);
            ps.setString(1,"No disponible");
            ps.setInt(2, cont.getInmueble().getId_inmueble());
            ps.execute();
            
            
            return true;
            
        }
        catch(SQLException e){
                System.err.println(e);
                return false;
        }finally{
            try {
                con.close();
                
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
   
   public boolean Modificar(Contrato cont){
       
        String sql = "UPDATE contrato SET estado_contrato  = ? where id_contrato = ?; ";
              //      + " UPDATE inmueble SET estado_inmueble = ? where id_inmueble = ?;"; 
        
         try {
            ps=con.prepareStatement(sql);
            ps.setString(1, cont.getEstado_contrato());
            ps.setInt(2, cont.getId_contrato());
//            if(cont.getEstado_contrato().equals("VIGENTE")){
//                ps.setString(3, "No disponible");
//            }else{
//                ps.setString(3, "Disponible");
//            }            
//            ps.setInt(4, cont.getId_inmueble());
            
            ps.execute();
            
            return true;
            
            
        }
        catch(SQLException e){
                System.err.println(e);
                return false;
        }finally{
            try {
                con.close();
                
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
   
   public boolean obtenerContratos(ArrayList<Contrato> contratos){
        Connection con = conexion();
        ResultSet rs= null;
        String sql = "SELECT * FROM contrato"; 
        
        try {
            ConsultasInmueble consultasInmueble=new ConsultasInmueble();
            ConsultasInquilno consultasInquilino=new ConsultasInquilno();
                      
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Contrato contrato = new Contrato();
                Inmueble inmueble = new Inmueble();
                Inquilino inquilino = new Inquilino();
                inmueble.setId_inmueble(rs.getInt("id_inmueble"));
                inquilino.setDni_inquilino(rs.getInt("dni_inquilino"));
                consultasInmueble.Buscar(inmueble);
                consultasInquilino.Buscar(inquilino);
                contrato.setInquilino(inquilino);
                contrato.setInmueble(inmueble);
                contrato.setId_contrato(rs.getInt("id_contrato"));
                contrato.setEstado_contrato(rs.getString("estado_contrato"));
                contrato.setMonto(rs.getDouble("monto"));
                contrato.setFecha_ini(rs.getDate("fecha_ini").toLocalDate());
                contrato.setFecha_fin(rs.getDate("fecha_fin").toLocalDate()); 
                contratos.add(contrato);
    
            }
            return true; 
        }
        catch(SQLException e){
        System.err.println(e);
        return false;
        }finally{
            try {
                con.close();
                
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
        
    }
    
   public boolean Borrar(Contrato contrato){
           Connection con = conexion();
        String sql = "DELETE FROM  contrato WHERE id_contrato=?"; 
        
        try {
            ps=con.prepareStatement(sql);
            
            ps.setInt(1,contrato.getId_contrato());
                       
            ps.execute();
            return true;
            
        }
        catch(SQLException e){
            System.err.println(e);
             return false;
        }finally{
            try {
                con.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
        
    }
   public boolean Buscar(Contrato contrato){
        ResultSet rs= null;
        Connection con = conexion();
        String sql = "SELECT * FROM contrato WHERE id_contrato=?"; 
        
        try {
            ps = con.prepareStatement(sql);
             ps.setInt(1,contrato.getId_contrato());
            rs = ps.executeQuery();
              
     
            if(rs.next()){
                ConsultasInmueble consultasInmueble=new ConsultasInmueble();
                ConsultasInquilno consultasInquilino=new ConsultasInquilno();
                Inmueble inmueble = new Inmueble();
                Inquilino inquilino = new Inquilino();
                inmueble.setId_inmueble(rs.getInt("id_inmueble"));
                inquilino.setDni_inquilino(rs.getInt("dni_inquilino"));
                consultasInmueble.Buscar(inmueble);
                consultasInquilino.Buscar(inquilino);
                contrato.setInmueble(inmueble);
                contrato.setInquilino(inquilino);
                contrato.setId_contrato(rs.getInt("id_contrato"));
                contrato.setEstado_contrato(rs.getString("estado_contrato"));
                contrato.setMonto(rs.getDouble("monto"));
                contrato.setFecha_ini(rs.getDate("fecha_ini").toLocalDate());
                contrato.setFecha_fin(rs.getDate("fecha_fin").toLocalDate()); 
                return true;
            }
            ps.close();
            return false; 
        }
        catch(SQLException e){
             System.err.println(e);
        return false;
        }finally{
            try {
                con.close();
                ps.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
        
    }
   
   public List <Contrato>  busquedaEspecifica(StringBuffer query) {
        List <Contrato> contratos= new ArrayList<Contrato>();
        Contrato contrato;
        PreparedStatement ps = null;
        Connection con = conexion();
        
        try{
            String sql = query.toString() ;
            ps = con.prepareStatement(sql); //, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=  ps.executeQuery();

            while (rs.next()){
       
                contrato = new Contrato() ;
                ConsultasInmueble consultasInmueble=new ConsultasInmueble();
                ConsultasInquilno consultasInquilino=new ConsultasInquilno();
                Inmueble inmueble = new Inmueble();
                Inquilino inquilino = new Inquilino();
                inmueble.setId_inmueble(rs.getInt("id_inmueble"));
                inquilino.setDni_inquilino(rs.getInt("dni_inquilino"));
                consultasInmueble.Buscar(inmueble);
                consultasInquilino.Buscar(inquilino);
                contrato.setInmueble(inmueble);
                contrato.setInquilino(inquilino);
                contrato.setId_contrato(rs.getInt("id_contrato"));
                contrato.setEstado_contrato(rs.getString("estado_contrato"));
                contrato.setMonto(rs.getDouble("monto"));
                contrato.setFecha_ini(rs.getDate("fecha_ini").toLocalDate());
                contrato.setFecha_fin(rs.getDate("fecha_fin").toLocalDate()); 
                contratos.add(contrato);
        }
       
        ps.close();
        
        } catch (SQLException ex){
            
           
            System.out.println("Error al  buscar " + ex.getMessage());
        }
         //System.out.println("Alumno: id: " + alumno.getId() + "; Nombre:  " + alumno.getNombre() +"; Dni: " + alumno.getDni() +"; Domicilio:  " +alumno.getDomicilio()) ;       
         return contratos;

}
}
