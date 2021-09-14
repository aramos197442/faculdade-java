import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Martins
 */
public class Carro {

    final int ANOATUAL= Calendar.getInstance().get(Calendar.YEAR);
    
    private String modelo, fabricacao;
    private int ano,diferenca,categoria;
    private double valor,valorAtual;
   
   
    
    public Carro(){

    }

    public double calcula() {
        this.diferenca = ANOATUAL - ano;
        if (categoria == 1){
            this.valorAtual = valor * Math.pow(0.95, diferenca );
          } else if (categoria == 2){
            this.valorAtual = valor * Math.pow(0.93, diferenca );
        }     

        return valorAtual; 
    }
    

	public void setModelo (String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }
    
    public String getFabricacao() {
        return fabricacao;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getAno() {
        return ano;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
    
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    public int getCategoria() {
        return categoria;
    }
    
    public static void main(String[] args) {
      // final int ANOATUAL=Calendar.YEAR;
       Scanner entrada=new Scanner (System.in);
      
       Carro carro = new Carro();
        System.out.println("Modelo: ");
        carro.setModelo(entrada.next());
        
        System.out.println("Fabricante: ");
        carro.setFabricacao(entrada.next());
        
        System.out.println("Categoria (1-Utilitário ou 2-Carro): ");
        carro.setCategoria(entrada.nextInt());
        
        System.out.println("Ano: ");
        carro.setAno(entrada.nextInt());
        
        System.out.println("Valor: ");
        carro.setValor(entrada.nextDouble());
      
        System.out.printf("Valor corrigido: %.2f",carro.calcula());
        
     
}
    
}