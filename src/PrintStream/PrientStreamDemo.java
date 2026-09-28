package PrintStream;
import java.io.PrintStream;
public class PrientStreamDemo {
public static void main(String[] args) {
	PrintStream ps=new PrintStream(System.out);
	ps.print(100);
	ps.println(123.03f);
	ps.println("Hello");
	ps.println(true);
	float f1=100.345f;
	ps.printf("%.2f",f1);
	//ps.format("%f",f1);
}
}
