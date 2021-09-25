package searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
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
		static int func(int a[],int s){
			int l=0,h=a.length-1;
			while(l<=h) {
				int mid=(l+h)/2;
				if(a[mid] == s) {
					return mid;
				}
				else if(s>a[mid]) {
					l=mid+1;
				}
				else {
					h=mid+1;
				}
			}
			return -1;
		}

}
