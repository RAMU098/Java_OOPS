package Polymophism;

public class Payment {
public void pay(double amount) {
	System.out.println("select the pament method:"+amount);
}
}
class Card extends Payment{
	double discount; 
	@Override
	public void pay(double amount) {
		//amount-=(amount*(20/100));
		System.out.println("card payment:"+amount);
	}
}
class Upi extends Payment{
	@Override
	public void pay(double amount) {
		System.out.println("upi payment:"+amount);
	}
}
class More{
	public static void main(String[] args) {
		Payment p;//upcasting
		p=new Card();
		p.pay(2000);
	//	Upi m=(Upi)p;
	//	m.pay(2000);
	}
}