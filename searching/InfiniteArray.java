package searching;

import java.util.Scanner;

public class InfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int s=sc.nextInt();
		int index=func(a,s);
		if(index==-1)
			System.out.println("Not found!");
		else
		System.out.println("Found at pos "+(index+1));
	}
	static int func(int a[],int s) {
		int low=0,high=1;
		while(a[high]<s) {
			low=high;
			high=2*high;
		}
		return binarySearch(a,s,low,high);
	}
	static int binarySearch(int a[],int s,int l,int h) {
		if(l>h)
			return -1;
		int mid=(l+h)/2;
		if(a[mid]==s)
			return mid;
		if(s>a[mid])
			return binarySearch(a,s,mid+1,h);
		return binarySearch(a,s,l,mid-1);
	}


}
