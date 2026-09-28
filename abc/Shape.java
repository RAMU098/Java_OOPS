package Abstract;

public abstract class Shape {//abstract class
protected int len,breadth;
Shape(){//abstract class constructor
	len=10;
	breadth=20;
	System.out.println("This id abstract class constructor:");
}
void display() {//concrete method
	System.out.println("the value of length is"+len);
	System.out.println("the value of breadth is"+breadth);
}
abstract void area();//abstract class   ;it will not contain private access modifier ;we can not using static also
}
