package Java8Features;
import java.util.*;
interface Calculator{
	public int add(int a,int b);
}
//class NormalClass implements Calculator{
//	@Override
//	public int add(int a,int b) {
//	return a+b;
//	}
//}
public class LamadaDemo {
public static void main(String[] args) {
	//================Normal Method========
	//NormalClass n=new NormalClass();
	//System.out.println(n.add(2,5));
	//================Normal Method without implementation keyword==========
	//Calculator c=new Calculator()
	//{
	//	public int add(int a,int b) {
		//	return a+b;
	//	}
	//	};
//	int res=c.add(2, 4);
//	System.out.println(res);
	//==================Lamaba Exprections==========
	Calculator c=(a,b)->a+b;
	System.out.println(c.add(10, 30));
	}
}
