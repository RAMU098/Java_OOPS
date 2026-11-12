package Dsa;

public class ThirdLargest {
	public static void main(String[] args) {
		int []arr= {10,20,30,40,50,60};
		int largest=Integer.MIN_VALUE;
		int secLargest=Integer.MIN_VALUE;
		int thirdLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				thirdLargest=secLargest;
				secLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]<largest && arr[i]>secLargest) {
				thirdLargest=secLargest;
				secLargest=arr[i];
			}
			else if(arr[i]<secLargest && arr[i]<largest && arr[i]>thirdLargest) {
				thirdLargest=arr[i];
			}
		}
		System.out.println(thirdLargest);
	}

}
