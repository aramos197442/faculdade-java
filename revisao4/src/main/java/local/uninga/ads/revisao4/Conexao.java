package local.uninga.ads.revisao4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {    
    public static String status = "";
    public static Connection getConnection(){
        Connection con = null;
        try{
            //Class.forName("org.postgresql.Driver").newInstance();
            String url = "jdbc:mysql://127.0.0.1/uninga";
            con = DriverManager.getConnection(url,"mysql","");
            status = "Conexão aberta!";
        }catch(SQLException e){
            status = e.getMessage();
        }catch(Exception e){
            status = e.getMessage();
        }
        return con;
    }       
}
