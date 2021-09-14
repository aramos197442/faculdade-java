import java.util.Scanner;
import javax.swing.JOptionPane;

public class Fatura {
	private String[] mes = {"janeiro","fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"} ;
	private Integer[] ultimoDia = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
	private float[] valorFatura = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

	private Fatura(int ano) {
			
		if( ano % 4 == 0) {
			this.ultimoDia[1] = 29;
		}else { this.ultimoDia[1] = 28;
		}
		
	}
	
	private String getMes(int mes) {
		return this.mes[(mes-1)];
	}

	private int getUltimoDia(int mes) {
		return this.ultimoDia[(mes-1)];
	}

	private void setValorFatura(int mes, float valor) {
		this.valorFatura[(mes-1)] = valor;
	}
	
	private float getValorFatura(int mes) {
		return this.valorFatura[mes-1];
	}
	
	private float getTotalFaturas() {
		float valor = 0;
		for (int i=0; i <= this.valorFatura.length; i++) {
			valor += this.valorFatura[i];
		}
		return valor;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
	    float valor = 0;
	    float total = 0;
	    int ano= 0;
		
	    System.out.println("Digitar o ano:");
    	ano = entrada.nextInt();
    
	    Fatura fatura = new Fatura(ano);
	    
        for(int i = 1; i<= 12; i++) {
        	System.out.println(fatura.getUltimoDia(i) +"/"+ fatura.getMes(i)+ " Valor: ");
        	valor = entrada.nextFloat();
        	fatura.setValorFatura(i, valor);
        	
        	total += valor;
        }
        
        System.out.println("TOTAL GERAL: "+total);
    	

	}

}
