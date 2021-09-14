import java.util.Scanner;
	
public class infAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Nome:");
		aluno.nome = entrada.nextLine();
		System.out.println("Nota1:");
		aluno.nota1 = entrada.nextDouble();
		System.out.println("Nota2:");
		aluno.nota2 = entrada.nextDouble();
		double media = aluno.calcMed(aluno.nota1, aluno.nota2);
		
		System.out.println("A média do aluno " +aluno.nome+ " é "+ String.format("%.2f", media ));
	}

}
