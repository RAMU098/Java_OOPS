package JavaOOPs.basics.Inheritance;
//hierarechal inheritance super class//in this one super class gives properties to multiple sub class
public class Shape1 {
	protected int len,breadth,side;
	protected float radius;
	Shape1(){
		len=10;
		breadth=20;
		side=20;
		radius=20.0f;
		System.out.println(" this is Super class Shape constructor");
	}

	void display() {
		System.out.println("the value of len is"+len);
		System.out.println("the value of breadth is"+breadth);
		System.out.println("the value of side is"+side);
		System.out.println("the value of radius is"+radius);
	}
}
