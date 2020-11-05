package sorting;

import java.util.Scanner;

public class HeapSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		//int b[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=(n/2)-1;i>=0;i--) 		
		heapify(a,n,i);
		for(int i=n-1;i>=0;i--) {
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			heapify(a,i,0);
		}
		for(int c:a)
			System.out.print(c);

	}

	static void heapify(int[] a, int n, int i) {
		
			int largest=i;
			int l=2*i+1;
			int r=2*i+2;
			while(l<n&&a[l]>a[largest])
				largest=l;
			while(r<n&&a[r]>a[largest])
				largest=r;
			if(largest !=i)
			{
				int temp=a[i];
				a[i]=a[largest];
				a[largest]=temp;	
				heapify(a,n,largest);
				}
		// TODO Auto-generated method stub
				
	}
	

}
