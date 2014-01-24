/**
 * Questa classe permette di effettuare un test per 
 * la verifica dei vantaggi introdotti dall'incapsulamento
 */
package tests;

import utils.Persona;

public class Test01 {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.setNome("Paolo");
		persona1.setCognome("Rossi");
		persona1.setAltezza(-180);
		System.out.println(persona1.toString());
		persona1.setAltezza(180);
		System.out.println(persona1.toString());
	}
}
