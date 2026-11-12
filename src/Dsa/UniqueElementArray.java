package Dsa;

public class UniqueElementArray {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,1,2,3};
		//boolean [] visited=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			//if(visited[i]) {
			//	continue;
		//	}
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				//	visited[j]=true;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
