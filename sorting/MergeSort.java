package sorting;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		merge(a,0,(a.length-1)/2,a.length);
		for(int c:a)
			System.out.println(a);
	}
	static void merge(int a[],int lb,int mid,int ub) {
		int i=lb;
		int j=mid+1;
		int k=ub;
		int b[]=new int[k];
		while(i<=mid&&j<=ub)
		{
			if(a[i]<=a[j]) {
				b[k]=a[i];
				i++;
			}
			else {
				b[k]=a[j];
				j++;
			}
			k++;
		}
		if(i>mid)
		{
			while(j<=ub) {
				b[k]=a[j];
				j++;k++;
				}
		}
		else {
			while(i<=mid)
			{
				b[k]=a[i];
				i++;
				j++;
			}
		}
		for(int c=lb;c<=ub;c++)
			a[c]=b[c];
	}

}
