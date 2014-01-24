/**
 * Questa classe ha resposabilità di calcolare il quadrato di un 
 * numero
 * @author Giacomo
 */
package utils;

public class Radice implements OperazioneMatematica {
	/**
	 * Questo metodo calcola la radice quadrata di un numero positivo
	 */
	@Override
	public float calcola(float numero) {
		if(isPositive(numero))
		return (float) Math.sqrt(numero);
		else
			return -1;
	}
	private boolean isPositive(float numero){
		if(numero>=0)
			return true;
		else
			return false;
	}
}
