package Java8Features;
interface Payment{
	public void pay(double amt);
	default void Recipt(){
		System.out.println("recit is generated for payment");
	}
}
class Upi implements Payment{
	@Override
	public void pay(double amt) {
		System.out.println("Amount paid:"+amt);
		}
	@Override
	public void Recipt(){
		System.out.println("upi bill");
	}
}
public class Default_Static_Implementation {
	public static void main(String[] args) {
		Upi u=new Upi();
		u.pay(2000);
		u.Recipt();
	}

}
