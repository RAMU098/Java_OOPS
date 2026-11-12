package Java8Features;

public interface MyInterface {
	public static void staticMethod() {
		System.out.println("Static Method");
	}
	//public void mat() {//instance method didnot allow the intefaces
		
	//}
	default void display() {
		System.out.println("default method");
	}

}

class StaticInstanceMethod implements MyInterface{
      public static void display1() {
		System.out.println("Static method with in class");
	}
	public void instancedisplay() {
		System.out.println("instance method using object");
	}
	public static void main(String[] args) {
		StaticInstanceMethod m=new StaticInstanceMethod();
		m.instancedisplay();
		display1();//when inside the class we call directly without class name and objectName
		MyInterface.staticMethod();
		m.display();

	
	}
}