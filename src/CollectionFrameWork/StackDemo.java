package CollectionFrameWork;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		//Create a stack object
		Stack<String> s=new Stack<>();
		//we can allows only string type
		//s.push(20);
		s.push("Ramu");
		s.push("Tharun");
		s.push("Raju");
		s.push("Ramu");                //allows duplicates also
		System.out.println(s);
		//using for loop
		System.out.println("Before pop");
		for(String e:s) {
			System.out.println(e);
		}
		s.pop();
		System.out.println("Pop ele:"+s.pop());
		System.out.println("After pop");
		//System.out.println(s);
		for(String e:s) {
			System.out.println(e);
		}
		System.out.println("After peek");
		System.out.println("Peeked ele:"+s.peek());
	}

}
