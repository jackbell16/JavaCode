package utils;

public class Poligono {
	private int numeroDiLati;
	private float dimensioneLati[];
	public Poligono(int numeroDiLati, float[] dimensioneLati) {
		super();
		this.numeroDiLati = numeroDiLati;
		this.dimensioneLati = dimensioneLati;
	}
	public int getNumeroDiLati() {
		return numeroDiLati;
	}
	public void setNumeroDiLati(int numeroDiLati) {
		this.numeroDiLati = numeroDiLati;
	}
	public float[] getDimensioneLati() {
		return dimensioneLati;
	}
	public void setDimensioneLati(float[] dimensioneLati) {
		this.dimensioneLati = dimensioneLati;
	}
	public float calcoloPerimetro(){
		float perimetro = 0;
		for (int i = 0; i < dimensioneLati.length; i++) {
			perimetro = perimetro + dimensioneLati[i];
		}
		return perimetro;
	}
}
