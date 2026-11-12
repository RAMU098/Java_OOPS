package Dsa;

public class CopyArray {
	public static void main(String[] args) {
		int []arr= {10,20,30,40};
		int[]cArray=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			cArray[i]=arr[i];
			System.out.println("cArr["+i+"]:"+cArray[i]);
		}
	}

}
