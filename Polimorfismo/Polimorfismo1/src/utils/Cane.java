package utils;

public class Cane extends EssereVivente implements Animale {
	public Cane(String nome) {
		super(nome);
	}
	@Override
	public void emetteVerso() {
		System.out.println("Il cane "+nome+" abbaia");
	}
}
