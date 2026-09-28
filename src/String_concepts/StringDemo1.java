package String_concepts;
//by using intern
public class StringDemo1 {
	public static void main(String[] args) {
String str1=new String("Codgnan");
String str2="Codgnan";
String str3=str1.intern(); //intern--it is a method is used to convert an object in a heap area to a object of string constant pool
if(str3==str2) {
	System.out.println("equal");
}
else {
	System.out.println("not equal");
}
}}