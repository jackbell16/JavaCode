/**
 * Questa classe permette di mostare il funzionamento del principio di incapsulamento.
 *  L'inserimento dell'altezza di una persona ha bisogna di qualche controllo, che non
 *  sarebbe possibili qualora gli attributi venissero lasciati public
 *  @author Giacomo
 */
package utils;

public class Persona {
	private String nome;
	private String cognome;
	private int altezza;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		if(altezza>=0){
			this.altezza = altezza;
		}else{
			System.err.println("Attenzione, il valore dell'altezza e' negativo !");
		}
	}
	@Override
	public String toString(){
		return "Nome: "+getNome()+" Cognome: "+getCognome()+" Altezza: "+getAltezza()+" cm";
	}
}
