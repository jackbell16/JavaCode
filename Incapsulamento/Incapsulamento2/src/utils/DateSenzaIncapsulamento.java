/**
 * Questa classe non sfrutta l'incapusalemtno. Dunque non è possibile effettuare controlli sull'inserimento di dati.
 * @author Giacomo
 */
package utils;

public class DateSenzaIncapsulamento {
	public int year;
	public int month;
	public int day;
	public DateSenzaIncapsulamento(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	@Override
	public String toString(){
		return day+"-"+month+"-"+year;
	}
	public static void main(String[] args) {
		DateSenzaIncapsulamento dateSenzaIncapsulamento = new DateSenzaIncapsulamento(2013, 9, 31);
		System.out.println(dateSenzaIncapsulamento);
	}
}
