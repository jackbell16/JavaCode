/**
 * Questo programma calcola la somma di due numeri
 * @author Giacomo Bellazzi
 *
 */
public class DueNumeri {
	private int a;
	private int b;
	public DueNumeri(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int calcolaSomma(){
		return a+b;
	}
	public void stampaSomma(){
		System.out.println(calcolaSomma());
	}
	public static void main(String[] args) {
		DueNumeri primoNumero = new DueNumeri(10, 5);
		DueNumeri secondoNumero = new DueNumeri(16, 20);
		primoNumero.stampaSomma();
		secondoNumero.stampaSomma();
	}
}
