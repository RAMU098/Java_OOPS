package ExceptionHandling;

public class IncorrectPinException extends Exception{
	IncorrectPinException(String str){
	super(str);
	}
}
class MobilePassword{

	public static void main(String[] args) {
		int pin=1234; int enter=123;
		if(pin==enter) {
			System.out.println("password is correct");
		}
		else {
			try {
			IncorrectPinException p=new IncorrectPinException("password is wrong");
			throw p;
			}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
}                                                          