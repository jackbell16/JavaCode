package utils;

public class Gatto extends EssereVivente implements Animale {
	public Gatto(String nome) {
		super(nome);
		
	}
	@Override
	public void emetteVerso() {
		System.out.println("Il gatto "+nome+" mioagola");
		
	}
}
