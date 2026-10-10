package CollectionFrameWork;

import java.util.Set;
import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
   public static void main(String[] args) {
	   HashMap<Integer,String> hm=new HashMap();

	   hm.put(123,"bala");
	   hm.put(12, "ram");
	   hm.put(13, "balu");
	   System.out.println(hm);
	   Set<Entry<Integer,String>> set=hm.entrySet();
	   for(Entry<Integer,String> e:set) {
		  System.out.println(e.getValue()+" "+e.getKey()); 
	   }
}
}
