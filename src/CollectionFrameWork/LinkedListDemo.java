package CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList li=new LinkedList();
	li.add("Red");
	li.add("Orange");
	li.add("White");
	li.add("pink");
	li.add(1000);
	li.add(null);
	System.out.println("the given objects are"+li);
	li.addFirst("Black");
	li.addLast("Maroon");
	Iterator it=li.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	ListIterator lit=li.listIterator();
	System.out.println("In forward Direction");
	while(lit.hasNext()) {                          //hasnext helps to print forward direction
		System.out.println(lit.next());
	}
			System.out.println("in backward direction");
			while(lit.hasPrevious()) {                //hasprevious helps to print in backward direction
				System.out.println(lit.previous());
			}
}
}
