package local.uninga.ads.cadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CidadeRepository implements IPadraoRepository{

	Connection con = Conexao.getConnection();
	ArrayList<Cidade> cidades = new ArrayList<Cidade>();
	
	String sql = "";
	public static String status = "";
	
	public void inserir(Object o) {
		Cidade c = (Cidade) o;
		try {
			sql = "INSERT INTO CIDADE(CODIGO, NOME, UF) VALUES(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,  c.getCodigo());
			ps.setString(2,  c.getNome());
			ps.setString(3,  c.getUf());
			
			ps.execute();
			ps.close();
			
			status = "Registro incluido com sucesso!";
			
		}catch(SQLException e) {
			status = "Não foi possível incluir o registro, erro: " + e.getMessage() + " sql executado: " + sql;
			
		}
	}
	
	public void alterar(Object o) {
		Cidade c = (Cidade) o;
		try {
			sql = "UPDATE CIDADE SET NOME= ?, UF = ? WHERE CODIGO = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, c.getNome());
			ps.setString(2, c.getUf());
			ps.setInt(3,  c.getCodigo());
			
			ps.execute();
			ps.close();
			
			status = "Registro alterado com sucesso!";
		} catch(SQLException e) {
			status = "Não foi possível alterar o registro, erro: " + e.getMessage() + " sql executado: " + sql;
			
		}
	}
	
	public void remover(Object o) {
		Cidade c = (Cidade) o;
		
		try {
			sql = "DELETE FROM CIDADE WHERE CODIGO = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, c.getCodigo());
			
			ps.execute();
			ps.close();

			status = "Registro removido com sucesso!";
		}catch (SQLException e) {
			status = "Não foi possível remover o registro, erro: " + e.getMessage() + " sql executado: " + sql;
			
		}
	}
	
	public ArrayList getAll() {
		cidades.clear();
		
		try {
			sql = "SELECT * FROM CIDADE";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Cidade c = new Cidade(
						rs.getInt("codigo"), 
						rs.getString("nome"), 
						rs.getString("uf") );
				cidades.add(c);
			}
			
		}catch (SQLException e) {
			status = e.getMessage();
		}
		return cidades;
	}
	
	public Object getByID(int codigo) {
		Cidade c = null;
		try {
			sql = "SELECT * FROM CIDADE WHERE CODIGO = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,  c.getCodigo());
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				c = new Cidade(
						rs.getInt("codigo"),
						rs.getString("nome"),
						rs.getString("uf") );
			}
		}catch (SQLException e) {
			status = e.getMessage();
		}
		return c;

	}
}
