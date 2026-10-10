package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringFrequence {
public static void main(String[] args) {
	String s="Hydrabad";
	char[]ch=s.toCharArray();
	HashMap<Character,Integer> hm=new HashMap<>();
	for(char n:ch) {
		hm.put(n,hm.getOrDefault(n, 0)+1);
	}
	System.out.println(hm);
	for(Entry<Character,Integer> e:hm.entrySet()) {
		System.out.println(e);
	}
}
}
