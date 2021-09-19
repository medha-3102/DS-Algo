package arrays;

import java.util.Scanner;

public class SearchIn2DMatrix {

	public static void main(String[] args) {
		int a[][] = { 	{1,2,7},
						{5,6,10},
						{8,9,11}
					};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		func(a,n);
		// TODO Auto-generated method stub

	}
	static void func(int a[][],int x) {
		int n=a.length;
		int m=a[0].length;
		int i=0,j=m-1;
		int f=0;
		while(i<n && j>=0) {
			if(a[i][j]==x) {
				System.out.println("n Found at "+i+","+j);
				f=1;
			}
			if(a[i][j]>x)
				j--;
			else
				i++;
		}
		if(f==0)
		System.out.println("Element not found.");
	}

}
