package arrays;

import java.util.Scanner;

public class CyclicallyRotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int x=1;
		int b[]=new int[n];
		b[0]=a[n-1];
		for(int i=0;i<n-1;i++)
		{
			b[x++]=a[i];
		}
		for(int i:b)
			System.out.print(i+" ");
		
	}

}
