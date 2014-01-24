/**
 * Questa classe è figlia di Persona, dal momento che rispetta il legame "is a".
 * Attraverso l'ereditarietà non è stato necessario ricopiare il metodo getAge(). 
 * @author Giacomo
 */
package utils;

public class Student extends Person {
	private int matricola;
	private int mediaVoti;
	public Student(String name, String surname, Date birth, int matricola,
			int mediaVoti) {
		super(name, surname, birth);
		this.matricola = matricola;
		this.mediaVoti = mediaVoti;
	}
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	public int getMediaVoti() {
		return mediaVoti;
	}
	public void setMediaVoti(int mediaVoti) {
		this.mediaVoti = mediaVoti;
	}
	@Override
	public String toString(){
		return "Nome: "+getName()+" Cognome: "+getSurname()+" Matricola: "+getMatricola()+" Nato il: "+getBirth()+" Media voti: "+getMediaVoti();
	}
}
