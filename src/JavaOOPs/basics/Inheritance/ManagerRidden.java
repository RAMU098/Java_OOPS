package JavaOOPs.basics.Inheritance;

public class ManagerRidden extends EmployeeRidden {
	protected float ta,da;
	ManagerRidden(){
		ta=1000.34f;
	da=2000.34f;
	System.out.println("this is the sub class manager constructor");
	}
	@Override//this is annotation to tell the compiler we are overriding the method,it is optional
	void calsal() {//overriding//we will add default it will be decrease visibility
		float res=empsal+ta+da;
		System.out.println("the employee netsal is"+res);
	}

}
