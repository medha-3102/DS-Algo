package arrays;

import java.util.Scanner;

public class BoyerMooreAlgo2 {

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
	static void func(int a[],int n) {
		int num1 =-1;
		int num2 = -1;
		int c1 = 0;
		int c2=0;
		for(int i=0;i<n;i++) {
			if(a[i] ==num1)c1++;
			else if(a[i] ==num2)c2++;
			else if(c1==0) {
				num1=a[i];c1=1;
			}
				else if(c2==0) {
					num2=a[i];c2=1;
				}
				else {
					c1--;
					c2--;
				}
		}
		for(int i =0;i<n;i++) {
			if(a[i]==num1)
					c1++;
			if(a[i]==num2)
				c2++;
		}
		if(c1>n/3 && c2>n/3)
			System.out.println(num1+","+num2);
		else if(c1>n/3)
				System.out.println(num1);
		else if(c2>n/3)
			System.out.println(num2);
	}

}
