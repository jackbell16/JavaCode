/**
 * Questa classe permette di creare dei rettangoli e calcolare l'area di quest'ultimi. 
 */
package utils;

public class Rettangolo extends Poligono {
	private float lato1;
	private float lato2;
	private float lato3;
	private float lato4;
	private static int numeroDiLati = 4;
	public Rettangolo(float dimensioneLati[]) {
		super(numeroDiLati, dimensioneLati);
		setLati(getDimensioneLati());
	}
	public void setLati(float[] dimenensioneLati){
		if(dimenensioneLati.length==numeroDiLati){
			lato1 = dimenensioneLati[0];
			lato2 = dimenensioneLati[1];
			lato3 = dimenensioneLati[2];
			lato4 = dimenensioneLati[3];
		}else{
			System.err.println("I dati non sono stati inseriti correttamente");
		}
	}	
	public float calcolaArea(){
		return lato1*lato2*lato3*lato4;
	}
}
