package Practice_Example;

public class Ecommerce {
String name,email;
Ecommerce(String name,String email){
	this.name=name;
	this.email=email;
}
void display() {
}
}
class Customer extends Ecommerce{
	String Add;
	int oc;
	Customer(String Add,int oc){
		super("Ramu","Nani@gmail.com");
		this.Add=Add;
		this.oc=oc;
	}
	void display() {
		System.out.println(name);
		System.out.println(email);
		System.out.println(Add);
		System.out.println(oc);
	}
}
class Admin extends Ecommerce{
	String Dept;
	int acclev;
	Admin(String dept,int acclev){
		super("nani","nani@gmail.com");
		this.Dept=dept;
		this.acclev=acclev;
	}
	void display() {
		System.out.println(name);
		System.out.println(email);
		System.out.println(Dept);
		System.out.println(acclev);
	}
	}
class Mani{
	public static void main(String[] args) {
		Customer c=new Customer("Chennai",5);
		c.display();
		Admin a=new Admin("BackEnd",8);
		a.display();
	}
}