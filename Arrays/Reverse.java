package arrays;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		int n = sc.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		for(int i=n-1;i>=0;i--)
		System.out.println(a[i]);*/
		
		
		
		int a[] = {1,2,3,4};
		for(int i =0;i<a.length/2;i++) {
			a[i]= a[i] ^ a[a.length-i-1];
			a[a.length-i-1] =a[i] ^ a[a.length-i-1];;
			a[i]= a[i] ^ a[a.length-i-1];
			
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
	//It also has a reverse method in collections interface
	}

}
