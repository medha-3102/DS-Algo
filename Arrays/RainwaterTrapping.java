package arrays;

import java.util.Scanner;

public class RainwaterTrapping {

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
		int left[] = new int[n];
		int right[] = new int[n];
		left[0]= a[0];
		for(int i=1;i<n;i++) {
			left[i]= Math.max(left[i-1], a[i]);
		}
		right[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i] = Math.max(right[i+1],a[i]);
		}
		int ans=0;
		for(int i=0;i<n;i++) {
			ans+=(Math.min(left[i],right[i])-a[i]);
		}
		return ans;
	}

}
