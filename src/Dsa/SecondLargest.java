package Dsa;

public class SecondLargest {
	public static void main(String[] args) {
		int []arr= {10,20,30,40};
		int largest=arr[0];
		int secondLargest=-999;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			else if(secondLargest<largest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);
	}

}
