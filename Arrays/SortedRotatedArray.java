package searching;

import java.util.Scanner;

public class SortedRotatedArray {
//modified binary search
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
		int low=0,high=a.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(a[mid]==s) return mid;
			if(a[low]<=a[mid]) {
				if(s>=a[low]&&s<a[mid])
					high=mid-1;
				else
					low=mid+1;
			}else {
			if(s>a[mid]&&s<=a[high])
				low=mid+1;
			else
				high=mid-1;
			}
		}
		return -1;
	}

}
