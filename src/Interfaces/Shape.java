package Interfaces;

public class Shape implements Rectangle, Circle {
	@Override
	public void area() {//public is a access modifier
		int res1=len*breadth;
		float res2=3.14f*radius*radius;
		System.out.println("the result1 is"+res1);
		System.out.println("the result2 is"+res2);
	}
	@Override
public void perimeter() {//public is a access modifier
	Rectangle.super.perimeter();
	Circle.super.perimeter();
}
	//public void show() {
	
		
	//}
}
