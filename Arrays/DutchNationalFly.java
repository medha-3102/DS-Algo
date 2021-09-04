package arrays;

import java.util.Scanner;

public class DutchNationalFly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		func(a,n);
	}
	static void func(int[] a,int n) {
		int low=0;
		int high = n-1;
		int mid = 0;
		int temp;
		while(mid<=high) {
			switch(a[mid]) {
			case 0: {
				temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = a[mid];
				a[mid] = a[high];
				a[high] =temp;
				high--;
				break;
			}
			}
		}
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
	}

}
