package Abstract;
//final keyword example
public final class Finalex {//static we can use because it contain only one class//we can use private modifier
protected final int a,b;
Finalex(){
	a=100;
	b=200;
	System.out.println("this is the Final super class constructor");
}
void display() {
	System.out.println("the value of a is"+a);
	System.out.println("the value of b is"+b);
}
final void addition() {
	System.out.println("this is addition final method");
}
}
