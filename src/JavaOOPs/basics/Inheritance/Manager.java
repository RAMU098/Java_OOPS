package JavaOOPs.basics.Inheritance;
//for single inheritance ex
public class Manager extends Employee {
protected float ta,da;
Manager(){
	ta=1200.0f;//the object will call non parameterized constructor of sub class,it will called non parameterized constructor in super class
	
	da=1000.0f;
	System.out.println("this is sub class manager non parameterized  constructor");
}
Manager(float f1,float f2){
	//for calling parameterized constructor in super class  we will use super in sub class 
	super(123,345.45f);//calling a super class parameterized constructor
//without super keyword it will call non parameteterized constructor in super class for parameterized constructor
	//the object will call  parameterized constructor of sub class ,it will take same non parameterized constructor in super class
	ta=1200.0f;
	da=1000.0f;
	System.out.println("this is sub class of manager parameterized constructor ");
}
void calculateSalary() {
	float netsal=empsal+ta+da;
	System.out.println("the net sal value is"+netsal);
}

	//public static void main(String[] args) {
	//Manager m1=new Manager();//sub class object
	//m1.display();//calling super class method from employee
	//m1.calculateSalary();//subclass method
	//}
}