package arrays;

import java.util.Scanner;

public class BoyerMooreVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		func(a);

	}
	static void func(int a[]) {
		int ansIndex = 0;
		int count =1;
		for(int i=1;i<a.length;i++) {
			if(a[i] == a[ansIndex]) {
				count++;
			}
			else {
				count--;
			}
			if(count ==0) {
				ansIndex = i;
				count=1;
			}
			
		}
		int c =0;
		for(int i=0;i<a.length;i++) {
			if(a[ansIndex]==a[i])
				c++;
		}
		if(c>a.length/2)
			System.out.println("Element = "+a[ansIndex]);
		else
			System.out.println("No Majority Elemenet");
	}

}
