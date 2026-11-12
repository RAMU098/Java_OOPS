package Dsa;

public class FindNameBs {
	public static void main(String[] args) {
		String names[]= {"avatar","bahubali","cockpit","durandhar","evildead"};
		String target="evildead";
		int low=0;
		int high=names.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			int cmp=names[mid].compareTo(target);
			if(cmp==0) {
				System.out.println("found elw:"+mid);
				return;
			}
			else if(cmp>0) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		System.out.println("not found");
	}

}
