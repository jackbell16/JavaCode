/**
 * Questa classe contiene il metodo per risolvere le equazioni lineare del tipo:
 * ax+b=0
 * @author Giacomo
 */
package utils;

public class EquazioneLineare implements Equazione {
	private float a;
	private float b;
	
	public EquazioneLineare(float a, float b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}
	@Override
	public String risolvi() {
		float soluzione = -b/a;
		return "La soluzione dell'equazione lineare "+getA()+"x"+getB()+" e' "+soluzione;
	}
}
