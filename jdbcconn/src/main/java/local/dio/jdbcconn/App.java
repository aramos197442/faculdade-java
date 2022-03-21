package local.dio.jdbcconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Connection conn = null;
	
		String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
		

		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(urlConnection, "root", "password");
			System.out.println("SUCESSO");
		} catch (SQLException e) {
			System.out.println("FALHA!!!");
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}}
