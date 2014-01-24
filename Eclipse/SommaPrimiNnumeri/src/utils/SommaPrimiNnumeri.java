/**
 * Questa classe permette di calcolare la somma dei primi N numeri
 * @author Giacomo
 */
package utils;

public class SommaPrimiNnumeri {
	private static int somma = 0;
	private int N;
	public SommaPrimiNnumeri() {
		super();
	}
	public int getN() {
		return N;
	}
	public void setN(int n) {
		if(n>0){
			N = n;
		}else{
			System.out.println("Il valore di N inserito non e' valido");
		}
	}
	public int calcolaSomma(){
		for (int i = 0; i <= getN(); i++) {
			somma = somma +i;
		}
		return somma;
	}
}
