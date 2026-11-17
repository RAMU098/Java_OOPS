package Dsa;
import java.util.*;
public class DifferencePair {
	public static void main(String[] args) {
		int arr[]= {1,5,3,4,2};
		int k=2;
		Map<Integer,Integer> map=new HashMap();
		for(int i=0;i<arr.length;i++) {
			int num =arr[i];
			if(map.containsKey(num-k)) {
			System.out.println("index:"+map.get(num-k)+" "+i);
			System.out.println("values:"+(num-k)+" "+num);
			return;
		}
		if(map.containsKey(num+k)) {
			System.out.println("found pair");
			System.out.println("index"+map.get(num+k)+" "+i);
			System.out.println(map.get(num+k)+" "+num);
			return;
		}
		map.put(num, i);
	}
		System.out.println("not found");

}
}