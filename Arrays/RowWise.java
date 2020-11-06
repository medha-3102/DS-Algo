package arrays;

//import java.util.Arrays;
import java.util.Scanner;

public class RowWise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			a[i][j]=sc.nextInt();
		//java.util.Arrays.sort(a,new java.util.Comparator<int[]>() {
		for(int i=0;i<m-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[i][j]>a[i+1][j+1]) {
				int x= a[i][j];
				a[i+1][j+1]=x;
				a[i][j]=a[i+1][j+1];
				}
				
			}
		}
		int x=(m-1)/2;
		int y=(n-1)/2;
		System.out.println(a[x][y]);
		
		// TODO Auto-generated method stub

	}

}
