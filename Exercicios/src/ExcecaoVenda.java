
public class ExcecaoVenda extends Exception  {
	int compra;
	int venda;
	

	public ExcecaoVenda(int compra, int venda){
		this.compra = compra;
		this.venda = venda;
	}
	
	public String deuMerda() {
		return "Vendeu mais do que tem em estoque!!!!!";
	}

}
