package sorting;

import java.util.Scanner;

public class RadixOrBucketSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		radixSort(a,n);
		for(int i:a)
			System.out.print(i+" ");
	}
	static int getmax(int a[],int n){
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;

	}
	static void radixSort(int a[],int n) {
		int max=getmax(a,n);
		for(int pos=1;max/pos>0;pos*=10)
			countSort(a,n,pos,max);
	}
	static void countSort(int a[],int n,int pos,int max) {
	int count[]=new int[max+1];
	int b[]=new int[n];
	for(int i=0;i<n;i++)
		++count[(a[i]/pos)%10];
	for(int i=1;i<=max;i++)
		count[i]=count[i]+count[i-1];
	for(int i=n-1;i>=0;i--)
		b[--count[(a[i]/pos)%10]]=a[i];
	for(int i=0;i<n;i++)
		a[i]=b[i];
	}

}
