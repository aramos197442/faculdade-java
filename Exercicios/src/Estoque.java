import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int produto, quantidade, opcao, compra=0, venda = 0;
		Scanner valor = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("1 - Compra, 2-Venda: ");
			opcao = valor.nextInt();
			
			if(opcao == 1) {
				System.out.println("Quantidade comprada: ");
				compra = valor.nextInt();
				
			}else if(opcao==2) {
				System.out.println("Quantidade vendida: ");
				venda = valor.nextInt();
				try {
					if (venda > compra) { 
						throw new ExcecaoVenda(compra, venda);
					}else {
						System.out.println("Parabéns pela venda de "+venda+" unidades.");
					}
				} catch (ExcecaoVenda e) {
					System.out.println("Sem estoque!!!");
				} finally {
					System.out.println("Venda encerrada!!!!");
				}
			}
				
		} }}
		
		

	
