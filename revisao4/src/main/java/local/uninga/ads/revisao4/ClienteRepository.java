package local.uninga.ads.revisao4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteRepository implements IPadraoRepository {

    Connection con = Conexao.getConnection();
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    String sql = "";
    public static String status = "";

    public void inserir(Object o) {
        Cliente c = (Cliente) o;
        try {
            sql = "INSERT INTO CLIENTE(CODIGO,NOME) VALUES(?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCodigo());
            ps.setString(2, c.getNome());
            ps.execute();
            ps.close();
            status = "Registro incluido com sucesso!";
        } catch (SQLException e) {
            status = "Não foi possivel incluir o registro, erro: " + e.getMessage()
                    + " sql executado: " + sql;
        }

    }

    public void alterar(Object o) {
        Cliente c = (Cliente) o;
        try {
            sql = "UPDATE CLIENTE SET NOME= ? WHERE CODIGO= ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setInt(3, c.getCodigo());
            ps.execute();
            ps.close();
            status = "Registro alterado com sucesso!";
        } catch (SQLException e) {
            status = "Não foi possivel alterar o registro, erro: " + e.getMessage()
                    + " sql executado: " + sql;
        }
    }

    public void remover(Object o) {
        Cliente c = (Cliente) o;
        try {
            sql = "DELETE FROM CLIENTE WHERE CODIGO= ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCodigo());
            ps.execute();
            ps.close();
            status = "Registro removido com sucesso!";
        } catch (SQLException e) {
            status = "Não foi possivel remover o registro, erro: " + e.getMessage()
                    + " sql executado: " + sql;
        }

    }

    public ArrayList getAll() {
        clientes.clear();        
        try {
            sql = "select * from cliente ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente(
                  rs.getInt("codigo"),
                  rs.getString("nome")
                );
                clientes.add(c);
            }
        } catch (SQLException e) {
            status = e.getMessage();
        }
        return clientes;
    }

    public Object getByID(int codigo) {
        Cliente c = null;
        try {
            sql = "select * from cliente where codigo = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCodigo());
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                c = new Cliente(
                  rs.getInt("codigo"),
                  rs.getString("nome")
                );                
            }
        } catch (SQLException e) {
            status = e.getMessage();
        }
        return c;
    }

}
