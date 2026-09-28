package Practice_Example;

public class Staff {
String name;int age;
Staff(String name,int age){
	this.name=name;
	this.age=age;
}
void display() {
}
}
class Doctor extends Staff{
	String spec;
	Doctor(String spec){
		super("Ramu",35);
		this.spec=spec;
	}
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(spec);
	}
}
class Nurse extends Staff{
	String shift;
	Nurse(String shift){
		super("Nani",30);
		this.shift=shift;
	}
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(shift);
	}
}
class Mahi{
	public static void main(String[] args) {
		Doctor d=new Doctor("MBBS");
		d.display();
		Nurse n=new Nurse("Day");
		n.display();
	}
}