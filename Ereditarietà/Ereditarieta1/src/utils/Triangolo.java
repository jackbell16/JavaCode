/**
 * Questa classe permette di creare dei triangolo e stabilire "in modo grossolano" 
 * se un triangolo è rettangolo.
 * @author Giacomo
 */
package utils;

public class Triangolo extends Poligono {
	private float lato1;
	private float lato2;
	private float lato3;
	private static int numeroDiLati = 3;
	public Triangolo(float[] dimensioneLati) {
		super(numeroDiLati, dimensioneLati);
		setLati(getDimensioneLati());
	}
	public void setLati(float[] dimenensioneLati){
		if(dimenensioneLati.length==numeroDiLati){
			lato1 = dimenensioneLati[0];
			lato2 = dimenensioneLati[1];
			lato3 = dimenensioneLati[2];
		}else{
			System.err.println("I dati non sono stati inseriti correttamente");
		}
	}
	public boolean isRettangolo(){
		if(lato3*lato3==lato1*lato1+lato2*lato2){
			return true;
		}else{
			return false;
		}
	}
	public void printResultRettangolo(){
		if(isRettangolo()){
			System.out.println("Il triangolo è rettangolo");
		}else{
			System.out.println("il triangolo non è rettangolo");
		}
	}
	public boolean isIsoscele(){
		if(lato1==lato2 || lato1==lato3 || lato2==lato3){
			return true;
		}else{
			return false;
		}
	}
	public void printResultIsoscele(){
		if(isIsoscele()){
			System.out.println("Il triangolo è isoscele");
		}else{
			System.out.println("il triangolo non è isoscele");
		}
	}
}
