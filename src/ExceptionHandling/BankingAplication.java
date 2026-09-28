package ExceptionHandling;
import java.util.Scanner;
public class BankingAplication {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int amount=sc.nextInt();
	int cusno=sc.nextInt();
	try {
	int amountcus=amount/cusno;
	System.out.println(amountcus);
	}
	catch(Exception e){
		System.out.println("Exception raise in try block");
	}
	
	
}
}
