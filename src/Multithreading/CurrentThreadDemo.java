package Multithreading;

public class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("Thread");//for setting name
		t.setPriority(1);  //for setting priority
		
		System.out.println(t);
	}

}
