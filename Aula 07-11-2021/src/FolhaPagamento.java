import java.util.Scanner;

public class FolhaPagamento implements FP {
	public double salarioBruto = 0;
	public int dependentes =  0;
	public int horaExtra = 0;

	public void setSalarioBruto( double sB) {
		this.salarioBruto = sB;
	}

	public void setDependentes( int dP) {
		this.dependentes = dP;
	};
	
	public void setHoraExtra( int hE) {
		this.horaExtra = hE;
	};

	public int getValeAlimentacao() {
		return (FP.VALEALIMENTACAO * FP.DIASTRABALHADOS);
	}
	
	public int getSalarioFamilia() {
		return (FP.SALARIOFAMILIA*this.dependentes);
	}
	
	public double getHorasExtras() {
		return ( ((this.salarioBruto / FP.HORASTRABALHADAS)*0.5) * this.horaExtra );
	}
	
	
	public double getInss() {
		double inss = 0;
		
		if(this.salarioBruto <= 1100) {
			inss = this.salarioBruto * 0.075;
		}else if(this.salarioBruto > 1100 && this.salarioBruto <=2203.48) {
			inss = this.salarioBruto * 0.09;
		}else if(this.salarioBruto > 2203.48 && this.salarioBruto <=3305.22) {
			inss = this.salarioBruto * 0.12;
		}else if(this.salarioBruto > 3305.23 && this.salarioBruto <=6433.57) {
			inss = this.salarioBruto * 0.14;
		}else {
			inss = 900.69;
		}
		return inss;
	}
	
	public double getBaseCalculo() {
		return ( this.salarioBruto - this.getInss() - this.getSalarioFamilia() );
	}
	
	public double getImpostoRenda() {
		double ir = 0;
		double bC = this.getBaseCalculo();
		
		if( bC <= 1903.98) {
			ir = 0;
		}else if( bC >= 1903.99 && bC < 2826.65) {
			ir = (bC * 0.075) - 142.80;
		}else if( bC >= 2826.66 &&  bC < 3751.05) {
			ir = ( bC * 0.15) - 354.80;
		}else if( bC > 3751.06 && bC <= 4664.68) {
			ir = ( bC * 0.225) - 636.13;
		}else {
			ir = ( bC * 0.275) - 869.36;
		}
		return ir;
	};
	
	public double getValeTransporte( ) {
		return (this.salarioBruto*0.06);
	};
	
	public double calculaFP() {
		double proventos, descontos;
		
		proventos = ( this.getSalarioFamilia() + this.getValeAlimentacao() + this.getHorasExtras() );
		descontos = ( this.getInss() + this.getImpostoRenda() + this.getValeTransporte() );
		return ( this.salarioBruto + proventos - descontos );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sB;
		int hE, dP;
		
		Scanner entrada = new Scanner(System.in);
		FolhaPagamento funcionario = new FolhaPagamento();
		
		
		System.out.println("Digite o Salário bruto: ");
		sB = entrada.nextDouble();
		System.out.println("Horas extras: ");
		hE = entrada.nextInt();
		System.out.println("Número de dependentes ");
		dP = entrada.nextInt();
		
		funcionario.setSalarioBruto(sB);
		funcionario.setHoraExtra(hE);
		funcionario.setDependentes(dP);
		
		System.out.println("\nProventos:");
		System.out.printf("VA %d\n",funcionario.getValeAlimentacao() );
		System.out.printf("SF %d\n",funcionario.getSalarioFamilia() );
		System.out.printf("HE %.2f\n",funcionario.getHorasExtras() );
		System.out.printf("\n");
		
		System.out.printf("\nDescontos: %.2f\n",funcionario.getBaseCalculo());
		System.out.printf("INSS %.2f\n",funcionario.getInss() );
		System.out.printf("VT %.2f\n",funcionario.getValeTransporte() );
		System.out.printf("IR %.2f\n",funcionario.getImpostoRenda() );
		
		
		System.out.printf("\n\nSalario líquido: %.2f",funcionario.calculaFP());
	}

}
