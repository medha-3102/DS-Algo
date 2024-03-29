package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KadaneAlgo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Sum = "+maxSumSubarray(a));
		// TODO Auto-generated method stub
	}
	static int maxSumSubarray(int a[]) {
		int maxSum=0;
		int cursum=0;
		for(int i=0;i<a.length;i++) {
			cursum +=a[i];
			if(cursum>maxSum) {
				maxSum=cursum;
			
			}
			if(cursum<0) {
				cursum=0;
			}
		}
		if(maxSum==0) {
			Arrays.sort(a);
			maxSum=a[a.length-1];
		}
		return maxSum;
	}

}
