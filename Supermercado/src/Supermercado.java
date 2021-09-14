import java.util.Scanner;

public class Supermercado {
	private double  vendaMediaMensal, precoAtual, resultadoCalculo;
   
	private double getResultadoCalculo() {
		return resultadoCalculo;
	}


	private Supermercado(double mediaMensal, double $precoAtual ) {
		this.vendaMediaMensal = mediaMensal;
		this.precoAtual = $precoAtual;
		
		if( this.vendaMediaMensal < 500 && this.precoAtual <30 ) {
			
			this.resultadoCalculo = this.precoAtual * 1.10;			

		}else if( this.vendaMediaMensal >= 500 && this.vendaMediaMensal < 1200 && this.precoAtual >=30 && this.precoAtual < 80) {
			
			this.resultadoCalculo = this.precoAtual * 1.15;
		
		}else if( this.vendaMediaMensal >= 1200 && this.precoAtual >= 80){
		
			this.resultadoCalculo = this.precoAtual * 0.80; 
		
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double vendaMediaMensal, precoAtual;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Venda média: ");
		vendaMediaMensal = entrada.nextDouble();
		System.out.println("Preço atual: ");
		precoAtual = entrada.nextDouble();
		
		Supermercado mercado = new Supermercado( vendaMediaMensal, precoAtual);
		
		
		System.out.printf("Resultado é: %.2f", mercado.getResultadoCalculo());

	
	}

}
