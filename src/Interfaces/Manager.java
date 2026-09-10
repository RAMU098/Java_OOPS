package Interfaces;

public class Manager implements Employee {
	int ta,da;
	Manager(){
	 ta=200;
	 da=100;
		
		System.out.println("this is a Manager class constructor");
	}

	@Override
	public void display() {
		System.out.println("the empno is"+empno);
		System.out.println("the empsal is"+empsal);

	}

	@Override
	public void calculatesalary() {
		int netsal=ta+da+empsal;
		System.out.println(netsal);

	}

}
