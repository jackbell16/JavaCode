/**
 * Questo test ha lo scopo di verificare il corretto funzionamento della classe Fattoria
 */
package tests;

import utils.Alce;
import utils.Cane;
import utils.Fattoria;
import utils.Gatto;
import utils.Mucca;

public class Tests02 {
	public static void main(String[] args) {
		Alce alce = new Alce("Alce");
		Cane cane = new Cane("Tobia");
		Gatto gatto = new Gatto("Fuffi");
		Mucca mucca = new Mucca("Milk");
		Fattoria fattoria = new Fattoria();
		fattoria.aggiungiAnimale(mucca);
		fattoria.aggiungiAnimale(gatto);
		fattoria.aggiungiAnimale(cane);
		fattoria.aggiungiAnimale(alce);
		fattoria.mostraAnimali();
	}
}
