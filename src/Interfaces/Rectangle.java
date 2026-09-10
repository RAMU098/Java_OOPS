package Interfaces;

public interface Rectangle {
int len=20,breadth=10;
 void area();
 default void perimeter() {//we can use default keyword only in interface//default is method
	 int res=2*(len+breadth);
	 System.out.println("the res is"+res);
 }
 static void show() {
	 System.out.println("this is static method for rectangle");
 }
 private static void display() {//we can use private for interface
	 System.out.println("this is a private method for rectangle");
 }
 public static void main(String[] args) {
	display();
}
}
