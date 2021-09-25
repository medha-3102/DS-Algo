package searching;

import java.util.Scanner;

public class BinarySearchRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int s=sc.nextInt();
		int l=0,h=a.length-1;
		int index=func(a,s,l,h);
		if(index==-1)
			System.out.println("Not found!");
		else
		System.out.println("Found at pos "+(index+1));
	}
	static int func(int a[],int s,int l,int h) {
		if(l>h)
			return -1;
		int mid=(l+h)/2;
		if(a[mid]==s)
			return mid;
		if(s>a[mid])
			return func(a,s,mid+1,h);
		return func(a,s,l,mid-1);
	}

}
