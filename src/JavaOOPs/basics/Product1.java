package JavaOOPs.basics;
//for [this]keyword//it is using for instance variable declaration
public class Product1 {
	int product1Id;
	float product1Price;
	float product1Qty;

 Product1()//non parameterized constructor
	{
	 this(10,23.23f,23.34f);
	product1Id=1001;
	product1Price =101.21f;
	product1Qty=121f;
	System.out.println("Statement for Non parameterized constructor");
	}
	private Product1(int product1Id,float product1Price,float product1Qty){//parameterized constructor
		//this();//calling a private constructor of non parameterized constructor
	this.product1Id=product1Id;//using [this] keyword for showing instance/non static variable
	this.product1Price=product1Price;
	this.product1Qty=product1Qty;
	System.out.println("Statement for  parameterized constructor");
	}
	Product1(Product p3){//copy constructor
	product1Id=p3.productId;
	product1Price=p3.productPrice;
	product1Qty=p3.productQty;
	System.out.println("Statement for copy constructor");
	}
	void display() {
		System.out.println(product1Id);
		System.out.println(product1Price);
		System.out.println(product1Qty);
	}
void show() {
	this.display();//calling private method
}
}
