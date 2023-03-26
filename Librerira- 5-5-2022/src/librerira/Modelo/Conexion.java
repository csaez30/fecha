/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librerira.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Conexion {
  
    private String url="jdbc:mysql://localhost/libreria";
    private String usuario="root";
    private String password="";

    private Connection conexion;
    
    public Conexion() throws ClassNotFoundException{
            Class.forName("org.mariadb.jdbc.Driver");
        
    }
    
   
    
    public Connection getConexion() throws SQLException{
        if(conexion == null){
                    // Setup the connection with the DB
            conexion = DriverManager
                .getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                        + "&user=" + usuario + "&password=" + password);
        }
        return conexion;
    }
}



