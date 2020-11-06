package arrays;

import java.util.Scanner;

public class WithoutSorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		int d[]=new int[n];
		int x=0;int y=0;int z=0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==0) {
				b[x++]=0;
			}
			else if(a[i]==1) {
				c[y++]=1;
			}
			else
				d[z++]=2;
		}
		for(int i=0;i<x;i++) {
			System.out.print(b[i]+" ");
		}
for(int i=0;i<y;i++) {
			System.out.print(c[i]+" ");
		}
for(int i=0;i<z;i++) {
	System.out.print(d[i]+" ");
}
		// TODO Auto-generated method stub

	}

}
