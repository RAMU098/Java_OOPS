package String_concepts;
//by using concat,charAt(0),
public class StringDemo2 {
public static void main(String[] args) {
	String str1=new String("Codgnan");
	//System.out.println(str1.codePointAt(0));
	System.out.println(str1.charAt(0));                 //charAt is used for showing index position of character or string
	System.out.println(str1.codePointAt(0));           //code.pointAt is used to show the character unique code
	System.out.println(str1.indexOf('o'));            //indexOf show the index place of character
	System.out.println(str1.lastIndexOf('n'));       //it shows the last index value  if it present same character
	System.out.println(str1.concat("IT Solutions"));//concat means (+)addition
	System.out.println(str1);

}
}
