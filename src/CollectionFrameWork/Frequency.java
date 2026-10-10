package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map.Entry;

//int[] arr={10,20,10,40,5,6,5,7};
//1:find the count of frequency of the array
//2:String frequency of an string using hashmap
public class Frequency {
public static void main(String[] args) {
	int[]arr= {10,20,10,5,6,7,5,8};
	HashMap<Integer,Integer> hm=new HashMap<>();
	for(int num:arr) {
		hm.put(num, hm.getOrDefault(num,0)+1);
	}
	System.out.println(hm);
	for(Entry<Integer,Integer> e:hm.entrySet()) {
		System.out.println(e);
	}
}
}
