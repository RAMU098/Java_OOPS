package Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(56);
		al.add(46);
		al.add(66);
		al.add(76);
		al.add(95);
		System.out.println(al);
		//even numbers
		List<Integer> evenNumbers=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even num:"+evenNumbers);
		//update the marks
		List<Integer> updateMarks=al.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updateMarks);
		
		//failed Students
		long failStu=al.stream().filter(i->i>35).count();
		System.out.println("Failure Students:"+failStu);
		
		
		//distinct data
		al.stream().distinct().forEach(System.out::println);
		
		
		//print only first 3 marks
		List<Integer> firstthree=al.stream().limit(3).collect(Collectors.toList());
		System.out.println(firstthree);
		
		
		
		//skip first 3
		List<Integer> afterThree=al.stream().skip(3).collect(Collectors.toList());
		System.out.println(afterThree);
		
		
		//Sorted order
		List<Integer> sortedData=al.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedData);
		
		List<Integer> customSort=al.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(customSort);
		
	}

}
