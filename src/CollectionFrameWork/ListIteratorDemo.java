package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
public static void main(String[] args) {
	List<String> l=new ArrayList<>();
	l.add("Ramu");
	l.add("Raju");
	l.add("Nani");
	System.out.println(l);
	ListIterator<String> lit=l.listIterator();
	while(lit.hasNext()) {
		System.out.println(lit.next());
	}
	while(lit.hasPrevious()) {
		System.out.println(lit.previous());
	}
}
}
