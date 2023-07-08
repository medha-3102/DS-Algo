package arrays;

public class MedianOfTwoSorted {

	 static double median(int[] a, int[] b, int m, int n) {
		 if(m>n)
			 return median(b,a,n,m);
		 int low =0,high = m,medianPos = ((m+n)+1)/2;
		 while(low<=high) {
			 int cut1 = (low+high)>>1;
		 int cut2 = medianPos-cut1;
		 
		 int l1 =(cut1==0)? Integer.MIN_VALUE:a[cut1-1];
		 int l2 =(cut2==0)? Integer.MIN_VALUE:b[cut2-1];
		 int r1 =(cut1==m)? Integer.MAX_VALUE:a[cut1];
		 int r2 =(cut2==n)? Integer.MAX_VALUE:b[cut2];
		 if(l1<=r2 && l2<=r1) {
			 if((m+n)%2!=0)
				 return Math.max(l1, l2);
			 else
				 return(Math.max(l1, l2)+Math.min(r1, r2))/2.0;
		 }
		 else if(l1>r2) high = cut1-1;
		 else low = cut1+1;
		 }
		// TODO Auto-generated method stub
		return 0.0;
	}
	public static void main(String[] args) {
		int a[]= {1,3,8,9,11};
		int b[]= {2,4,6,10};
		int m = a.length;
		int n= b.length;
		System.out.println("Median is: "+median(a,b,m,n));
		//int n=a.length*2;
	
//		int j=0;
//		int arr[] = new int[n]; 
//		for(int i=0;i<n;i++) {
//			if(i<n/2)
//				arr[i]=a[i];
//			if(i>=n/2)
//				arr[i]=b[j++];
//		}
//		Arrays.sort(arr);
//		int mid=(arr.length-1)/2;
//		 System.out.println((arr[mid]+arr[mid+1])/2);
//			
		// TODO Auto-generated method stub

	}


}
