package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conxion {
    private static Connection con = null;
    private String url = "jdbc:mysql://localhost:3306/mensajes_app";
    private String user = "root";
    private String pass = "";

    //Constructor
    public  Conxion ()
    {
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
      public  static  Connection getConnection (){
        return con;
      }
}
