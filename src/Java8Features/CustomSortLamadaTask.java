package Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//class MyComparator implements Comparator<Integer>{
	//==========================================using comparator  withour lambda======================================
//	@Override
//	public int compare(Integer a,Integer b) {

		//if(a<b) {
	//	return 1;
	//	}else if(a>b) {
	//		return -1;
	//	}else {
	//		return 0;
	//	}
	
//	}
//}
public class CustomSortLamadaTask {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList();
	a.add(120);
	a.add(234);
	a.add(30);
	a.add(40);
	System.out.println(a);
	//========Without lambda==========
	//Collections.sort(a);
	//Collections.sort(a,new MyComparator());
	//System.out.println(a);
	//=====================with Lambda============
	//Comparator<Integer> c=(x,b)->Integer.compare(x, b);
	Comparator<Integer> c=(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0;
	Collections.sort(a,c);
	System.out.println(a);
}
}
