package JavaOOPs.basics;
//CONSTRUCTORS IN INSTANCE/NONSTATIC VARIABLES
public class Product {
int productId;
float productPrice;
float productQty;
Product()//non parameterised constructor
{
productId=1001;
productPrice=101.21f;
productQty=121f;
System.out.println("Statement for Non parameterized constructor");
}
Product(int a,float f1,float f2){//parameterized constructor
productId=a;
productPrice=f1;
productQty=f2;
System.out.println("Statement for  parameterized constructor");
}
Product(Product p3){//copy constructor
productId=p3.productId;
productPrice=p3.productPrice;
productQty=p3.productQty;
System.out.println("Statement for copy constructor");
}
void display() {
	System.out.println(productId);
	System.out.println(productPrice);
	System.out.println(productQty);
}
}
