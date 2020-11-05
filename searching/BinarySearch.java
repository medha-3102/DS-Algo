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
		int f=0;
		int l=n-1;
		int mid=(f+l)/2;
		while(f<=l) {
			if(a[mid]<s)
				f=mid+1;
			else if(a[mid]==s) {
				System.out.println(mid+1);
			break;
			}
			else {
				l=mid-1;
			}
			mid=(f+l)/2;
			// TODO Auto-generated method stub
		}
		if(f>l)
			System.out.println("Element is'nt found");
		

	}

}
