/**
 * Questa classe permette di testare il corretto funzionamento del principio di ereditarietà. 
 */
package tests;

import utils.Date;
import utils.Person;
import utils.Student;
import utils.Teacher;

public class Test01 {
	public static void main(String[] args) {
		Date today = new Date(4, 12, 2013);
		Person person = new Person("Paolo", "Rossi", new Date(1,1,1990));
		System.out.println(person);
		System.out.println(person.getAge(today));
		Student student = new Student("Luca", "Verdi", new Date(1,1,2000), 100, 24);
		System.out.println(student);
		System.out.println(student.getAge(today));
		Teacher teacher = new Teacher("Marco", "Bianchi", new Date(21,12,1980), "Matematica");
		System.out.println(teacher);
		System.out.println(teacher.getAge(today));
	}
}
