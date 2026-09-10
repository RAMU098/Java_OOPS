package JavaOOPs.basics.Inheritance;
//method over loading main 
public class Shape_main {
	public static void main(String[] args) {
		Shape2 s1=new Shape2();
		s1.area();
		int res=s1.area(10,20);
		System.out.println("the value of rectangle:"+res);
		s1.area(5.4f);
	}

}
