/**
 * Questa classe permette di stabilire quale richiesta viene
 * fatta dalla classe {@link Utente}
 * @author Giacomo
 */
package utils;

public class ProxyOperazioneMatematica implements OperazioneMatematica {
	private Radice radice = new Radice();
	private ElevamentoQuadrato elevamentoQuadrato = new ElevamentoQuadrato();
	private static int radiceID = 0;
	private static int ElevamentotoQuadratoID  = 1;
	private int ID;
	public ProxyOperazioneMatematica(int iD) {
		super();
		ID = iD;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public float calcola(float numero) {
		float risultato = 0;
		if(getID()==radiceID){
			risultato = radice.calcola(numero);
		}else if(getID()==ElevamentotoQuadratoID){
			risultato = elevamentoQuadrato.calcola(numero);
		}
		return risultato;
	}	
}
