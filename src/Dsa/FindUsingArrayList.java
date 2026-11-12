package Dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class FindUsingArrayList {
	public static void main(String[] args) {
           ArrayList <String> aL=new ArrayList<String>( Arrays.asList("pen","paper","pencil","book"));
           String target="book";
           for(int i=0;i<aL.size();i++) {
        	   if(aL.get(i).equals(target)) {
        		   System.out.println("Found at:"+i);
        		   return;
        	   }
           }
           System.out.println("Not Found........");
	}

}
