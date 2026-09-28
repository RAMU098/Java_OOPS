package Multithreading;

public class JoinMethodDemo extends Thread {
public void run() {
	try {
	for(int i=0;i<10;i++) {
		
			System.out.println(getName()+" "+i);
			Thread.sleep(1000);
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
class JoinMethod_main{
	public static void main(String[] args) {
		JoinMethodDemo t=new JoinMethodDemo();
		t.setName("Thread1");
		JoinMethodDemo t1=new JoinMethodDemo();
		t1.setName("Thread2");
		t.start();
		try {
		t.join();}                    //join must written in try catch blocks
		catch(Exception e) {
			System.out.println(e);
		}
		t1.start();
		
	
	}
}
