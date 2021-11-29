package org.generation.italy.utils;

public class Bonus {

	private Bonus() {
		
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
	

