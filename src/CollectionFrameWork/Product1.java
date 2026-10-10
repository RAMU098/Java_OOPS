package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Scanner;

class Product2 {
private int id;
private String price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price=price;
}
public Product2() {
	// TODO Auto-generated constructor stub
}
public Product2(int id,String price) {
	super();
	this.id=id;
	this.price=price;
}
public String toString() {
	return"Product[id="+id+",price="+price+"]";
			
}
}
public class  Product1{
	public static void main(String[] args) {
	//	Scanner sc=new Scanner(System.in);
		
	//	int n=sc.nextInt();
	//	int m=sc.nextInt();
		ArrayList<Product2> h=new ArrayList();
		h.add(new Product2(12,"120"));
		h.add(new Product2(13,"120"));
		System.out.println(h);
	
	for(Product2 n:h) {
		if(n.getId()==13) {
		System.out.println(n.getPrice());	
		}
	}
	
}	
}