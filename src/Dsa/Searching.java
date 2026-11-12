package Dsa;

public class Searching {
	public static void main(String[] args) {
		int []arr= {10,20,40,90,25};
		int target=25;
		//for(int i=0;i<arr.length;i++) {
			//if(arr[i]==target) {
			//	System.out.println("arr["+i+"]");
		//	}
		//}
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		System.out.println(index!=-1?"found at:"+index:"not found");
	}

}
