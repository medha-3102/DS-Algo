package arrays;

import java.util.*;

public class RowMax1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int b=0;int c=0;int d=0;
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(a[i][j]==1&&i==0)
						b++;
					if(a[i][j]==1&&i==1)
						c++;
					if(a[i][j]==1&&i==2)
						d++;
				}
			}
			int e=(b>c)?(b>d?0:2):(c>d?1:2);
			System.out.println(e);
		// TODO Auto-generated method stub

	}

}
