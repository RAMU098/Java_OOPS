package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class ProductItem {
	int Id;
	String name;
	public ProductItem(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "ProductItem: [Id=" + Id + ", name=" + name + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
 public class ProductSet{
	 public static void main(String[] args) {
		// ArrayList<ProductItem>ps=new ArrayList<>();
		HashSet<ProductItem> ps=new HashSet<>();
		//adding products into products using constructor
		ps.add(new ProductItem(12,"Bike"));
		ps.add(new ProductItem(13,"Mobile"));
		ps.add(new ProductItem(14,"Laptop"));
		ps.add(new ProductItem(12,"Bike"));// using constructor
		System.out.println(ps);
		for(ProductItem p:ps) {
			System.out.println(p);
		}
		//Collections.sort(ps);  we can use comparator interface to sort product elements using specific values to sort\
	}
 }
