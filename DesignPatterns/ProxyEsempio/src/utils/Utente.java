/**
 * Questa classe rappresenta il Client del design pattern Proxy.
 * Il test serve per verificare il corretto funzionamento della classe
 * {@link ProxyOperazioneMatematica}
 * @author Giacomo
 */
package utils;

public class Utente {
	public static void main(String[] args) {
		ProxyOperazioneMatematica matematica = new ProxyOperazioneMatematica(0);
		System.out.println(matematica.calcola(100));
		matematica.setID(1);
		System.out.println(matematica.calcola(10));
	}
}
