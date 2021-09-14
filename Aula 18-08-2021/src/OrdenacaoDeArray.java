import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class OrdenacaoDeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int i;
	        Integer num [] = new Integer [10];
	        Random r = new Random();
	        
	        for (i=0; i<10; i++){
	            num[i] = r.nextInt(100);
	            }
	        System.out.println("Vetor original " + Arrays.toString(num));
	        Arrays.sort(num);
	        System.out.println("\nVetor em ordem cresecente" + Arrays.toString(num));
	        Arrays.sort(num,Collections.reverseOrder());
	        System.out.println("\nVetor em ordem descrrescente" + Arrays.toString(num));
	    
	}

}
