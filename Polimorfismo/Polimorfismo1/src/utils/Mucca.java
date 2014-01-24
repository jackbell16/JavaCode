package utils;

public class Mucca extends EssereVivente implements Animale {
	public Mucca(String nome) {
		super(nome);
	}
	@Override
	public void emetteVerso() {
		System.out.println("La mucca "+nome+" muggisce");
	}
}
