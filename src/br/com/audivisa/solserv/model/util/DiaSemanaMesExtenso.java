package br.com.audivisa.solserv.model.util;

public class DiaSemanaMesExtenso {
	
	public static String getMesExtenso(int mes) {
		
		String meses[] = {"JAN", "FEV", "MAR", "ABR",
			      "MAI", "JUN", "JUL", "AGO", "SET", "OUT",
			      "NOV", "DEZ"};
		
		return meses[mes];
		
	}
	
	public static String getDiaSemanaExtenso(int diaSemana) {
		String dias[] = {"DOM","SEG","TER","QUA","QUI","SEX","SAB"};
		
		return dias[diaSemana-1];
	}

}
