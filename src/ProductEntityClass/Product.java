package ProductEntityClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Product implements Comparable<Product>{
private int prodid;
private String name;
private double price;
public int getProdid() {
	return prodid;
}
public void setProdid(int prodid) {
	this.prodid = prodid;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Product [prodid=" + prodid + ", name=" + name + ", price=" + price + "]";
}
public Product() {
	// TODO Auto-generated constructor stub
}
public Product(int prodid, String name, double price) {
	super();
	this.prodid = prodid;
	this.name = name;
	this.price = price;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public int compareTo(Product o) {
	Product cp=(Product)this;
	Product op=(Product) o;
	if(cp.getPrice()>op.getPrice()) {
		//return 1; for ascending ord
		return -1;//for descending ord 
	}else if(cp.getPrice()<op.getPrice()) {
		//return -1; for ascending ord
		return 1;//for descending ord
	}
	return 0;
}
@Override
public boolean equals(Object obj) {
	//return super.equals(obj);
	boolean a=false;
	//Retrieve Current Object(Which need to Compare) 
	Product cp=(Product) this;
	//Retrieve Other Object(With Which Compaision needs to be Done)
	Product op=(Product) obj;
	//REtrieve All the Values From both objects
	int cpid=cp.getProdid();
	String cpname=cp.getName();
	double cpprice=cp.getPrice();
	
	int opid=op.getProdid();
	String opname=op.getName();
	double opprice=op.getPrice();	
	//Logic for Equality check
	if(cpid==opid && cpname.equals(opname) && cpprice==opprice) {
		a=true;
	}
	return a;
}
}
class Main{
	public static void main(String[] args) {
		
			//Scanner sc=new Scanner(System.in);
		//	int  id=sc.nextInt();
		//	String name=sc.next();
		//	sc.nextLine();
		//	double price=sc.nextDouble();
	///	Product p=new Product();
	//	p.setPrice(price);
	//	p.setName(name);
	//	p.setProdid(id);
		
	//	System.out.println(p.getName());
	//	System.out.println(p.getPrice());
	//	System.out.println(p.getProdid());
		//List<Product> p=new ArrayList<>();//in order using this same order allow Duplicates
		//Set<Product> p=new HashSet<>();   //not in order for order use LinkedHashSet and not allow Duplicates
		//Set<Product> p=new LinkedHashSet<>();
		TreeSet<Product> p=new TreeSet<>();
		//p.add(new Product(1,"cycle",157.00));
		//p.add(new Product(2,"Fan",11.00));
		//p.add(new Product(3,"Cup",10.00));
		//p.add(new Product(4,"Lotus",40.00));
		//p.add(new Product(5,"Drum",500.00));
		//System.out.println(p);
	//	Product p1=new Product(1,"cycle",123.00);
	///	Product p2=new Product(2,"Fan",11.00);
		//Product p3=new Product(3,"Cup",30.00);
		//Product p4=new Product(4,"Lotus",300);
		//System.out.println(p);
	//	p.add(p4);
	//	p.add(p1);
	///	p.add(p3);
	//	p.add(p2);
		//System.out.println(p);
		//1st
		//System.out.println(p1.compareTo(p2));
		//System.out.println(p1.compareTo(p3));
	//	System.out.println(p1.compareTo(p4));
		//2nd
	//	System.out.println(p2.compareTo(p1));
	///	System.out.println(p2.compareTo(p3));
	//	System.out.println(p2.compareTo(p4));
		
		//for(Product p1:p) {
		//	System.out.println(p1);
//
	//	}
		
		Product p1=new Product(1,"Cycle",123);
		//Product p2=new Product(2,"Fan",11);
		Product p2=new Product(1,"Cycle",123);
		boolean a=p1.equals(p2);
		System.out.println(a);
 	}}
