package String_concepts;
//no change by using stringBuffer and stringBuilder,it will be same
public class StringBuffer_Demo {
public static void main(String[] args) {
	//String Buffer str1=new StringBuffer("Codegnan It Solution");
	StringBuilder str1=new StringBuilder("Codegnan It Solutions");//object
	System.out.println(str1.substring(3));
	System.out.println(str1.substring(3,7));             //7is exclusive and 3 is included
                                                        //toString() helps to convert String Buffer  into String 
	System.out.println(str1.toString());               //this object become a immutable
	str1.setCharAt(0, 'c');                              //set the char into lower case
	System.out.println(str1);
	System.out.println(str1.delete(4, 8));        //to delete the string by using range
	System.out.println(str1.reverse());          //helps to reverse

}
}
