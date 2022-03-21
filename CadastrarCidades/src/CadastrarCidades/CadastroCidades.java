package CadastrarCidades;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class CadastroCidades {
	
	public static void main(String[] args) {
		String menu = "01 - Cadastrar nova cidade\n"+
	                  "02 - Alterar cidade\n"+
				      "03 - Remover cidade\n"+
	                  "04 - Listar cidades cadastradas\n"+
				      "05 - Sair do sistema\n"+
	                  "Digite uma opção";
		boolean sair = false;
		Cidade cidade;
		Persistencia persistencia = new Persistencia();
		while(sair == false) {
			
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1: 
				cidade = new Cidade();
				cidade.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite um codigo")));
				cidade.setNome(JOptionPane.showInputDialog("Digite um nome"));
				persistencia.inserir(cidade);
				break;
			case 2: 
				cidade = new Cidade();
				cidade.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite um codigo")));
				cidade.setNome(JOptionPane.showInputDialog("Digite um nome"));
				persistencia.alterar(cidade);
				break;
			case 3: 
				cidade = new Cidade();
				cidade.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite um codigo")));				
				persistencia.remover(cidade);
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
