package Practice_Example;

public class Product {
int proid;
String name;
int price;
Product(int proid,String name,int price){
this.proid=proid;
this.name=name;
this.price=price;
}
void display() {
	System.out.println(proid);
	System.out.println(name);
	System.out.println(price);
	}
}
class ElectricProduct extends Product{
	int Waranty;
	ElectricProduct(int Waranty){
		super(123,"nani",5000);
		this.Waranty=Waranty;
	}
	void display() {
		System.out.println(proid);
		System.out.println(name);
		System.out.println(price);
		System.out.println(Waranty);
	}
}
class Nithin{
	public static void main(String[] args) {
		ElectricProduct ep=new ElectricProduct(2);
		ep.display();
	}
}
