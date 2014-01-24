/**
 * Questo programma stampa a video un messaggio, usando i concetti di classe, oggetto, metodo
 * @author Giacomo Bellazzi
 *
 */
public class HelloWorld {
	private String messaggio;
	
	public HelloWorld(String messaggio) {
		super();
		this.messaggio = messaggio;
	}
	public String getMessaggio() {
		return messaggio;
	}
	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}
	public void toPrint(){
		System.out.println(getMessaggio());
	}
	
	public static void main(String[] args) {
		HelloWorld messaggio = new HelloWorld("Ciao Mondo");
		messaggio.toPrint();
		HelloWorld messaggio1 = new HelloWorld("Hello World");
		messaggio1.toPrint();
	}
}
