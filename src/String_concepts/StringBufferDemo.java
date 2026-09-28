package String_concepts;

public class StringBufferDemo {
public static void main(String[] args) {
//	StringBuffer str1=new StringBuffer();//default//capacity =16 length=0 automatically it stored in default object
	//StringBuffer str1=new StringBuffer(10);//integer//capacity =10length=0 it will compare the capacity by using integer in object
	StringBuffer str1=new StringBuffer("Codegnan");//using String  //capacity=16+length of the string
	System.out.println("Capacity is " +str1.capacity());
	System.out.println("Length is " +str1.length());
	str1.append("codegnan");//it will be same until we reaching 16 after 16 it will be double or twice to length after twice it will be same
		System.out.println("Capacity is "+str1.capacity());
		System.out.println("length is"+str1.length());
		//used to decrease the capacity to length by using trimToSize
		str1.trimToSize();//it will trim to the length so we will get 8 in capacity
		System.out.println("Capacity is"+str1.capacity());
		System.out.print("length is"+str1.length());
}

}
 