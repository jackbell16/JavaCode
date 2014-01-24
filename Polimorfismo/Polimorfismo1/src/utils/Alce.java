
package utils;

public class Alce extends EssereVivente implements Animale {
	public Alce(String nome) {
		super(nome);
		
	}
	@Override
	public void emetteVerso() {
		System.out.println("Alce "+nome+" bramisce");
	}
}
