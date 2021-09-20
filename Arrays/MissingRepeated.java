package arrays;

import java.util.Scanner;

public class MissingRepeated {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
		func(a,n);
		// TODO Auto-generated method stub
	}
	static void func(int a[],int n) {
		int xor;
		int setBit;
		int i,x=0,y=0;
		xor=a[0];
		for(i=1;i<n;i++)
			xor = xor^a[i];
		for(i=1;i<=n;i++)
			xor = xor^i;
		setBit = xor & ~(xor-1);
		for(i=0;i<n;i++) {
			if((a[i]& setBit)!=0)
				x=x^a[i];
			else
				y=y^a[i];
		}
		for(i=1;i<=n;i++) {
			if((i& setBit)!=0)
				x=x^i;
			else
				y=y^i;
		}
		System.out.println("Missing No. = "+x);
		System.out.println("Repeating No. = "+y);
		
	}

}
