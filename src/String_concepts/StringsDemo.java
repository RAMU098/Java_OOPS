package String_concepts;

public class StringsDemo {
public static void main(String[] args) {
	String str1=new String("Codgnan");      //heap area-it will store in different memory when 2 objects is same
	String str2="Codgnan";                //String constant pool--it will store in same memory when 2 objects is same 
	String str3=new String("Codgnan");
	String str4="Codgnan";
	//it will compare the references not values  in the strings only
	//if location is same it will be true but different location is false
	if(str1==str2) {                         //it will check the location if they are store in same memory or not
		System.out.println("both are equal");
	}
	else {
		System.out.println("both are not equals");
	}
	if(str2==str4) {
		System.out.println("it is located in same memory so its equal");
	}
	else {
		System.out.println("it is nor equal if there are in different memory");
	}
	if(str1.equals(str2)) {                      //equals only compare only values
		System.out.println("equal");
		}
	else {
		System.out.println("not equal");
	}

}
}
