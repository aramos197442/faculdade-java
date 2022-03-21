package CadastrarCidades;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Persistencia implements IPadraoPersistencia{
	
	ArrayList cidades = new ArrayList();

	@Override
	public void inserir(Object o) {
		cidades.add(o);
	}

	@Override
	public void alterar(Object o) {
		
		if(cidades.contains(o) == true) {
			cidades.remove(o);
			cidades.add(o);
		}
				
	}

	@Override
	public void remover(Object o) {
		cidades.remove(o);		
	}

	@Override
	public ArrayList listar() {		
		return cidades;
	}


}