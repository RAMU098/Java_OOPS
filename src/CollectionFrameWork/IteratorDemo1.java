package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo1 {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<>();
	a.add("Ramu");
	a.add("Raju");
	a.add("nani");
	System.out.println(a);
	//using iterator retrive the elements
	Iterator<String> it=a.iterator();
	while(it.hasNext()) {
		//System.out.println(it.next());
		String e=it.next();
		if(e.equals("Ramu")) {
			it.remove();
		
		}
	}
	System.out.println(a);
	System.out.println("using enhamce for loop");
     //using enhance for loop  for retrive the elements
	for(String s:a) {
		System.out.println(s);
	}
	System.out.println("using for loop");
	//using for loop retrive the elements
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
	//using ListIterator cursor 
	ListIterator<String> lit=a.listIterator();
	while(lit.hasNext()) {
		System.out.println(lit.next());
	}
	while(lit.hasPrevious()) {
		System.out.println(lit.previous());
	}
}
}
