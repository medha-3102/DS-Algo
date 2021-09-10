package arrays;

import java.util.Scanner;

public class BuyAndSellStocks {

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
	static void func(int[] prices) {
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<minprice)
				minprice = prices[i];
			else if(prices[i]-minprice>maxprofit)
				maxprofit = prices[i]- minprice;
		}
		System.out.println(maxprofit);
	}

}
