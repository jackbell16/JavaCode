/**
 * Questa classe permette di verificare il corretto funzionamento dell'ereditarietà
 * @author Giacomo
 */
package tests;

import utils.Rettangolo;
import utils.Triangolo;

public class Test01 {
	public static void main(String[] args) {
		float dimRect[] = {2.0f,3.0f,2.0f,3.0f};
		float dimTria[] = {2.0f,3.0f,2.0f};
		Rettangolo rettangolo = new Rettangolo(dimRect);
		Triangolo triangolo = new Triangolo(dimTria);
		System.out.println("L'area del rattangolo vale "+rettangolo.calcolaArea());
		System.out.println("Il periemtro del rettangolo vale "+rettangolo.calcoloPerimetro());
		System.out.println("Il perimetro del triangolo vale "+triangolo.calcoloPerimetro());
		/**
		 * Serve per vedere il corretto funzionameno dell'incapsulamente
		 */
		triangolo.setLati(dimRect);
		rettangolo.setLati(dimTria);
		triangolo.printResultRettangolo();
		triangolo.printResultIsoscele();
	}
}
