package searchingAndSorting;

public class FirstAndLastPos {
public static int firstLast(int a[],int find,boolean b) {

	int low=0,high=a.length-1;
	int ans=-1;
	while(low<=high) {
		int mid= low+(high-low)/2;
		if(a[mid]<find)
			low=mid+1;
		else if(a[mid]>find)
			high=mid-1;
		else {
			ans=mid;
			if(b)
				high=mid-1;
			else
				low=mid+1;
		}	
	}
	return ans;//O(log N) & O(1)
}
	
	public static void main(String[] args) {
		int a[] = {1,2,2,7,7,7,7,8,9};
		int find = 2;
		int ans[]= {-1,-1};
		ans[0]=firstLast(a,find,true);
		if(ans[0]!=-1)
			ans[1]=firstLast(a,find,false);
		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==find) {
//				f=i;
//				break;
//			}
//		
//		}
//		for(int i=a.length-1;i>=0;i--) {
//			if(a[i]==find) {
//				l=i;
//				break;
//			}
//		O(N) & O(1)
//		}
		
		System.out.print("First: "+ans[0]+" Last:"+ans[1]);
		
		// TODO Auto-generated method stub

	}

}
