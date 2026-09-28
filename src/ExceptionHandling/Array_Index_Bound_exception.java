package ExceptionHandling;
//single try with multiple catch
import java.util.Scanner;
public class Array_Index_Bound_exception {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String[]products= {"laptops","mouse","pendrive","ram"};
	int productscount=products.length;
	Integer quantity=null;
	try {
		//System.out.println(products[5]);
		int total=productscount*quantity;
	
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	catch(Exception e) {      //Exception e is used if we don't know the exception name
		System.out.println(e);                //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4:exception
		e.printStackTrace();
	}
}
}
