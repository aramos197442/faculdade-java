import javax.swing.JOptionPane;

public class Cadastro {
	private Pessoa[] nomes = new Pessoa[5];
	
	public void incluir() {
		for(int i=0; i<nomes.length; i++) {
			nomes[i] = new Pessoa();
			nomes[i].setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Entre com um codigo: ")));
			nomes[i].setNome(JOptionPane.showInputDialog("Entre com um nome: "));
			//nomes[i] = JOptionPane.showInputDialog("Entre com um nome: ");
		}
	}
	
	public void listar() {
		for(int i=0; i<nomes.length; i++) {
			JOptionPane.showMessageDialog(null, nomes[i].getCodigo()+" - "+nomes[i].getNome());
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
