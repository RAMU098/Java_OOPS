package CollectionFrameWork;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetDemo {
public static void main(String[] args) {
	//using hashSet
	//HashSet<String> set=new HashSet<>(); //it print unordered
	//using LinkedHashset
	//LinkedHashSet<String> set=new LinkedHashSet<>();//it print ordered
	TreeSet<String> set=new TreeSet<>(); //treeset didnot allow null value to sort
	set.add("hyd");
	set.add("gnt");     
	set.add("rjy");
	//set.add(null);
	set.add("hyd");
	System.out.println(set);
	//we can not sort the set using Collections class it allows only list elements
	//Collectins.sort(set);
}
}
