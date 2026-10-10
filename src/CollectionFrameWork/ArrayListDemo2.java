package CollectionFrameWork;
import java.util.*;
public class ArrayListDemo2 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("Ramu");
	a1.add(300);
	a1.add(200000);
	//System.out.println(a1);
	a1.add("Raju");
	a1.add(400);
	a1.add(300000);
	//System.out.println(a1);
	a1.add("Rani");
	a1.add(300);
	a1.add(400000);
	System.out.println(a1);
	//ArrayList a11=new ArrayList();
	//Arrays.asList("somu","Ramu","Raju");
	//System.out.println(a11);
	a1.addAll(a1);
	//a1.removeAll(a1);
	a1.remove(0);
	System.out.println(a1);
	
}
}
