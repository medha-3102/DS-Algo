package searching;

import java.util.Scanner;

public class NthRoot {
	static double multiply(double number,int n) {
		double ans =1.0;
		for(int i=1;i<=n;i++) {
			ans *=number;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m=sc.nextInt();
		getNthRoot(n,m);
		
		// TODO Auto-generated method stub
	}
	static void getNthRoot(int n,int m) {
		double low=1;
		double high=m;
		double eps= 1e-6;
		while((high-low)>eps) {
			double mid = (low+high)/2.0;
			if(multiply(mid,n)<m) {
				low=mid;
			} else {
				high=mid;
			}
		}
		System.out.println(high);
	}
}
