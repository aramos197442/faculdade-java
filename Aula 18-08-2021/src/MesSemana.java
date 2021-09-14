import java.util.Arrays;
import java.util.Scanner;

public class MesSemana {
	private String[] mes = {"janeiro","fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"} ;
	private String[] semana = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sabado"};
	
	private String getMes(int mes) {
		return this.mes[(mes-1)];
	}
	
	private String getSemana(int semana) {
		return this.semana[(semana-1)];
	}
	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int escolha, mes, semana;
	
	Scanner entrada = new Scanner(System.in);
	MesSemana ms = new MesSemana();

	System.out.println("1-Mês e 2-Semana: ");
	escolha = entrada.nextInt();
		
	while(true) {
		if( escolha == 1) {
			System.out.println("Digite de 1 a 12 para mês: ");
			mes = entrada.nextInt();
			
			if(mes < 1 || mes > 12) {
				System.out.println("Mês inválido!");
			} else {
				System.out.println(ms.getMes(mes));
				break;
			};
						
		} else {
			
			System.out.println("Digite de 1 a 7 para semana: ");
			semana = entrada.nextInt();
			
			if(semana < 1 || semana > 7 ) {
				System.out.println("Dia da semana inválido!");
			} else {
				System.out.println(ms.getSemana(semana));
				break;
			};
			
			
			
			}
		}
	}
}