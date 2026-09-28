package ExceptionHandling;
import java.util.Scanner;
public class Nested_TryCatchFinally_Block {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {                                             //outer try block
			int c=a/b;
			System.out.println("the outer try block: "  +c);
			try {                                          //inner try block
				int []arr= {1,2,3,4,5};
				arr[10]=100;
			
				System.out.println("the inner try block");
			}
			catch(ArithmeticException e) {                            //inner catch block
			System.out.println("Arithmetic exception");
				System.out.println(e);
				e.printStackTrace();
				System.out.println("the inner catch block");
			}
			finally {                                     //inner finally block
				System.out.println("the inner finally block");
	
			}
			}                                                     //end outer try block
	catch(ArrayIndexOutOfBoundsException e) {                                    //outer catch block
		System.out.println(e);
		e.printStackTrace();
		System.out.println("Array exception");
		System.out.println("the outer catch block");
	}
		finally {                                        //outer finally block
			System.out.println("the outer finally block");
		}
	}
	}


