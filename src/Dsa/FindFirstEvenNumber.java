package Dsa;

public class FindFirstEvenNumber {
	public static void main(String[] args) {
		int [] arr= {1,3,7,9,8,5,4};
		//for(int i=0;i<arr.length;i++) {
		for(int num:arr) {
			if(num%2==0) {
				System.out.println(num);
				break;
			}
		}
	}

}
