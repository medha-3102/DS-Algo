package matrix;

public class MedianOfRowSorted {

	public static void main(String[] args) {
		int a[][] = { 	{1,3,8},
						{2,3,4},
						{1,2,5},
		};
		int low =1,high=1000000000;
		int m= a.length,n=a[0].length;
	while(low<=high) {
		int mid =(low+high)>>1;
	int cnt =0;
	for(int i=0;i<m;i++) {
		cnt +=countMid(a[i],mid,n);
	}
	if(cnt<=(m*n)/2)
		low = mid+1;
	else
		high=mid-1;
}
	System.out.print(low);
	}

 static int countMid(int[] a, int mid, int col) {
		int l=0,h=col-1;
		while(l<=h) {
			int md = (l+h)>>1;
		if(a[md]<=mid) {
			l=md+1;
		}
		else {
			h=md-1;
		}
		}
		// TODO Auto-generated method stub
		return l;
	}

}
