package ExceptionHandling;
import java.util.Scanner;
public class Nested_TryFinally_Block {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {                                             //outer try block
			int c=a/b;
			System.out.println("the outer try block:"+c);
			try {                                          //inner try block
				int []arr= {1,2,3,4,5};
				arr[10]=100;
			
				System.out.println("the inner try block");
			}
		finally {
			System.out.println("the inner finally block");
		}                                                     //end outer try block
		}
		finally {
			System.out.println("the outer finally block");
	}
	}
	}


