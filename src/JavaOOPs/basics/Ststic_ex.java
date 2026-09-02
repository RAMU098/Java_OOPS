package JavaOOPs.basics;

public class Ststic_ex {
int num1;//instance variable
static int num2;//static variable
static{
	System.out.println("the static block");
}

Ststic_ex(){
	num1=100;
	System.out.println("this is a staticExample class constructor");
	
}
void display() {
	System.out.println("the value of num1 is "+num1);
}
static void show() {
	System.out.println("this is show method from Static");
}
}
