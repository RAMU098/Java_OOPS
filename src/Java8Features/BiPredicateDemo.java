package Java8Features;

import java.util.function.BiPredicate;

//==============BiPredicate contains 2arguments==============
public class BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> checksum=(n1,n2)->(n1+n2)>100;
		System.out.println(checksum.test(20, 84));
		//=========================BiPredicate Task=================================
		//Astudent is eligible for admission if
		//age is atleast 18,and percentage is atleast 60
	
		BiPredicate<Integer,Integer> isEligible=(age,per)->(age>=18 && per>=60);
		System.out.println(isEligible.test(18, 65));
	}

}
