package Dsa;

public class CompareArrays {
	public static void main(String[] args) {
		//comparing the arrays using length and values
		int a[]= {10,20,30};
		int b[]= {10,20,30};
		boolean equal=true;
		if(a.length!=b.length) {
			equal=false;
		}
		else {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					equal=false;
					break;
				}
			}
		}
		System.out.println(equal);
	
	}

}
