/**
 * Questo test ha lo scopo di verifica il corretto funzionamento del polimofrismo
 */
package tests;

import utils.Alce;
import utils.Cane;
import utils.Gatto;
import utils.Mucca;

public class Tests01 {
	public static void main(String[] args) {
		Alce alce = new Alce("Alce");
		Cane cane = new Cane("Tobia");
		Gatto gatto = new Gatto("Fuffi");
		Mucca mucca = new Mucca("Milk");
		alce.emetteVerso();
		cane.emetteVerso();
		gatto.emetteVerso();
		mucca.emetteVerso();
	}
}
