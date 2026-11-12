package Dsa;

public class SearchLowerBoundIndex {
	public static int searchIndex(int arr[],int target) {
		int left=0;
		int right=arr.length-1;
		int ans=-1;
		while(left<=right) {
			//find the mid
			int mid=(left+right)/2;
			if(arr[mid]>=target) {
				ans=mid;
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,5,6};
		int target=2;
		int result=searchIndex(arr,target);
		System.out.println("Insert Position:"+result);
	}

}
