package Multithreading;

public class SharableData {
int value;
boolean available=false;
synchronized void WriteData(int value) {
	try {
	while(available) {
		wait();
	}
	this.value=value;
	available=true;
	System.out.println("Written value:"+value);
	notify();               //it will be notify to the another thread to start
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
}
synchronized void ReadData() {
	try{
		while(!available) {
		wait();
		}
		int data=value;
		available=false;
		System.out.println("Read data:"+data);
	    notify();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}
class Producer extends Thread{
	SharableData s1;
	Producer(SharableData s1){
		this.s1=s1;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			s1.WriteData(i);
		}
	}
}

class Consumer extends Thread{
	SharableData s1;
	Consumer(SharableData s1){
		this.s1=s1;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			s1.ReadData();
		}
	}
}
class Synchronized {
	public static void main(String[] args) {
		SharableData s1=new SharableData();
		Producer p=new Producer(s1);
		Consumer c=new Consumer(s1);
		p.start();
		c.start();
	}
}
