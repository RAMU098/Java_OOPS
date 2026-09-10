package JavaOOPs.basics.Inheritance;
//method overridden
public class EmployeeRidden {
protected int empid;
protected float empsal;
EmployeeRidden(){
	empid=1001;
	empsal=120.34f;
	System.out.println("this is Super class Employee constructer");
}
void calsal()//overridden method//private methods cannot be over ridden
{
	System.out.println("rhe sal of an employee is"+empsal);
}
}

