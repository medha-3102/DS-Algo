package arrays;

import java.util.Scanner;

public class RainwaterTrapping2 {// Time - O(N), Space - O(1)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter The elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(rainWater(a,n));
	}
	static int rainWater(int a[],int n) {
		
		int left =0, right=n-1;
		int res=0;
		int maxleft =0,maxright =0;
		while(left<=right) {
			if(a[left]<=a[right]) {
			if(a[left]>=maxleft)
				maxleft=a[left];
			else
				res+=maxleft-a[left];
			left++;
			}else {
				if(a[right]>=maxright)
					maxright=a[right];
				else
					res+=maxright-a[right];
				right--;
			}
			
		}
		return res;
	}

}
