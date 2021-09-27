package searching;

import java.util.Arrays;
import java.util.Scanner;

public class BookAllocation {

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
		System.out.print("Enter no. of students:");
		int k=sc.nextInt();
		sc.close();
		int result =minPages(a,k);
		System.out.println("Min pages= "+result);
	}
	static int maxOf(int a[]) {
		Arrays.sort(a);
		int max=a[a.length-1];
		return max;
	}
	static int sumOf(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum +=a[i];
		return sum;
	}
	static int minPages(int a[],int k) {
		int min = maxOf(a);
		int max = sumOf(a);
		int res=0;
		while(min<=max) {
			int mid =(min+max)/2;
			if(isFeasible(a,k,mid)) {
				res=mid;
				max=mid-1;
			} else {
				min=mid+1;
			}
		}
		return res;
	}
	static boolean isFeasible(int a[],int k,int res) {
		int student =1,sum =0;
		for(int i=0;i<a.length;i++) {
			if(sum+a[i]>res) {
				student++;
				sum=a[i];
			}else {
				sum+=a[i];
			}
		}
		return student<=k;
	}

}
