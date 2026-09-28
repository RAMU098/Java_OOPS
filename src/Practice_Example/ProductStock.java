package Practice_Example;

public class ProductStock {
private int price,stock;
private String pname;
public String getpname() {
return pname;
}
public void setpname(String pname) {
this.pname=pname;
}
public int getprice() {
	return price;
}
public void setprice(int price) {
	this.price=price;
}
public int getstock() {
	return stock;
}
public void setstock(int stock) {
	this.stock=stock;
}
ProductStock(int price,int stock,String pname){
	this.pname=pname;
	this.price=price;
	this.stock=stock;
}
public void addstock(int quality) {
	if(stock<0) {
		System.out.println("stock is -ve");
	}else {
	this.stock+=quality;
	System.out.println(stock); 
}}
void removestock(int quality) {
	if(stock<0) {
		System.out.println("-ve");
	
	}else {
		this.stock-=quality;
	System.out.println(stock);
	}}
void display() {
	System.out.println(pname);
	System.out.println(price);
	System.out.println(stock);

}
}
class Nan1{
	public static void main(String[] args) {
		ProductStock p=new ProductStock(600,300,"ramu");
		p.display();
		p.addstock(400);
		p.removestock(700);
	
	}
}