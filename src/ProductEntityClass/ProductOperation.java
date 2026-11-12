package ProductEntityClass;

import java.util.HashSet;
import java.util.Iterator;

public class ProductOperation {
	private HashSet<Product> products=new HashSet<>();
	public ProductOperation() {
		Product prod1=new Product(1,"cycle",157);
		Product prob2=new Product(2,"Fan",11);
		Product prob3=new Product(3,"Cup",2);
		products.add(prod1);
		products.add(prob2);
		products.add(prob3);
	}
	//Add a Product to the inventory
	public boolean addProduct(int prodid,String name,double price) {
		boolean isAdded=false;
		Product newProduct=new Product(prodid,name,price);
		isAdded=products.add(newProduct);
		return isAdded;
	}
	//Display All Product From the Inventory
	public void display() {
		for(Product p:products) {
			System.out.println(p);
		}
	}//get All Products
	public HashSet<Product> getProducts(){
		return products;
	}
	public Product findProductById(int prodId) {
		for(Product prod1:products) {
			if(prod1.getProdid()==prodId) {
				return prod1;
			}
		}
		return null;
	}
	public Product findProductByName(String name) {
		for(Product prod2:products) {
			if(prod2.getName().equals(name)) {
				return prod2;
			}
		}
		return null;
	}
	public boolean deleteProduct(int productId) {
		boolean isDeleted=false;
		//Product foundProduct=null;
		//for(Product product:products) {
		//	if(product.getProdid()==productId) {
		//		foundProduct=product;
		//		break;
		//		}
	//
		//	}
	//	if(foundProduct !=null) {
		//	isDeleted=products.remove(foundProduct);
		//}
		//Iterator
		Iterator<Product> itr=products.iterator();
		while(itr.hasNext()) {
			Product pro=itr.next();
			if(pro.getProdid()==productId) {
				isDeleted=products.remove(pro);
				break;
			}
		}
		return isDeleted;
	}
	public boolean updateProductPrice(int prodId,double price) {
		boolean isUpdate=false;
		Iterator<Product> itr1=products.iterator();
		while(itr1.hasNext()) {
			Product prodUpdate=itr1.next();
		
		for(Product prod3:products) {
			if(prod3.getProdid()==prodId) {
				prod3.setPrice(price);
				isUpdate=true;
				break;
			}
		}
		}
		return isUpdate;
		}
		
	}
	


class ProductMain{
	public static void main(String[] args) {
		ProductOperation productOperations=new ProductOperation();
		//productOperations.display();
	boolean isProductAdded=	productOperations.addProduct(1, "cycle", 123.00);
		if(isProductAdded) {
			System.out.println("Product Added Successfully");
		}
		else {
			System.out.println("Product is not added");
		}
		productOperations.display();
		HashSet<Product> prod=productOperations.getProducts();
		for(Product p:prod) {
			System.out.println(prod);
		}
		//for finding
		Product productid=productOperations.findProductById(1);
		if(productid !=null) {
			System.out.println("Produc find success");
			System.out.println("ProdId:"+productid.getProdid());
			System.out.println("Prod name:"+productid.getName());
			System.out.println("prod price:"+productid.getPrice());
		}else {
			System.out.println("Product not found");
		}
			Product productName=productOperations.findProductByName("cycle");
			if(productName !=null) {
				System.out.println("Product found successfully");
				System.out.println("prodname:"+productName.getName());
			}else {
				System.out.println("Product not found");
			}
			//for deleted
			boolean isprodDeleted=productOperations.deleteProduct(2);
			if(isprodDeleted) {
				System.out.println("Delete");
			}
			else {
				System.out.println("nor deleted");
			}
			System.out.println(productOperations.deleteProduct(2));
			System.out.println(isprodDeleted);
			System.out.println(prod);
			//for Updated
			boolean isPriceUpdated=productOperations.updateProductPrice(3, 300.00);
			if(isPriceUpdated) {
				System.out.println("Updated");
			
			}else {
				System.out.println("not updated");
			}
			System.out.println(prod);
		
	}
}