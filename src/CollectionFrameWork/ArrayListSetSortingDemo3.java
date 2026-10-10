package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSetSortingDemo3 {
public static void main(String[] args) {
	ArrayList<String>cl=new ArrayList<String>();
	cl.add("India");
	cl.add("Japan");
	cl.add("Us");
	cl.add("Australia");
	System.out.println("Before sort method");
	for(String c:cl) {
		System.out.println(c);
	}
System.out.println("After sort Method");
	//Sort
	Collections.sort(cl);
	for(String c:cl) {
		System.out.println(c);
	}
	ArrayList<Integer> nl=new ArrayList<Integer>();
	nl.add(12);
	nl.add(30);
	nl.add(3);
	nl.add(1);
	System.out.println("Before sort");
	for(Integer n:nl) {
		System.out.println(n);
	}
	System.out.println("After sort");
	//sort method
	Collections.sort(nl);
	for(Integer n:nl) {
		System.out.println(n);
	}
	}
}
