package ExceptionHandling;
import java.util.Scanner;
public class TRY_CATCH_BLOCK {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=0;
	try {
	 c=a/b;
	 System.out.println("the value is"+c);
	}
	catch(ArithmeticException e){
		System.out.println(e);                     //it is used to print the name of the exception by using e
		e.printStackTrace();                       //print complete stack information stored in  the  exception e
		System.out.println("invalid");
	}
	System.out.println("After exception raise");
}
}
