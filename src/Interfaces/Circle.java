package Interfaces;

public interface Circle {
	float radius=10.34f;
	void area();
	default void perimeter() {
		float res=2*3.14f*radius;
		System.out.println("the rsult is"+res);
	}
static void show() {
System.out.println("this is a static method for circle");	
}
private static void display() {
	System.out.println("this is private method for circle");
}
public static void main(String[] args) {
	display();
}
}
