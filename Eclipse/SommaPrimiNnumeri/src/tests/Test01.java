/**
 * Questo test permette di testare la classe SommaPrimiNnumeri
 * @author Giacomo
 */
package tests;
import utils.SommaPrimiNnumeri;

public class Test01 {
	public static void main(String[] args) {
		SommaPrimiNnumeri nnumeri = new SommaPrimiNnumeri();
		nnumeri.setN(10);
		System.out.println("La somma dei primi "+nnumeri.getN()+" numeri vale "+nnumeri.calcolaSomma());
		
	}
}
