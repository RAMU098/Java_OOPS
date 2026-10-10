package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<>();
                                                 	//user Input
//	Scanner sc=new Scanner(System.in);
//	int n=sc.nextInt();
//	for(int i=1;i<=n;i++) {
//	System.out.println("enter id");
//	int id=sc.nextInt();
//	System.out.println("Enter name");
//	String name=sc.next();
  //  hm.put(++id, name);
    
    //hm.put(++id,name);
	//}
	//System.out.println(hm);
	hm.put(12, "ramu");
	hm.put(2, "raju");
	hm.put(3, "nani");
	System.out.println(hm);
	System.out.println(hm.get(12));
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	for(Entry<Integer, String> entry:hm.entrySet()) {
		
		System.out.println(entry.getKey()+" "+entry.getValue()  );
	}
}}

