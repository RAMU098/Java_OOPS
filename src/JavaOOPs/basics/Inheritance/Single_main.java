package JavaOOPs.basics.Inheritance;
//for single inheritance
public class Single_main {

	public static void main(String[] args) {
	Manager m1=new Manager();//sub class object
	m1.display();//calling super class method from employee
	m1.calculateSalary();//subclass method
	Manager m2=new Manager(1100,1400.0f);//subclass for parameterized
	m2.display();
	m2.calculateSalary();
	}

}
// the object will call non parameterized constructor of sub class,it will called non parameterized constructor in super class
//the object will call  parameterized constructor of sub class ,it will take same non parameterized constructor in super class