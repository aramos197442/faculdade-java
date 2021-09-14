import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int par=0, impar=0;
		
		Scanner entrada = new Scanner(System.in);
        CalculaParesImpares calcula = new CalculaParesImpares();
        
		System.out.println("Digite um valor:");
		calcula.setNumero(entrada.nextInt());

		for (int i=1; i <= calcula.getNumero(); i++) {
			if (i % 2 == 0) {
				par += i;
			} else {
				impar += i;
			}
		}
		calcula.setPar(par);
		calcula.setImpar(impar);
		System.out.println("Total Pares: " +calcula.getPar()+ " e Impares: "+ calcula.getImpar());

	}

} 
