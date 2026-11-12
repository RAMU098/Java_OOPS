package CollectionFrameWork;

import java.util.ArrayDeque;
import java.util.Deque;

//problem: A hospital maintain a queue of patients waiting for consultation
//normal patients join from rare or last of the queue.
//emergency patents join from first of the queue
public class DequeDemo {
	public static void main(String[] args) {
		
	
	Deque<String> p=new ArrayDeque<>();
	//add normal patients
	p.addLast("ramu");
	p.addLast("Nithin");
	System.out.println("Normal patients:"+p);
	//add emergency patients
	p.addFirst("ravi");
	p.addFirst("Raju");
	p.addFirst("nani");
	p.addLast("sneha");
	System.out.println("Allpatients:"+p);
	//view next patients using peek()-method
	System.out.println("next patients:"+p.peekFirst());//for first
	System.out.println("last patients:"+p.peekLast());//for last
	//serve or remove patients
	System.out.println("remove patients:"+p.pollFirst());
	System.out.println("cancle appointment:"+p.pollLast());

}
}
