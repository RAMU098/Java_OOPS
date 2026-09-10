package JavaOOPs.basics.Inheritance;

public class Department_Main {
public static void main(String[] args) {
	Department d1=new Department();
	d1.total();
	int res=d1.total(40,50);
	d1.total(10000,20,50);
	System.out.println("the total is:"+res);
}
}
