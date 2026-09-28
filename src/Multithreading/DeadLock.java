package Multithreading;
class Thread1{
	synchronized void display(Thread2 t2) {
		System.out.println(Thread.currentThread().getName()+"child 1 Entered");
		t2.last();
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		synchronized void last() {
			System.out.println("Trying to call Thread1 class last method");
		}
	
}
class Thread2{
	synchronized void display(Thread1 t1) {
		System.out.println(Thread.currentThread().getName()+" child 2 Entered");
		t1.last();
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		synchronized void last() {
			System.out.println("Trying to call Thread2 class last method");
		}
	
}

public class DeadLock extends Thread {

	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();
	DeadLock(){
		System.out.println(Thread.currentThread().getName()+"Entered");
		start();

	t2.display(t1);
	}
	public void run() {
		t1.display(t2);
	}
	
public static void main(String[] args) {
new DeadLock();
}	
	

}
