package arrays;

import java.util.Scanner;

public class MatricesMultiply {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();int n=sc.nextInt();int p=sc.nextInt();int q=sc.nextInt();
		sc.close();
		if(n!=p)
			System.out.println("Matrix can't mutiply");
		else {
			int a[][]=new int[m][n];
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
			
			int b[][]=new int[m][n];
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
				b[i][j]=sc.nextInt();
			int x[][]=new int[p][q];
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++) {
					x[i][j]=0;
					for(int k=0;k<n;k++) {
						x[i][j]+=a[i][k]*b[k][j];
					}
				}
			}
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++) {
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
			}
				}

		}
		// TODO Auto-generated method stub

	}


