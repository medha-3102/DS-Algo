package arrays;

import java.util.Scanner;

public class MaxSubarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int max=a[0];
		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum+=a[j];
				if(sum>max)
					max=sum;
			
		}
			
		
		// TODO Auto-generated method stub

	}
		System.out.print(max);

		// TODO Auto-generated method stub

	}

}
