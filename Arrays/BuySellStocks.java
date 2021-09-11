package arrays;

import java.util.Scanner;

public class BuySellStocks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		func(a);
		// TODO Auto-generated method stub

	}
	static void func(int a[]) {
		int profit = 0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[i-1])
				profit += (a[i]-a[i-1]);
		}
		System.out.println(profit);
	}
}
