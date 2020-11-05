package sorting;

import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		//int b[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		countSort(a,n,max);
		for(int i:a)
			System.out.println(i);
		// TODO Auto-generated method stub

	}
	static void countSort(int a[],int n,int k) {
		int count[]=new int[k+1];
		for(int i=0;i<k+1;i++)
			count[i]=0;
		int b[]=new int[n];
		for(int i=0;i<n;i++)
			count[a[i]]++;
		for(int i=1;i<=k;i++)
			count[i]=count[i]+count[i-1];
		for(int i=n-1;i>=0;i--)
			b[--count[a[i]]]=a[i];
		for(int i=0;i<n;i++)
			a[i]=b[i];
		
		
	}

}
