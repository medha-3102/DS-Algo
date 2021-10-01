package arrays;

import java.util.Scanner;

public class PascalRow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nthRow(n);
		// TODO Auto-generated method stub
	}
	static void nthRow(int n) {
		int prev =1;
		System.out.print(prev);
		for(int i=1;i<=n;i++) {
			int cur =(prev*(n-i+1))/i;
			System.out.print(","+cur);
			prev = cur;
		}
	}

}
