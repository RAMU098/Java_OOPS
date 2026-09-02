package JavaOOPs.basics;

public class Product1Main {

		public static void main(String[] args) {
			
		
	Product p1=new Product();//calling non parameterised constructor
	p1.display();
	//Product p2=new Product(100,123.34f,123.34f);//calling parameterised constructor
		//p2.display();
		Product p3=new Product(p1);
		p3.display();
		}
	}


