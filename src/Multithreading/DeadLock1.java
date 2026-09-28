package Multithreading;

class Customer1{
	synchronized void CallMe(Customer2 c2) {
		System.out.println("Customer1 Thread");
		//c2.show();
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		} 
		c2.show();
		}
		synchronized void display() {
			System.out.println("Display method from coustomer1 class");
		}
	}
	class Customer2{
		synchronized void CallMe(Customer1 c1) {
			System.out.println("Customer2 Thread");
			//c1.display();
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			c1.display();
		}
	synchronized void show() {
		System.out.println("Show method from coustomer2");
	}
	}
public class DeadLock1 extends Thread {
	Customer1 c1=new Customer1();
	Customer2 c2=new Customer2();
	DeadLock1(){
		System.out.println("Main Thread");
         start();
		c1.CallMe(c2);
	}
	public void run() {
		c2.CallMe(c1);
	}
public static void main(String[] args) {
	new DeadLock1();
}
}
