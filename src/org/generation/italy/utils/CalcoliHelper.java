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
		if(a > 0) {
			return a;
		} else {
			return -a;
		}
	}
	
	public static double asb(double a) {
		if(a > 0) {
			return a;
		} else {
			return -a;
		}
	}
	
	// metodi per il minimo
	public static int minimo(int a, int b) {
		if(a > b) {
			return b;
		} else {
			return a;
		}
	}
	
	public static double minimo(double a, double b) {
		if(a > b) {
			return b;
		} else {
			return a;
		}
	}
	
	// metodi per il massimo
	public static int massimo(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static double massimo(double a, double b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	
	// bonus metodo elevamento a potenza
	public static int potenza(int a, int b) {
		int potenza = 1;
		if(b > 0) {
			for(int i = 1; i <= b; i++) {
				potenza = potenza * a;
			}
		} else if(a == 0) {
			potenza = 0;
		} else if(b == 0) {
			potenza = 1; 
		} else {
			System.out.println("ERRORE: il risultato deve essere un intero.");
		}
		return potenza;
		
	}
}
