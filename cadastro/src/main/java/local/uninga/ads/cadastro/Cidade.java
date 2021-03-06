package local.uninga.ads.cadastro;

public class Cidade {
	private int codigo;
	private String nome;
	private String uf;

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade() {
		super();
	}
	
	public Cidade(int codigo, String nome, String uf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.uf = uf;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	@Override
	public String toString() {
		return "Cidade [codigo=" + codigo + ", nome=" + nome + ", uf=" + uf + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((Cidade) obj).codigo == this.codigo;
	}

}