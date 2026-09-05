package JavaOOPs.basics.Inheritance;
//hierarechal inheritance sub class 
public class Circle extends Shape1 {
Circle(){
	System.out.println("this is circle class constructor");
}
void area() {
	float result=3.14f*radius*radius;
System.out.println("the area of circle is "+result);
}
}
