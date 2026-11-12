package Java8Features;

public interface LambdaTask {
	//==========without datatype has returntype======
	//public  void display(String a,String b);
	//==============with datatype has return type=========== 
	public String concatStr(String a,String b);
}
class Test{
	public static void main(String[] args) {
		//LambdaTask c=(a,b)->System.out.println(a.compareTo(b));
		//c.display("Ra", "Ra");
	LambdaTask c=(a,b)->a+b;
		String res=c.concatStr("Ra", "mu");
	System.out.println(res);
	}
}