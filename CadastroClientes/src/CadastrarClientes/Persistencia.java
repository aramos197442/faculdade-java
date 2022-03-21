package CadastrarClientes;

import java.util.ArrayList;

public class Persistencia implements IPadraoPersistencia{
	
	ArrayList clientes = new ArrayList();

	@Override
	public void inserir(Object o) {
		clientes.add(o);
	}

	@Override
	public void alterar(Object o) {
		
		if(clientes.contains(o) == true) {
			clientes.remove(o);
		}
		clientes.add(o);		
	}

	@Override
	public void remover(Object o) {
		clientes.remove(o);		
	}

	@Override
	public ArrayList listar() {		
		return clientes;
	}


}