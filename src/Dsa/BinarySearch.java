package Dsa;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int [] arr= {10,20,30,50,60,70};
		//Arrays.sort(arr);
		//for(int i=0;i<=arr.length;i++) {
		//	for(int j=i+1;j<arr.length;j++) {
		//		int temp=arr[j];
		//		arr[j]=arr[i];
		//		arr[i]=temp;
		//	}
	//	}
	//	System.out.println(Arrays.toString(arr));
		int target=20;
		int low=0,high=arr.length-1;
		while(low<=high) {
		int mid=(low+high)/2;
			if(arr[mid]==target) {
				System.out.println("found at:arr["+mid+"]");
				return;
			}
			else if(target<arr[mid]) {
				high=mid-1;
			}
			else if(target>arr[mid]) {
				low=mid+1;
			}
		}
	}

}
