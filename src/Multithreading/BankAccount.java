package Multithreading;
//synchronized block and method
public class BankAccount {
int balance=10000;
synchronized void withdraw(int amount) {                                        //without synchronized output is //thefunds insuficient
	                                                                                                 //Thread1is withdrawing:1000                                                                                               
	                                                                                                // the balance amount:0
	if(balance>=amount)
	{
		balance-=amount;
		System.out.println(Thread.currentThread().getName()+"is withdrawing:"+amount);
		System.out.println("the balance amount:"+balance);
	}
	else {
		System.out.println("the funds insuficient");
	}
}
}
//another class
class Customer extends Thread{
	BankAccount account;
	Customer(BankAccount account){
		this.account=account;
	}
	public void run() {
		account.withdraw(1000);
	}
}
class Synchronization_main{
	public static void main(String[] args) {
		BankAccount bank=new BankAccount();
		Customer c=new Customer(bank);
		Customer c1=new Customer(bank);
		c.setName("Thread1");
		c1.setName("Thread2");
		c.start();
		c1.start();
	}
}