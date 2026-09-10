package JavaOOPs.basics.Inheritance;
//overloading
public class Department {
private double sal;
Department(){
	sal=100000;
	System.out.println("this  is the department class constructor:");
}
void total() {
double res=sal;
System.out.println("the total is:"+sal);
}
int total(int ta,int da) {
	int res=ta+da;
	return res;
}
void total(double sal,double ta,double da) {
	double res=sal+ta+da;
	System.out.println("the total is"+res);
}
}