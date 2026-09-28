package Multithreading;

public class ThreadDemo extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try{
			System.out.println(Thread.currentThread().getName()+" "+i); //Thread.currenThread is a object for setting the name  by using object reference
			Thread.sleep(1000);                                          //it is a factory method it creating by using class name and method name in static variable form
			}
			catch(Exception e){
			System.out.println(e);
			}
	}
	}
	}
class Thread_Main{
	public static void main(String[] args) {
		ThreadDemo t=new ThreadDemo();                    //for creating multiple Threads we need to create multiple object
	//	ThreadDemo t1=new ThreadDemo();
	    t.setName("Thread1");                                 //order will different by checking through priority`
	//	t1.setName("Thread2");
		t.setPriority(1);
	//	t1.setPriority(7);
		t.start();
	//	t1.start();
		
	}
}