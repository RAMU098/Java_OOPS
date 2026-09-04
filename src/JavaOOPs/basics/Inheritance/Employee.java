package JavaOOPs.basics.Inheritance;
//for single inheritance ex
public class Employee {
protected int empno;//super class variables
protected float empsal;
Employee(){//super class constructor
//Employee(int e1,float f1){//for parameterize constructor it will give an error
	empno=1001;//for non-parametarized constructor and default constructor it will be executed 
	empsal=10000.90f;
	System.out.println("this is employee class non parameterized constructor");
}
Employee(int e1,float f1){//for parameterize constructor it will give an error
	empno=e1;
	empsal=f1;
	System.out.println("this is parameterized constructor");
}
void display() {
	System.out.println("the value of empno is"+empno);
	System.out.println("the value of empsal is"+empsal);
}
}
