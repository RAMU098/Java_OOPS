package Java8Features;

import java.util.function.Function;

public class FunctionalDemo {
public static void main(String[] args) {
	//Function<InputType .ReturnType>
	//Function to calculate the square of a number
	Function<Integer,Integer> f=n->n*n;
	//int s=f.apply(5);
	System.out.println(f.apply(5));
//	System.out.println(s);
	
}
}
