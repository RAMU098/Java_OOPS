package Dsa;

public class CountOccurence {
	public static int firstOccurence(int arr[],int target) {
		int left=0;
		int right=arr.length-1;
		int ans=-1;//dont know index location
		//condition
		while(left<=right) {
			//find the mid elements
			int mid=(left+right)/2;
			if(arr[mid]==target) {
				ans=mid;//updating index position
				
				left=mid+1;//going right  //last occurence
			}
			else if(arr[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return ans;
	}
	public static int lastOccurence(int arr[],int target) {
		int left=0;
		int right=arr.length-1;
		int ans=-1;//dont know index location
		//condition
	while(left<=right) {
		//find the mid elements
		int mid=(left+right)/2;
		if(arr[mid]==target) {
			ans=mid;//updating index position
			
			right=mid-1;//going right  //last occurence
		}
		else if(arr[mid]<target) {
			left=mid+1;
		}
		else {
			right=mid-1;
		}
	}
	return ans;
	}
    public static int countOccurence(int arr[],int target) {
    	int first=firstOccurence(arr,target);
    	if(first==-1) {
    		return 0;
    	}
    	int last=lastOccurence(arr,target);
    	return last-first+1;//counting occurence

    }
	public static void main(String[] args) {
		int[]arr= {1,2,2,2,2,2,2,2,3,4};
		int target=2;
		int result=firstOccurence(arr, target);
		System.out.println(result);
	}
	}


