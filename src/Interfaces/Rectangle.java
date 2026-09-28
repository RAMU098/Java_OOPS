 package Interfaces;

public interface Rectangle {
int len=20,breadth=10;
 void area();
 default void perimeter() {//we can use default keyword only in interface//default is method //introduced in java 8 version
	 int res=2*(len+breadth);
	 System.out.println("the res is"+res);
 }
 static void show() {                             //introduced in java 8 version
	 System.out.println("this is static method for rectangle");
 }
 private static void display() {//we can use private for interface//introduced in java 9 version
	 System.out.println("this is a private method for rectangle");
 }
 public static void main(String[] args) {
	display();
}
}
