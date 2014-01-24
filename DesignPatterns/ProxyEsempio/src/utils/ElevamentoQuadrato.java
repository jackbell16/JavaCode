/**
 * Questa classe ha la responsabilità di calcolare il quadrato di un
 * numero
 * @author Giacomo
 */
package utils;

public class ElevamentoQuadrato implements OperazioneMatematica {
	/**
	 * Questo metodo calcola il quadrato di un numero
	 */
	@Override
	public float calcola(float numero) {
		return  numero*numero;
	}
}
