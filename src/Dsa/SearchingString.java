package Dsa;

public class SearchingString {
	public static void main(String[] args) {
		String []arr= {"bahu","bali","deva","sena"};
		String target="deva";
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(target)) {
			index=i;
				break;
		}
		}
		System.out.println(index!=-1?"found at:"+index:"not found");
		//for(int i=0;i<arr.length;i++) {
		//	if(arr[i].equals(target)) {
		//		System.out.println("arr["+i+"]");
	//		}
	//	}
	}
	

}
