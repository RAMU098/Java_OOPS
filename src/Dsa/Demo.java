package Dsa;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(132, "Ramu");
		map.put(124, "raju");
		System.out.println(map);
		System.out.println(map.get(124));
		System.out.println(map.containsKey(124));
		System.out.println(map.containsValue("raju"));
		System.out.println(map.getOrDefault(124,"no"));
		for(Map.Entry<Integer, String> entry:map.entrySet() ) {
			System.out.println(+entry.getKey()+" "+entry.getValue());
			
		}
	
	}

}
