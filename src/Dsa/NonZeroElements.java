package Dsa;

public class NonZeroElements {
	public static void main(String[] args) {
		int [] arr= {1,0,2,3,0,4,0};
		//for(int i=0;i<arr.length;i++) {
			//for(int j=i+1;j<arr.length;j++) {
			//	if(arr[i]==0 && arr[j]!=0) {
				//	int temp=arr[i];
				//	arr[i]=arr[j];
				//	arr[j]=temp;
				//}
			//}
		//}
			//for(int a:arr) {
			//	System.out.println(a);
			//
		//}
		int j=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[j--]=arr[i];
			}
		}
		while(j>=0) {
			arr[j--]=0;
		}
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
