package Dsa;

public class MissingEle {
	public static void main(String[] args) {
		int[] arr= {0,1,3};
		int n=arr.length;
	//	int expected=n*(n+1)/2;
		int expected=0;
		for(int i=0;i<=n;i++) {
			expected=expected+i;
		}
		int actual=0;
		for(int x:arr) {
			 actual+=x;
		}
		int missing=expected-actual;
		System.out.println(missing);
	}

}
