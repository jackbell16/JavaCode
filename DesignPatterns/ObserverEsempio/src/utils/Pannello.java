package utils;

public class Pannello implements Observer {
	@Override
	public void update() {
		
		System.out.println("Aggiorno il pannello");
	}
}
