/**
 * QUesta clase sfrutta le ArrayList per inserire persone
 */
package tests;

import java.util.ArrayList;

import utils.Date;
import utils.Person;
import utils.Student;
import utils.Teacher;

public class Test02 {
	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		Person person = new Person("Paolo", "Rossi", new Date(1,1,1990));
		Student student = new Student("Luca", "Verdi", new Date(1,1,2000), 100, 24);
		Teacher teacher = new Teacher("Marco", "Bianchi", new Date(21,12,1980), "Matematica");
		persons.add(person);
		persons.add(student);
		persons.add(teacher);
		for (int i = 0; i <persons.size(); i++) {
			System.out.println(persons.get(i));
		}
	}
}
