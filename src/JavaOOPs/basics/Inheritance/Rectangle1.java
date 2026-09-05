
package JavaOOPs.basics.Inheritance;
//hierarechal inheritance sub class
public class Rectangle1 extends Shape1 {
Rectangle1(){
	System.out.println("this is rectangle class constructor");
}
void area() {
	int result=len*breadth;
	System.out.println("the area of retangle1 is"+result);
}
}
