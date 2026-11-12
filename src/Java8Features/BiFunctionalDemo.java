package Java8Features;

import java.util.function.BiFunction;

public class BiFunctionalDemo {
	public static void main(String[] args) {
		BiFunction<Double,Double,Double> bfi=(n,m)->n+(n*m/100);
		bfi.apply(1200.0,18.0);
		System.out.printf("%.2f%n",+bfi.apply(1200.30, 18.0));
		System.out.println(bfi.apply(2300.0,5.0));
	}

}
