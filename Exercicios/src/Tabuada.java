/**
 * @author Martins
 */
import java.util.Random;
public class Tabuada {

    private int x [];
    
    public static void main(String[] args) {
        Random rm = new Random ();
        int [][] vetor = new int [10][10];
        int x=0;
        int y=0;
        try{
            for (x=0; x<11; x++) {
                for (y=0; y<10; y++) {
                    vetor [x][y] = rm.nextInt(10);
                    System.out.println(vetor [x][y]); 
                    }
            }    
        } catch(Exception e){
            System.out.println("Erro!!!");
        } finally{
            System.out.println("Acabou!!!!!!!!!!!!!!!!!!!!");
        }
    }
    
}