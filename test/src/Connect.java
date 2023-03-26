import java.sql.*;   
import java.util.logging.Level;
import java.util.logging.Logger;
public class Connect 
{
  public static void main(String[] args)
   {
      Connection conn = null;

      try{
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection ("jdbc:mysql://localhost/agenda", "root", "");
          System.out.println("Conexion exitosa!!!");
      }
      catch (java.sql.SQLException e){
         System.out.println("no se conecto");
   }   catch (ClassNotFoundException ex) {
           Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
       }
      if(conn != null){
			try{
			conn.close();
			}
			catch(SQLException ee){
				System.err.println("No puede cerrar la conección");
			}
			System.out.println("Database connection terminated");
            }
  }
}  
