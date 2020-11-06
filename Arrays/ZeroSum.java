package arrays;

import java.util.Scanner;

public class ZeroSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum+=a[j];
				if(sum==0)
					System.out.println("Subarray ["+i+".."+j+"]");
			}
		}
		
		// TODO Auto-generated method stub

	}

}
