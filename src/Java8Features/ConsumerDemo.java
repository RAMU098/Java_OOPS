package Java8Features;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<Double> sal=(s)->System.out.println(s);
		sal.accept(100.0);
	
	}

}