package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallLarge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		int k=3;
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
		Arrays.sort(a);
		System.out.println("Kth smallest elemenet:"+a[k-1]);
		System.out.println("Kth largest elemenet:"+a[n-k]);
		}

}
