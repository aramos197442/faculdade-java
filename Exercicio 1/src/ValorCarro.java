import java.util.Scanner;

public class ValorCarro {
	private float lucro_pretendido, impostos_calculados, valor_total;

	private float getLucro_pretendido() {
		return lucro_pretendido;
	}

	private float getImpostos_calculados() {
		return impostos_calculados;
	}

	private float getValor_total() {
		return valor_total;
	}

	private ValorCarro(float valor, float lucro, float impostos) {
		
		this.lucro_pretendido = (valor * lucro)/100;
		this.impostos_calculados = (valor * impostos )/100;
		this.valor_total = valor + lucro_pretendido + impostos_calculados;
				
	}
	
	public static void main(String[] args) {
		float valor, p_lucro, p_impostos;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Valor de custo do carro: ");
		valor = entrada.nextFloat();
		System.out.println("Percentual de Lucro: ");
		p_lucro = entrada.nextFloat();
		System.out.println("Percentual de Impostos: ");
		p_impostos = entrada.nextFloat();

		ValorCarro carro = new ValorCarro(valor,p_lucro,p_impostos);
		
		System.out.println("Valor original do carro: "+ String.format("%.2f", valor ));
		System.out.println("Lucro pretendido: "+ String.format("%.2f", carro.getLucro_pretendido() ));
		System.out.println("Impostos calculados: "+ String.format("%.2f", carro.getImpostos_calculados() ));
		System.out.println("Valor final do carro: "+ String.format("%.2f", carro.getValor_total() ));
		
	}

}
