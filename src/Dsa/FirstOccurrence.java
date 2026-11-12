package Dsa;

public class FirstOccurrence {
	//public static void main(String[] args) {
//		int [] arr= {1,2,3,4,2,3,4,5,6};
//		int target=6;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==target) {
//				System.out.println(i);
//				break;
//			}
//		}
	//}
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
					right=mid-1;//going left
					//left=mid+1;//going right  //last occurence
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
		public static void main(String[] args) {
			int[]arr= {1,2,2,2,2,2,2,2,3,4};
			int target=2;
			int result=firstOccurence(arr, target);
			System.out.println(result);
		}
		}
	


