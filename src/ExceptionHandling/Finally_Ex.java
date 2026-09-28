package ExceptionHandling;
//import java.io.FileReader;          //when using FileReader in try block
import java.util.Scanner;
public class Finally_Ex {
	public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	int []arr= {1,2,3,4,5};
	try //(FileReader fr=new FileReader("abc.txt");)
	{
		arr[10]=100;
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
	System.out.println("Statement of Finally Block");
	}
	}

}
//(FileReader fr=new FileReader("abc.txt");)--is used to catch the file until last catch exected