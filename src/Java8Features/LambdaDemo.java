package Java8Features;
@FunctionalInterface
public interface LambdaDemo {
	public void display(int num1,int num2);
}




//class Demo implements LambdaDemo{
	//@Override
//	public void display() {
		//System.out.println("Lamada expression");
	//}
//}




class Main{
	public static void main(String[] args) {
		//============with implementation============
	
		//Demo d=new Demo();
		//d.display();
	
		
		
		//=======without implementation keyword===========
		//LambdaDemo c=new LambdaDemo() {
		//	public void display() {
			//	System.out.println("lam");
		//	}
	///	};
	//	c.display();

		
		
		
		//==============using lambda expressions============================================
	//1.to implement the functional interface using lambda expression
		//implementation of Functional Interface
		                     
		
		
		
		
		
		
		
		
		
		
		
		//=======for Lambda Expression without arguments=================
				//LambdaDemo b=()->   //we no need access modifier like public/private and 
			                       	//no need return type and
				                    //no need name of the method and  
				                    // braces also no required for lambda expression
				//	System.out.println("Lamabda Exp");
			//	b.display();
			//	LambdaDemo c=()->{System.out.println("Multiple Methods using Lambda Expression");
                     //            System.out.println("Multiple methods");};	//withou (}) this it will printing 2statement first			
			//	c.display();
	
		
		
		
		
		
		
		//======================Lambda expression with arguments================================
		LambdaDemo b=(num1,num2)->System.out.println(num1+num2);
		b.display(2, 10);
	}
}