package ExceptionHandling;
import java.util.Scanner;
class ResturentException extends Exception{
	public ResturentException(String msg) {
		super(msg);
	}
}
class ItemFoundException extends Exception{
	public ItemFoundException (String a) {
		super(a);
	}
}
class MinimumNotReachException extends Exception{
	public MinimumNotReachException(String b) {
		super(b);
	}
}
class AddressInvalidException extends Exception{
	public AddressInvalidException(String c){
		super(c);
	}
}
class PaymentException extends Exception{
	public PaymentException(String d) {
		super(d);
	}
}
class FoodPlaced{
	public void Placed(boolean b1) throws ResturentException {
		if(b1==true) {
			System.out.println("resturent open:");
		}else {
			throw new ResturentException("Resturent close");
		}
	}

public void Item(boolean b2) throws ItemFoundException {
	if(b2==true) {
		System.out.println("item avail:");
	}
	else {
		throw new ItemFoundException("Iten not there:");
	}
}
public void minorder(double amount) throws MinimumNotReachException {
	if(amount>=400) {
		System.out.println("Min value reached:");
		}
	else {
		throw new MinimumNotReachException("Not reach");
	}
}
public void Address(String a1) throws AddressInvalidException {
	if(a1!=null) {
		System.out.println("Adress true");
	}
	else {
		throw new AddressInvalidException("Adress wrong");
	}
}
public void pay(boolean a2) throws PaymentException {
	if(a2==true) {
		System.out.println("Payment success");
	}
	else {
		throw new PaymentException("Not done");
	}
}
public void placeitem(boolean b1,boolean b2, double amount,boolean a2,String a1) throws ResturentException,AddressInvalidException,ItemFoundException,MinimumNotReachException,PaymentException{
	Placed(b1);
	Item(b2);
	minorder(amount);
	Address(a1);
	pay(a2);
}
}
public class CustomeDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	boolean b1=sc.nextBoolean();
	boolean b=sc.nextBoolean();
	double a=sc.nextDouble();
	boolean c=sc.nextBoolean();
	sc.nextLine();
	String f=sc.nextLine();
	FoodPlaced f1=new FoodPlaced();
	try {
		f1.placeitem(b1,b,a,c,"f");
	}
	catch(ResturentException e) {
		System.out.println(e);
	}
	catch(ItemFoundException e) {
		System.out.println(e);
	}
	catch(MinimumNotReachException e) {
		System.out.println(e);
	}
	catch(AddressInvalidException e) {
		System.out.println(e);
	}
	catch (PaymentException e) {
	System.out.println(e);	
	}
}
}
