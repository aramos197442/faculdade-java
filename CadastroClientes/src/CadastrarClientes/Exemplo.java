package CadastrarClientes;

import java.util.ArrayList;

public class Exemplo {
	
	public static void main(String[] args) {
		
		
		Cliente c1 = new Cliente();
		c1.setCodigo(1);
		c1.setNome("Douglas");
				
		Cliente c2 = new Cliente();
		c2.setCodigo(2);
		c2.setNome("Douglas 2");
		
		Cliente c3 = new Cliente();
		c3.setCodigo(3);
		c3.setNome("Douglas 3");

		ArrayList clientes = new ArrayList();
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		
		Cliente c4 = new Cliente();
		c4.setCodigo(3);
		
		
		int total = clientes.size();		
		System.out.println(total);
		
		
		clientes.remove(c4);
		
		total = clientes.size();		
		System.out.println(total);
		
		
	}

}
