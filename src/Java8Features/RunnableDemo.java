package Java8Features;
// ================Without Lamada=============
//class MyRunnable implements Runnable{
	//@Override
	//public void run() {
		//for(int i=0;i<10;i++) {
		//	System.out.println(i+"S");
		//}
	//}
//}
public class RunnableDemo {
	public static void main(String[] args) {
		//=====================With lamada=======================
	Runnable a=()->{
		for(int i=0;i<10;i++) {
			System.out.println(i+" S ");
		}
	};
		//MyRunnable mr=new MyRunnable();
		Thread t=new Thread(a);
		t.start();
		//t.start();//Runtime Error before complete we need not call another start method

for(int i=0;i<10;i++) {
	System.out.println(i+" R ");
}
}
}
