package matrix;

public class SearchSorted2DMatrix {

	public static void main(String[] args) {
		int a[][] = { 	{1,3,5,7},
						{10,11,16,20},
						{23,30,34,60},
						};
		int find = 36;
		int m=a.length;
		int n= a[0].length;
		int start=0,end=m*n-1;
		int mid=start+(end-start)/2;
		boolean b=false;
		while(start<end) {
			int element = a[mid/n][mid%n];
			if(element==find) {
				b=true;
				break;
			}
			if(element<find)
				start=mid+1;
			else
				end=mid-1;
			mid=start+(end-start)/2;
		}
		System.out.println(b);
		// TODO Auto-generated method stub

	}

}
