package Dsa;

public class Sum {
	public static void main(String[] args) {
		int[]arr= {10,20,30,40};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int avg=sum/arr.length;
		System.out.println(sum);
		System.out.println(avg);
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
