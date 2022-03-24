package local.uninga.ads.revisao4;

import javax.swing.JOptionPane;

public class CadastroClientes {
	    
    public static void main(String[] args) {
		
		String menu = "1 - Cadastrar\n"+
		              "2 - Alterar\n"+
                      "3 - Remover\n"+
		              "4 - Listar\n"+
                      "5 - Sair do sistema\n"+
		              "Digite uma opção:";
		boolean sair = false;
		Cliente cliente;
		ClienteRepository repository = new ClienteRepository();
		
		while(sair==false) {
			
			int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (op) {
			case 1:
				cliente = new Cliente();
				cliente.setCodigo( Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo")));
				cliente.setNome(JOptionPane.showInputDialog("Digite o nome"));
				repository.inserir(cliente);
				break;
			case 2:
				cliente = new Cliente();
				cliente.setCodigo( Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo a ser alterado")));
				cliente.setNome(JOptionPane.showInputDialog("Digite o nome a ser alterado"));
				repository.alterar(cliente);				
				break;
			case 3:
				cliente = new Cliente();
				cliente.setCodigo( Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo a ser removidoo")));				
				repository.remover(cliente);	
				break;
			case 4:
				JOptionPane.showMessageDialog(null, repository.getAll().toArray());
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Saindo do sistema...");
				sair = true;
				break;
			}			
		}
	}
    
}
