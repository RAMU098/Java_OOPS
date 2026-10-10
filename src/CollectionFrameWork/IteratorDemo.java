package CollectionFrameWork;
import java.util.*;
public class IteratorDemo {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList();
	a.add("sam");
	a.add("ram");
	a.add("raj");
	a.add("tharun");
	a.add("adhi");              
	System.out.println(a);
	Iterator<String> i=a.iterator();
	while(i.hasNext()) {
		if(i.next().contains("ram")) {
			i.remove();
		}
	}
	for(String n:a) {
	System.out.println(n);
}
System.out.println("forward");
	ListIterator<String> l=a.listIterator();
	while(l.hasNext()) {
		if(l.next().contains("sam")) {
			l.set("ramu");
	
	}
		}
	for(String n1:a) {
		System.out.println(n1);
	}
	System.out.println("back");
	while(l.hasPrevious()) {
		System.out.println(l.previous());
	}
	}
}
