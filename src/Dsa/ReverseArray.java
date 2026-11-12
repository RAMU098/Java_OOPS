package Dsa;

public class ReverseArray {
	public static void main(String[] args) {
		int[]arr= {10,20,30,40};
		//int[]rev=new int[arr];
		for(int i=arr.length-1;i>=0;i--) {
			//System.out.println("arr["+i+"]:"+arr[i]);
			System.out.print(arr[i]+" ");
		}
	}

}
