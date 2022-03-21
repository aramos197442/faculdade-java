package CadastrarClientes;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class CadastroCliente {
	
	public static void main(String[] args) {
		String menu = "01 - Cadastrar\n"+
	                  "02 - Alterar\n"+
				      "03 - Remover\n"+
	                  "04 - Listar\n"+
				      "05 - Sair do sistema\n"+
	                  "Digite uma opção";
		boolean sair = false;
		Cliente cliente;
		Persistencia persistencia = new Persistencia();
		while(sair == false) {
			
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1: 
				cliente = new Cliente();
				cliente.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite um codigo")));
				cliente.setNome(JOptionPane.showInputDialog("Digite um nome"));
				persistencia.inserir(cliente);
				break;
			case 2: 
				cliente = new Cliente();
				cliente.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite um codigo")));
				cliente.setNome(JOptionPane.showInputDialog("Digite um nome"));
				persistencia.alterar(cliente);
				break;
			case 3: 
				cliente = new Cliente();
				cliente.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite um codigo")));				
				persistencia.remover(cliente);
				break;
			case 4: 
				JOptionPane.showMessageDialog(null, persistencia.listar().toArray());
				break;
			case 5: 
				sair = true;
				JOptionPane.showMessageDialog(null, "Saindo do sistema");
				break;

			}
			
		}
		
	}
}



