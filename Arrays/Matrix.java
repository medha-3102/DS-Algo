package arrays;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			a[i][j]=sc.nextInt();
		int b[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			b[i][j]=sc.nextInt();
		int x[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				x[i][j]=a[i][j]+b[i][j];
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
