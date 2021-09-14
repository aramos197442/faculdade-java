import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Datas {
	private Calendar dataInicial, dataFinal;
	
	private Datas(Calendar dataInicial, Calendar dataFinal) {
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	private double calcula() {
		
		return (dataFinal.get(Calendar.YEAR) * 365.25 + dataFinal.get(Calendar.MONTH)*30 + dataFinal.get(Calendar.DAY_OF_MONTH)) - (dataInicial.get(Calendar.YEAR) * 365.25 + dataInicial.get(Calendar.MONTH)*30 + dataInicial.get(Calendar.DAY_OF_MONTH));
	}

	public static void main(String[] args) throws ParseException {
		// Pegar duas datas e calcular a diferença delas em dias, horas, minutos e segundos usando a classe Calendar

		String dataInicial, dataFinal; 
		double difHoras, difMinutos, difSegundos, difDias;
		Date date;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar data1 = Calendar.getInstance();
		Calendar data2 = Calendar.getInstance();
		
		dataInicial = JOptionPane.showInputDialog("Digite uma data inicial");
		date = sdf.parse(dataInicial);
		data1.setTime(date);
		
		dataFinal = JOptionPane.showInputDialog("Agora digite uma data final:");
		date = sdf.parse(dataFinal);
		data2.setTime(date);
		
		Datas datas = new Datas(data1, data2);
		
		difDias = datas.calcula();
		difHoras = difDias * 24;
		difMinutos = difHoras * 60;
		difSegundos = difMinutos * 60;
		
 		
		JOptionPane.showMessageDialog(null, "Diferença em dias -> " + difDias);
		JOptionPane.showMessageDialog(null, "Diferença em horas -> " + difHoras);
		JOptionPane.showMessageDialog(null, "Diferença em minutos -> " + difMinutos);
		JOptionPane.showMessageDialog(null, "Diferença em segundos -> " + difSegundos);

    
	}

}
