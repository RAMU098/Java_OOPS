package Multithreading;
class Student1{
	synchronized void JavaBookReceived(Student2 s2) {
		String name=Thread.currentThread().getName();
		System.out.println(name+"Thread1 Entered");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		s2.JBookReceived();
	}
	synchronized void SBookReceived(){
		System.out.println("Student2 SQL Block Statement");
		
	}
}
class Student2{
	synchronized void SQLBookReceived(Student1 s1) {
		String name=Thread.currentThread().getName();
		System.out.println(name+"Thread2 Entered");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		s1.SBookReceived();
	}
	synchronized void JBookReceived() {
		System.out.println("Student2 Java Block Statement");
	}
}
public class DeadLock2 extends Thread{
	Student1 s1=new Student1();
	Student2 s2=new Student2();
	DeadLock2(){
		start();
		s1.JavaBookReceived(s2);
	}
	public void run() {
		s2.SQLBookReceived(s1);
	}
	public static void main(String[] args) {
		DeadLock2 d=new DeadLock2();
	}

}
