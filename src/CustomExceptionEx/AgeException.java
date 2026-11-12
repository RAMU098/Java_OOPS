package CustomExceptionEx;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
class Check{
	public void age(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("not elegible for vote");
		}
		else {
			System.out.println("eligible");
		}
	}
}

public class AgeException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		var check=new Check();
		try {
			check.age(n);
			
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
	}

}
