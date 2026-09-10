package Interfaces;

public class Interface_main {
	public static void main(String[] args) {
		Manager m1=new Manager();
		m1.display();
		m1.calculatesalary();
		Employee e1;
		e1=m1;
		e1.display();
		e1.calculatesalary();
	}

}
