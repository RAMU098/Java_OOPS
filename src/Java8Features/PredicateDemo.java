package Java8Features;

import java.util.function.Predicate;

//==============================Predefine Functional interface===============================
public class PredicateDemo {
	
	public static void main(String[] args) {
		//boolean test(
		Predicate<Integer> isEven=
				n->n%2==0;
		//	boolean b=isEven.test(5);
		//	boolean b1=isEven.test(6);
			System.out.println(isEven.test(5));
			System.out.println(isEven.test(6));
			Predicate<Integer> isPass=marks->marks>40;
			//boolean d=isPass.test(40);
			System.out.println(isPass.test(30));
	
	}

}
