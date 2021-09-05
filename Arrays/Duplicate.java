package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Element = "+findDuplicate(a));
		// TODO Auto-generated method stub

	}
	static int findDuplicate(int a[]) {
		int slow = a[0];
		int fast = a[0];
		do {
			slow = a[slow];
			fast = a[a[fast]];
		}while(slow!=fast);
		fast =a[0];
		while(slow!=fast) {
			slow = a[slow];
			fast = a[fast];
		}
		
		return slow;
	}

}
