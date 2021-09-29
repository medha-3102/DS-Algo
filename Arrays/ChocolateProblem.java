package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter The elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter no. of students:");
		int k=sc.nextInt();
		sc.close();
		System.out.println(find(a,n,k));
	}
	static int find(int a[],int n,int m) {
		int ans=Integer.MAX_VALUE;
		Arrays.sort(a);
		for(int i=0;i<=n-m;i++) {
			int minw=a[i];
			int maxw = a[i+m-1];
			int gap = maxw-minw;
			if(gap<ans) {
				ans=gap;
			}
		}
		return ans;
	}

}
