package JavaOOPs.basics.Inheritance;

public class Shape {
protected int length;
protected int breadth;
Shape(){//super non parameterized constructor
	 length=5;
	 breadth=6;
	 System.out.println("super class non parameterized con");
}
Shape(int a,int b){
	length=a;
	breadth=b;
	System.out.println("super class parameterized con");
}
void display() {//void is a method
	System.out.println("the value of length:"+length);
	System.out.println("the value of breadth:"+breadth);
}
}
