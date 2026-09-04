package JavaOOPs.basics.Inheritance;
//single inhertance
public class Rectangle extends Shape {
int length1;int breadth1;
	Rectangle(){
		length1=6;
		breadth1=5;
		System.out.println("sub class non parameterized:");
}
	Rectangle(int l1,int b1){
		super(4,7);
		length1=l1;
		breadth1=b1;
		System.out.println("sub class parameterized constructor:");
	}
	void area() {
		int area=length*breadth;
		int area1=length1*breadth1;
	System.out.println("the area of super class:"+area);
	System.out.println("the area of sub class:"+area1);
	}

public static void main(String[]args) {
	Rectangle r1=new Rectangle();
	r1.display();
	r1.area();
	Rectangle r2=new Rectangle(5,6);
	r2.display();
	r2.area();
	
}
}