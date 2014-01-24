/**
 * Questa classe contiene il metodo per risolvere le equazione di secondo grado. 
 * Attualemente funziona correttamente solo quando il delta è maggiore o uguale a zero
 * @author Giacomo
 */
package utils;

public class EquazioneSecondoGrado implements Equazione {
	private float a,b,c;

	public EquazioneSecondoGrado(float a, float b, float c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
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
	public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c = c;
	}
	@Override
	public String risolvi() {
		float delta = getB()*getB()-4*getA()*getC();
		float primaSoluzione=(float) ((-getB()+Math.sqrt(delta))/(2*getA()));
		float secondaSoluzione= (float) ((-getB()-Math.sqrt(delta))/(2*getA()));
		return "Le soluzione dell'equazioni di secondo grado "+getA()+"x^2"+getB()+"x"+getC()+" sono "+primaSoluzione+" e "+secondaSoluzione;
	}
}
