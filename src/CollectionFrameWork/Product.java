package CollectionFrameWork;
import java.util.*;
                                                                      //using Comparable Interface it is one type to sorting and second is Comparator interface
//public class Product implements Comparable<Product> {               //we can implement this to compare product elements and override compareTo 
public class Product{
public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getProname() {
		return proname;
	}
	public Product() {
		
	}
	@Override
	public String toString() {
		return "Product [proid=" + proid + ", proname=" + proname + ", proprice=" + proprice + "]";
	}
	public Product(int proid, String proname, int proprice) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.proprice = proprice;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getProprice() {
		return proprice;
	}
	public void setProprice(int proprice) {
		this.proprice = proprice;
	}
private int proid;
private String proname;
private int proprice;
                                                        //To compare elements using id we can override the compareTo method after implementing Comparable<class name>
//@Override
//public int compareTo(Product o) {
	//return Integer.compare(this.proid, o.proid);            //to Integers//for Double we can use Double Wrapper in place of Integer
//}
//public int compareTo(Product o){
//return this.Product.compareTo(o.productName);}          //for String compareTo for sorting
}
class LinkedListDemo1 extends Product{
	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(new Product(123,"Keys",300));
		li.add(new Product(124,"Mehaboob",500));
		li.add(new Product(125,"karimulla",100));
		System.out.println(li);
		//Collections.sort(li);
	
		li.sort(new PriceComparator());
		System.out.println(li);
		Iterator it=li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ListIterator lit=li.listIterator();
		System.out.println("it is forward");
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("It is backward");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}
}