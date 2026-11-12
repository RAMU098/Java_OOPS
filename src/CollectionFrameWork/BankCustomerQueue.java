package CollectionFrameWork;


	import java.util.LinkedList;
	import java.util.Queue;
	//====================Methods using in queue====================
	//offer()- add the customer into the queue
	//poll()-removes the customer into the queue
	//peek()-lookup the first customer standing in the queue
	//====================Process==================
	//1.Add the customer to the queue using offer().
	//2.display all the elements.
	//3.display the next customer to served in the queue using peek()-method.
	//4.serve the customer using poll()-method.
	//5.Display number ofcustomers using size()-method.
	//6.check whether the customer are waiting in queue or not by using isEmpty()-method.
	public class BankCustomerQueue {
	public static void main(String[] args) {
		//List l=new LinkedList();
		//1.create a queue using LinkedList
		Queue<String> s=new LinkedList<>();
		//2.add the customers
		s.offer("Ramu");
		s.offer("Raju");
		s.offer("Nani");
		s.offer("Nithin");
		//3.display the customer
		System.out.println("Waiting customer:"+s);
		//peek()-pick the first elements
		//4.Check the nextCustomer
		System.out.println("Next customer:"+s.peek());
		//5.serving the next customer
		//poll()-remove the first or top elements
		System.out.println("Serving:"+s.poll());
		System.out.println("Waiting customer:"+s);
		System.out.println("next customer:"+s.peek());
		System.out.println("remove completed customer:"+s.poll());
		//6.display the size of the waithing customer
		System.out.println(s.size());//it gives size of the queue
		//7.display whether queue is empty or not
		System.out.println(s.isEmpty());//it gives the boolean output
		//8.display the next customer
		System.out.println(s.peek());
	}
	}
