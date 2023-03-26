/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class AlquilerData {
     private Connection con;
    private Conexion conexion;

    public AlquilerData(Conexion conexion) {
        try {
            this.conexion=conexion;
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    //Método para guardar un alquiler
    public void guardarAlquiler(Alquiler alquiler){
        try {
            String sql = "INSERT INTO alquiler (idInquilino, idInmueble, fechInicio,costo) VALUES ( ? , ? , ? , ? );";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alquiler.getInquilino().getIdInquilino());
            ps.setInt(2, alquiler.getInmueble().getIdInmueble());
            ps.setDate(3, Date.valueOf(alquiler.getFechInicio()));
            ps.setDouble(4, alquiler.getCosto());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alquiler.setIdAlquiler(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar Alquiler " + ex.getMessage());
        }
    }
    
//Obtener todas los alquileres

    public List<Alquiler> obtenerAlquileres(){
        List<Alquiler> alquileres = new ArrayList<Alquiler>();
        try {
            String sql = "SELECT * FROM alquiler;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Alquiler alquiler;
            while(resultSet.next()){
                alquiler = new Alquiler();
                alquiler.setIdAlquiler(resultSet.getInt("idAlquiler"));
                
		     //Recupero el inquilino que alquila
                InquilinoData ad = new InquilinoData(conexion);
                Inquilino a = ad.buscarInquilino(resultSet.getInt("idInquilino"));
                alquiler.setInquilino(a);
                
	 	     //Recupero el inmeble que alquila
                InmuebleData md = new InmuebleData(conexion);
                Inmueble m = md.buscarInmueble(resultSet.getInt("idInmueble"));
                alquiler.setInmueble(m);

                alquiler.setCosto(resultSet.getInt("costo"));
               
                alquileres.add(alquiler);
            }      
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Error al obtener los alquileres:  " + ex.getMessage());
        }
        return alquileres;
    }

//Borrar un alquiler de un inmueble para un inquilino en particular.
    
public void borrarAlquilerDeUnInmuebleDeunInquilino(int id_inquilino,int    id_inmueble){
        try {
            String sql = "DELETE FROM alquiler WHERE idInquilino =? and  idInmueble =?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_inquilino);
            ps.setInt(2, id_inmueble);
           
            ps.executeUpdate();
            
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar una alquiler " + ex.getMessage());
        }
    }


//Actualizar una costo para un inquilino en particular.

    public void actualizarCostoDeAlquiler(int id_inquilino,int id_inmueble, double costo){
        try {
            String sql = "UPDATE alquiler SET costo = ? WHERE idInquilino =? and idInmueble =?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1,costo);
            ps.setInt(2, id_inquilino);
            ps.setInt(3, id_inmueble);
 
            ps.executeUpdate();

            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el costo de un inmueble: " + ex.getMessage());
        }
    }
public List<Inmueble> obtenerInmueblesAlquilados(int id){
List<Inmueble> inmuebles = new ArrayList<Inmueble>();

try {
String sql = "SELECT alquiler.idInmueble, direccion FROM alquiler, cantAmbientes FROM alquiler, disonible FROM alquiler, costo FROM alquiler, inmueble WHERE alquiler.idInmueble = inmueble.idInmueble\n" +
"and alquiler.idInquilino = ?;";
PreparedStatement statement = con.prepareStatement(sql);
statement.setInt(1, id);
ResultSet resultSet = statement.executeQuery();
Inmueble inmueble;
while(resultSet.next()){
inmueble = new Inmueble();
inmueble.setIdInmueble(resultSet.getInt("idInmueble"));
inmueble.setDireccion(resultSet.getString("direccion"));
inmueble.setCantAmbientes(resultSet.getInt("cantAmbientes"));
inmueble.setDisponible(resultSet.getBoolean("disponible"));
inmueble.setCosto(resultSet.getDouble("costo"));
inmuebles.add(inmueble);
} 
statement.close();
} catch (SQLException ex) {
System.out.println("Error al obtener las inmuebles alquilados: " + ex.getMessage());
}


return inmuebles;

}

public List<Inmueble> obtenerInmueblesNOAlquilados(int id){
List<Inmueble> inmuebles = new ArrayList<Inmueble>();

try {
String sql = "Select * from inmueble where idInmueble not in "
+ "(select idInmueble from alquiler where idInquilino =?);";
PreparedStatement statement = con.prepareStatement(sql);
statement.setInt(1, id);
ResultSet resultSet = statement.executeQuery();
Inmueble inmueble;
while(resultSet.next()){
inmueble = new Inmueble();
inmueble.setIdInmueble(resultSet.getInt("idInmueble"));
inmueble.setDireccion(resultSet.getString("direccion"));
inmueble.setCantAmbientes(resultSet.getInt("cantAmbientes"));
inmueble.setDisponible(resultSet.getBoolean("disponible"));
inmueble.setCosto(resultSet.getDouble("costo"));
inmuebles.add(inmueble);

} 
statement.close();
} catch (SQLException ex) {
System.out.println("Error al obtener inmuebles no alquilados: " + ex.getMessage());
}


return inmuebles;

}
public List<Alquiler> obtenerAlquilerXInquilino(int id){
List<Alquiler> alquileres = new ArrayList<Alquiler>();

try {
String sql = "SELECT * FROM alquiler WHERE idInquilino = ?;";
PreparedStatement statement = con.prepareStatement(sql);
statement.setInt(1,id);
ResultSet resultSet = statement.executeQuery();
Alquiler alquiler;
while(resultSet.next()){
alquiler = new Alquiler();
alquiler.setIdAlquiler(resultSet.getInt("idAlquiler"));

Inquilino a=buscarInquilino(resultSet.getInt("idInquilino"));
alquiler.setInquilino(a);

Inmueble m=buscarInmueble(resultSet.getInt("idInmueble"));
alquiler.setInmueble(m);
alquiler.setCosto(resultSet.getDouble("costo"));

alquileres.add(alquiler);
} 
statement.close();
} catch (SQLException ex) {
System.out.println("Error al obtener alquileres por inquilino: " + ex.getMessage());
}


return alquileres;
}
   public Inquilino buscarInquilino(int id){

InquilinoData ad=new InquilinoData(conexion);

return ad.buscarInquilino(id);

}

public Inmueble buscarInmueble(int id){

InmuebleData md=new InmuebleData(conexion);
return md.buscarInmueble(id);

} 
}
