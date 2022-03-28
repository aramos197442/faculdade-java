package local.uninga.ads.cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static String status = null;
	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
			String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
			con = DriverManager.getConnection(url, "postgres", "postgres");
			status = "Conexão aberta!";
		}catch (SQLException e) {
			status = e.getMessage();
		}catch (Exception e) {
			status = e.getMessage();
		}
		return con;
	}
}
