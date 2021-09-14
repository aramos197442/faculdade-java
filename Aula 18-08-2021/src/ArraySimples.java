import java.util.Arrays;

public class ArraySimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayDeInteiros = new int[3];
		arrayDeInteiros[0]=10;
		arrayDeInteiros[1]=100;
		arrayDeInteiros[2]=200;
		
		String[] arrayDeString = {"um", "dois", "tres"};
		int[] arrayDeInteiro2 = {10,100,200};
		
		int i;
		for (i=0; i < arrayDeString.length; i++) {
			System.out.println("Elemento na posição "+i+" contem valor "+ arrayDeString[i]);
			
		}
		
		String[][] matrizDeString = new String[2][2];
		matrizDeString[0][0] = "um";
		matrizDeString[0][1] = "dois";
		matrizDeString[1][0] = "tres";
		matrizDeString[1][1] = "quatro";
		
		int j;
		for (i=0; i< matrizDeString.length; i++) {
			for (j=0; j < matrizDeString[i].length; j++) {
				System.out.println("Elemento na posição "+i+","+j+" contem valor "+ matrizDeString[i][j]);
			}
		}
		
	}
				
		
}


