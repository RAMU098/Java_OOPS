package Dsa;
import java.util.*;

public class PairSum {
	public static void main(String[] args) {
		int arr[]= {2,7,11,15};
		int target=9;
		//int target=11;
		//entry map
		Map<Integer,Integer> map=new HashMap();
		for(int i=0;i<arr.length;i++) {
			//findout complement
			int complement=target-arr[i];
			if(map.containsKey(complement)) {
				System.out.println("found a pair");
				System.out.println("index are:"+map.get(complement)+" "+i);
				return;
			}
			map.put(arr[i], i);
		}
		System.out.println("not found");
	}

}
