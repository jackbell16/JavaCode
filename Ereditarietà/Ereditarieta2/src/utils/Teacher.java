/**
 * Questa classe è figlia di Persona, dal momento che rispetta il legame "is a".
 * @author Giacomo
 */
package utils;

public class Teacher extends Person {
	private String nomeCorsoTitolare;
	public Teacher(String name, String surname, Date birth,
			String nomeCorsoTitolare) {
		super(name, surname, birth);
		this.nomeCorsoTitolare = nomeCorsoTitolare;
	}
	public String getNomeCorsoTitolare() {
		return nomeCorsoTitolare;
	}
	public void setNomeCorsoTitolare(String nomeCorsoTitolare) {
		this.nomeCorsoTitolare = nomeCorsoTitolare;
	}
	@Override
	public String toString(){
		return "Nome: "+getName()+" Cognome: "+getSurname()+" Titolare del corso di "+getNomeCorsoTitolare()+" Nato il: "+getBirth();
	}
}
