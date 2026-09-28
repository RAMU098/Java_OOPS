package Abstract;

abstract class Payment {
String id,name;
Payment(String id,String name){
	this.id=id;
	this.name=name;
}
public abstract void pay(double amount);
}
class Upi extends Payment{
	Upi(String id,String name){
		super(id,name);
	}
	@Override
	public void pay(double amount) {
		System.out.println("transid:"+id);//we can use super and this for calling transid and cusname 
		System.out.println("cusname:"+name);
		System.out.println("upi amount:"+amount);
	}
}
 class Nith{
	public static void main(String[] args) {
		Payment p=new Upi("ra", "mu");
		p.pay(3000.0);
	}
}