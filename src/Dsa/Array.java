package Dsa;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int []arr= {20,40,60,26};
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] :"+arr[i]);
		}
	//	int []arr1=new int[arr.length+1];
	//	for(int i=0;i<2;i++) {
	//		arr1[i]=arr[i];
	//	}
	//	arr1[2]=25;
	//	for(int i=3;i<=arr.length;i++) {
	//		arr1[i]=arr[i-1];
	//	}
	//	System.out.println(Arrays.toString(arr1));
		int value=25;
		int pos=3;
		int[] newarr=new int[arr.length+1];
		for(int i=0;i<pos;i++) {
			newarr[i]=arr[i];
		}
		//insert at pos
		newarr[pos]=value;
		//coping remaining elements
		for(int i=pos;i<arr.length;i++) {
			newarr[i+1]=arr[i];
		}
		System.out.println(Arrays.toString(newarr));
		
		int newArr[]=new int[newarr.length-1];
		for(int i=0;i<pos;i++) {
			newArr[i]=arr[i];
		}
		for(int i=pos;i<newArr.length;i++) {
			newArr[i]=newarr[i+1];
		}
		System.out.println(Arrays.toString(newArr));
	}

}
