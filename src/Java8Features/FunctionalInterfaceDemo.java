package Java8Features;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	public void myAbstractMethod();//we  need to add only one abstract method in functional interface
	//public void m1();//it will give compaile error if we add another abstract Mathod
	//default and static method we can use many number in functional interface
	public static void m2() {
		System.out.println("Any number of static methods we add to functional interface");
	}
	default void m3() {
		System.out.println("Any number of default methods we add in functional interface");
	}
}
