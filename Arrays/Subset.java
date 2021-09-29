package arrays;

import java.util.HashSet;
import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of Array1:");
		int m=sc.nextInt();
		int a[]=new int[m];
		System.out.println("Enter The elements:");
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter size of Array2:");
		int n=sc.nextInt();
		int b[]=new int[n];
		System.out.println("Enter The elements:");
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
System.out.println(isSubset(a,b,m,n));
	}
	static boolean isSubset(int a[],int b[],int m,int n) {
		HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<m;i++) {
			if(!h.contains(a[i]))
				h.add(a[i]);
		}
		for(int i=0;i<n;i++) {
			if(!h.contains(b[i]))
				return false;
		}
		return true;
		
	}

}
