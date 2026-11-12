package Java8Features;

import java.util.function.Function;

public class CalculateSalaryUsingFunctional {
public static void main(String[] args) {
	Function<Double,Double> calSal=sal->sal+(sal*0.1);
	System.out.println(calSal.apply(5000.00));
	
}
}

