package Java8Features;

import java.util.function.Function;

//convert student marks inte grades
//90-100 A,75-89 B,60-74 C,Below 40 Fail
public class StudentFunctionalInterfaceTask {
	public static void main(String[] args) {
		Function<Integer,String> f=m-> {
				if(m<0||m>300) {
					return "Invalid Marks";
				}
				else if(m>=90) {
					return "A";
				}
				else if(m>=75) {
					return "B";
				}
				else if(m>=60) {
					return "C";
				}
				else if(m>=40) {
					return "D";
				}
				else {
					return "Fail";
				}
		};
		System.out.println(f.apply(95));
		System.out.println(f.apply(45));
		System.out.println(f.apply(78));
		System.out.println(f.apply(35));
		System.out.println(f.apply(65));
		System.out.println(f.apply(304));
		System.out.println(f.apply(204));
		}
}
