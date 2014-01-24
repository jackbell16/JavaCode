/**
 * Questa test vuole mostrare il funzionamento del polimorfismo
 * @author Giacomo
 */
package tests;

import utils.EquazioneLineare;
import utils.EquazioneSecondoGrado;

public class Tests01 {
	public static void main(String[] args) {
		EquazioneLineare equazioneLineare = new EquazioneLineare(10, 10);
		System.out.println(equazioneLineare.risolvi());
		EquazioneSecondoGrado equazioneSecondoGrado = new EquazioneSecondoGrado(1, 2, 0);
		System.out.println(equazioneSecondoGrado.risolvi());
	}
}
