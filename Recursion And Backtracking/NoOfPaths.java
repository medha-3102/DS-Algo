package recursionBacktracking;

import java.util.Scanner;

public class NoOfPaths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		System.out.println(count(m,n));
		// TODO Auto-generated method stub

	}
	static int count(int m,int n) {
		if(m==1||n==1)
			return 1;
		return count(m-1,n)+count(m,n-1);
	}

}
