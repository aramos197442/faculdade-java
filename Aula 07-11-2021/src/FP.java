interface FP {
		final int SALARIOFAMILIA = 256;
		final int DIASTRABALHADOS = 30;
		final int VALEALIMENTACAO = 40;
		final double VALETRANSPORTE = 0.06;
		final int HORASTRABALHADAS = 220;
		
		public void setSalarioBruto( double sB);		
		public void setDependentes( int dP);
		public void setHoraExtra( int hE);
		public int getValeAlimentacao();
		public int getSalarioFamilia();
		public double getHorasExtras();
		public double getInss();
		public double getBaseCalculo();
		public double getImpostoRenda();
		public double getValeTransporte();
		public double calculaFP();
		
};
