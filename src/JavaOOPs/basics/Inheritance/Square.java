package JavaOOPs.basics.Inheritance;

public class Square extends Shape1 {
	Square(){
		System.out.println("this is square class contructor");
	}
	void area() {
		int result=side*side;
		System.out.println("this value of area of square is"+result);
	}

}
