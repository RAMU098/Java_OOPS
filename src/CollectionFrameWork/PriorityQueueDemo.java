package CollectionFrameWork;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		//Add and elements using offer() or add()
		pq.offer(10);
		pq.add(30);
		pq.offer(15);
		pq.offer(20);
		System.out.println(pq);
		//using peek() to pick the highest priority or return  first in the queue  
		System.out.println(pq.peek());
		//poll() or remove() is helps to remove the elements
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println("Enhance");
		for(Integer i:pq) {
			System.out.println(i);
		}
	}

}
