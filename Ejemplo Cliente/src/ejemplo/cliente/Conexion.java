/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.cliente;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author juanj
 */
public class Conexion {
    
    private final String url = "jdbc:mysql://localhost:3306/sistema";
    private final String user = "root";
    private final String pass = "";
    private Connection con;
    
    public Connection getConection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion exitosa!!!");
        }
        catch(SQLException | ClassNotFoundException e){
            System.err.print(e);
        
        }
        return  con;
    }
}