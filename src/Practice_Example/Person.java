package Practice_Example;

public class Person {
String name;
Person(String name){
	this.name=name;
}
void display() {
}
}
class Employee extends Person{
	int Empid,salary;
	Employee(int empid,int salary){
		super("Ramu");
		this.Empid=empid;
		this.salary=salary;
	}
	void display() {
	//	System.out.println(name);
	}
}
class Developer extends Employee{
	String pl;
	int exp;
	Developer(String pl,int exp){
		super(123,300000);
		this.pl=pl;
		this.exp=exp;
	}
	void display() {
		System.out.println(Empid);
		System.out.println(salary);
		System.out.println(name);
		System.out.println(pl);
		System.out.println(exp);
	}
}
class Raju{
	public static void main(String[] args) {
		Developer d=new Developer("java",3);
	
		//Employee e=new Employee(123,30000);
		//e.display();
		d.display();
	}
}