
package ejemplo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {
     Connection conn = null;
    
    public Connection conexion(){
        
         try{
          Class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection ("jdbc:mysql://localhost/sistema", "root", "");
          System.out.println("Conexion exitosa!!!");
          
          
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
       
      
         return conn;
        
    }
    
}

      
      
      