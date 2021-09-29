package searching;

import java.util.Scanner;

public class MedianTwosorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array1:");
		int m=sc.nextInt();
		int a[]=new int[m];
		System.out.println("Enter The elements:");
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter size of Array2:");
		int n=sc.nextInt();
		int b[]=new int[n];
		System.out.println("Enter The elements:");
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println(findMedianSortedArrays(a,b));

	}

	static double findMedianSortedArrays(int a[],int b[]) {
		if(b.length<a.length) return findMedianSortedArrays( b,a);
		int m=a.length;
		int n=b.length;
		int low=0,high=m;
		while(low<=high) {
			int cut1 = (low+high)>>1;
		int cut2 = (m+n+1)/2-cut1;
		int left1 = cut1==0? Integer.MIN_VALUE : a[cut1-1];
		int left2 = cut2 ==0?Integer.MIN_VALUE :b[cut2-1];
		
		int right1 =cut1==m? Integer.MAX_VALUE:a[cut1];
		int right2 = cut2 ==n?Integer.MAX_VALUE:b[cut2];
		if(left1<=right2 && left2 <=right1) {
			if((m+n)%2==0)
				return(Math.max(left1, left2)+Math.min(right1, right2))/2.0;
			else 
				return Math.max(left1, left2);
		}
		else if(left1>right2) {
			high = cut1-1;
		}
		else {
			low=cut1+1;
		}
		}
		return 0.0;
	}
}
