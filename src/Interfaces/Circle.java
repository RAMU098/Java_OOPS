 package Interfaces;

public interface Circle {
	float radius=10.34f;
	void area();
	default void perimeter() {//java8 ver
		float res=2*3.14f*radius;
		System.out.println("the rsult is"+res);
	}
static void show() {//java8 ver
System.out.println("this is a static method for circle");	
}
private static void display() {//java 9 version
	System.out.println("this is private method for circle");
}
public static void main(String[] args) {
	display();
}
}
