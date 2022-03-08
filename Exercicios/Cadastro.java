import javax.swing.JOptionPane;

public class Cadastro {
	private String[] nomes = new String[5];
	
	public void incluir() {
		for(int i=0; i<nomes.length; i++) {
			nomes[i] = (String) JOptionPane.showInputDialog("Entre com um nome: ");
		}
	}
	
	public void listar() {
		for(int i=0; i<nomes.length; i++) {
			JOptionPane.showMessageDialog(null, nomes[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cadastro nome = new Cadastro();
		boolean sai = true;
		String menu = "1 - Incluir\n2 - Listar\n3 - Sair";
		while(sai) {
			String inputValue = JOptionPane.showInputDialog(menu);
			switch (inputValue) {
			  case "1":
				nome.incluir();
				break;
			  case "2":
			    nome.listar();
			    break;
			  case "3":
			    sai=false;
			    break;
/*			  default:
				  JOptionPane.showMessageDialog(null, "Escolha 1, 2 ou 3 apenas","alerta", JOptionPane.ERROR_MESSAGE);
				  break;
*/			}
			
		}
		
		

	}



}
