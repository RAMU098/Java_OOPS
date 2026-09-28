package Multithreading;

public class RunnableDemo implements Runnable{

	@Override
	public void run() {
		try {
		for(int i=0;i<10;i++) {
			System.out.println("the value of i is"+i);
			Thread.sleep(1000);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Runnable_main{
	public static void main(String[] args) {
		RunnableDemo r=new RunnableDemo();
		Thread t1=new Thread(r);
		t1.start();
		r.run();  //explicitily alsowe will call run method
	}
}
