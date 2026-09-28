package Abstract;

public abstract class Employee {
int empid;
String empname;
public Employee(int empid,String empname) {
	this.empid=empid;
	this.empname=empname;
}
//concrate method
public void display() {
	System.out.println("employee id:"+empid);
	System.out.println("employee name:"+empname);
}
public abstract void calsal();
}
class Developer extends Employee{
	double sal;
	public Developer(int empid,String empname,double sal) {
		super( empid,empname);
		this.sal=sal;
	}
	@Override
	public void calsal() {
		double res=sal+2000;
		System.out.println("D sal:"+res);
	}
}
class Tester extends Employee{
	double sal;
	public Tester(int empid,String empname,double sal) {
		super(empid,empname);
		this.sal=sal;
	}
	public void calsal() {
		double res=sal+1000;
		System.out.println("t sal:"+res);
	}
}
class Main{
	public static void main(String[] args) {
		Employee e=new Developer(123, "ramu", 5000);
		Employee e1=new Tester(234,"nani",4000);
		e.display();
		e.calsal();
		e1.display();
		e1.calsal();
	}
}
