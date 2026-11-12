package Dsa;

public class FindFloor {
	public static int floorNum(int arr[],int target) {
		int left =0;
		int right=arr.length-1;
		int ans=-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]<=target) {
				ans=arr[mid];
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10};
		int target=7;
		int result=floorNum(arr, target);
		if(result!=-1) {
			System.out.println(result);
		}else {
			System.out.println("Not Found");
		}
	}

}
