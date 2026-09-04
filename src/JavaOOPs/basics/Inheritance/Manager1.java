package JavaOOPs.basics.Inheritance;
	public class Manager1 extends Employee1 {
	protected float ta,da;
	Manager1(){
		ta=1200.0f;//the object will call non parameterized constructor of sub class,it will called non parameterized constructor in super class
		
		da=1000.0f;
		System.out.println("this is sub class manager non parameterized  constructor");
	}
	//Manager1(float f1,float f2){
 
		//super(123,345.45f);
		//ta=1200.0f;
		//da=1000.0f;
		//System.out.println("this is sub class of manager parameterized constructor ");
	//}
	void calculateSalary() {
		float netsal=empsal+ta+da;
		System.out.println("the net sal value is"+netsal);
	}

		public static void main(String[] args) {
		Manager1 m1=new Manager1();//sub class object
		m1.display();//calling super class method from employee
		m1.calculateSalary();//subclass method
		}
	}

