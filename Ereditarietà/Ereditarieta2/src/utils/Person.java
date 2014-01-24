/**
 * Questa classe Padre ha il metodo getAge, che viene sfruttato in altre classi.
 * @author Giacomo
 */
package utils;

public class Person {
	private String name;
	private String surname;
	Date birth;
	public Person(String name, String surname, Date birth) {
		super();
		this.name = name;
		this.surname = surname;
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public int getAge(Date date){
		if((date.getMonth()>=birth.getMonth() && date.getDay()>=birth.getDay()) || date.getMonth()>birth.getMonth()){
			return date.getYear()-birth.getYear();
		}else{
			return date.getYear()-birth.getYear()-1;
		}
	}
	@Override
	public String toString(){
		return "Nome: "+getName()+" Cognome: "+getSurname()+" Nato il: "+getBirth();
	}
}
