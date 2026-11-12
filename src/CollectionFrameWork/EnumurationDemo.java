package CollectionFrameWork;

import java.util.Enumeration;
import java.util.Vector;

public class EnumurationDemo {
public static void main(String[] args) {
	Vector<String> v=new Vector<>();
	v.add("Ramu");
	v.add("Raju");
	v.add("Tharun");
	v.add("Mahaboob");
	System.out.println(v);
	                                //using enumaration access the elements
	Enumeration<String> e=v.elements();
	//hasMoreElements() returns a boolean value if elements is present or not
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	                                   //Enhanced for loop
	for(String s:v) {
		System.out.println(s);
	}

}
}
