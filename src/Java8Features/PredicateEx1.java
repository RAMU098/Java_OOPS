package Java8Features;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateEx1 {
public static void main(String[] args) {
	                   //Predicate use only when conditions are there
	Predicate<Integer> p=i->i%2==0;
	System.out.println(p.test(44));//output is boolean
	System.out.println(p.test(33));
	
	
	
	String[] names= {"ramu","raju","raj"};
	Predicate<String> p1=s->s.length()>3;
	for(String s1:names) {
		if(p1.test(s1)) {
		System.out.println(s1);
	}}
                                                      	//function:input,output type
	Function<Integer,Integer> f=i->i*i;
	System.out.println(f.apply(3));
	Function<String,Integer> f1=st->st.length();
	System.out.println(f1.apply("Ramu"));
	
	Function<String,String> f2=st1->st1.toUpperCase();
	System.out.println(f2.apply("ramu"));
	
	//Consumer:-->print data
	Consumer<String> c=a->System.out.println(a);
	c.accept("Ramu");
	c.accept("deva");
	
	
	//Supplier: will accept only objects
	Supplier<Date> s=()->new Date();
	System.out.println(s.get());
	 Supplier<String> str4=()->{
		 String otp="";
		 for(int i=0;i<6;i++) {
			 otp=otp+(int)(Math.random()*10);
		 }
		 return otp;
	 };
	 System.out.println(str4.get()); 

}
}
