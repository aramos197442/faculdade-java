
public class Carro {
	String fabricante;
	String modelo;
	int ano;
	double preco;
	String cor;
	
	double parcelarCarro( int numParcelas) {
		double valorParcela;
		valorParcela = preco / numParcelas;
		return valorParcela;
	}
	
	double financiarCarro( int numParcelas, float taxa) {
		double valorParcela;
		valorParcela = preco * ((taxa /100) / (1 - Math.pow( 1 + (taxa/100), (numParcelas * -1))));
		return valorParcela;
	}

}
