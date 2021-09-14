
public class CarroDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro sonho = new Carro();
		double valorParcela;
	sonho.fabricante = "Lamborguini";
	sonho.modelo = "Murcielago";
	sonho.ano = 2021;
	sonho.preco = 1800000;
	sonho.cor = "Amarela";
	valorParcela = sonho.parcelarCarro(48);
	System.out.println("O valor da parcela será: " + String.format("R$%.2f", valorParcela) );
	valorParcela = sonho.financiarCarro(48, 1.5F);
	System.out.println("O valor da parcela será: " + String.format("R$%.2f", valorParcela) );
	
	

	}

}
