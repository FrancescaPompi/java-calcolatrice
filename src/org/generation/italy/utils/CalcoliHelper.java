package org.generation.italy.utils;

public class CalcoliHelper {
	
	// costruttore privato
	private CalcoliHelper() {
		
	}
	
	// Applico l'overload dei metodi per avere nella stessa classe metodi con lo stesso nome, ma tipi di parametro diversi. Ovvero si tratta di polimorfismo.
	
	// metodi per la somma
	public static int somma(int a, int b) {
		int somma = a + b;
		return somma;
	}
	
	public static double somma(double a, double b) {
		double somma = a + b;
		return somma;
	}
	
	// metodi per la differenza
	public static int differenza(int a, int b) {
		int differenza = a - b;
		return differenza;
	}
	
	public static double differenza(double a, double b) {
		double differenza = a - b;
		return differenza;
	}
	
	// metodi per moltiplicazione
	public static int moltiplicazione(int a, int b) {
		int moltiplicazione = a * b;
		return moltiplicazione;
	}
	
	public static double moltiplicazione(double a, double b) {
		double moltiplicazione = a * b;
		return moltiplicazione;
	}
	
	// metodi per il valore assoluto
	public static int abs(int a) {
		int valoreAssoluto = Math.abs(a);
		return valoreAssoluto;
	}
	
	public static double asb(double a) {
		double valoreAssoluto = Math.abs(a);
		return valoreAssoluto;
	}
	
	// metodi per il minimo
	public static int minimo(int a, int b) {
		int minimo = Math.min(a, b);
		return minimo;
	}
	
	public static double minimo(double a, double b) {
		double minimo = Math.min(a, b);
		return minimo;
	}
	
	// metodi per il massimo
	public static int massimo(int a, int b) {
		int massimo = Math.max(a, b);
		return massimo;
	}
	
	public static double massimo(double a, double b) {
		double massimo = Math.max(a, b);
		return massimo;
	}
}
