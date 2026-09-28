package String_concepts;
//Factory methods
public class FactoryMethods {
public static void main(String[] args) {
	char[]ch= {'a','r','t'};
	String str2=String.valueOf(ch);            //character is converted into string by using factory method
	System.out.println(str2);
	String str3="Java Full Strack Class";
	String arr[]=str3.split(" ");            //split == helps to split or divide the strings into individual parts 
	for(String str:arr) {
	System.out.println(str);
	}
	System.out.println(str2.compareTo(str3));//compare == compare is help to compare the one by one character ex=C=67 and J=74 compare ans=-7
	str2.getBytes();                           //getBytes is a method is used to convert  string into byte
	byte[]ab1=str2.getBytes();
	for(byte b1:ab1) {
		System.out.println(b1);
	}
     char[]str5=str2.toCharArray();                  //converting into the character array
     System.out.println(str5);
}
}
