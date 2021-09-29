package searching;

import java.util.Arrays;
import java.util.Scanner;

public class AggresiveCows {

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
		System.out.print("Enter no. of cows:");
		int c=sc.nextInt();
		sc.close();
		Arrays.sort(a);
		int low=1,high=a[n-1]-a[0];
		while(low<=high) {
			int mid = (low+high)>>1;
		if(isPossible(a,n,c,mid)) {
			low = mid+1;
		}else {
			high = mid-1;
		}
		}
		System.out.println(high);
	}
	static boolean isPossible(int a[],int n,int cows,int min) {
		int count =1;
		int lastPlacedCow =a[0];
		for(int i=1;i<n;i++) {
			if(a[i]-lastPlacedCow>=min) {
				count++;
				lastPlacedCow = a[i];
			}
		}
		if(count >=cows)
			return true;
		else
		return false;
	}

}
