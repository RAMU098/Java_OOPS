package Abstract;

public class Rectangle extends Shape {
Rectangle(){
	System.out.println("this is rectangle sub class constructor:");
}
	@Override
	void area() {  
		int res=len*breadth;
		System.out.println("the res value is "+res);

	}
	void perimeter() {
		int res=2*(len*breadth);
		System.out.println("the value of perimeter is"+res);
	}
}
