import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Idade{
	int grupo, idade;
	
	public Idade(int Idade) {
		this.idade = Idade;
		
		if(this.idade >= 0 && this.idade <=19) {
		this.grupo =1;
	} else if( this.idade >= 20 && this.idade <=39) {
		this.grupo =2;
	} else if( this.idade >= 40 && this.idade <=59) {
		this.grupo =3;
	} else if( this.idade >= 60 && this.idade <=79) {
		this.grupo =4;
	} else {
		this.grupo =5;
	}
	}

	
public int getIdade() {
		return idade;
	}

public void setIdade(int idade) {
		this.idade = idade;
	}

public int getGrupo() {
	return grupo;
}


public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	
	Idade[] idades = new Idade[10]; 
	ArrayList<Integer>  vetor = new ArrayList<Integer>();
    int p;
    
	for(int i=0; i < 10; i++) {
		System.out.println("Digite a idade"+i+": ");
		p = entrada.nextInt();
		idades[i]= new Idade(p);
		vetor.add(idades[i].getGrupo());
	}
	
	System.out.println("Total grupo1: "+ Collections.frequency(vetor, 1));
	System.out.println("Total grupo2: "+ Collections.frequency(vetor, 2));
	System.out.println("Total grupo3: "+ Collections.frequency(vetor, 3));
	System.out.println("Total grupo4: "+ Collections.frequency(vetor, 4));
	System.out.println("Total grupo5: "+ Collections.frequency(vetor, 5));
	
}
}




