package arrays;

import java.util.Scanner;

public class MajorityElement {
	static class eleCount{
		int e;
		int c;
	};
	static void func(int a[],int n,int k) {
		if(k<2)
			return ;
		eleCount temp[] = new eleCount[k-1];
		for(int i=0;i<k-1;i++) {
			temp[i] = new eleCount();
		}
		for(int i=0;i<k-1;i++) {
			temp[i].c = 0;
		}
		for(int i=0;i<n;i++) {
			int j;
			for(j=0;j<k-1;j++) {
				if(temp[j].e == a[i]) {
					temp[j].c +=1;
					break;
				}
			}
			if(j==k-1) {
				int l;
				for(l=0;l<k-1;l++) {
					if(temp[l].c==0) {
						temp[l].e =a[i];
						temp[l].c =1;
						break;
					}
				}
				if(l==k-1)
					for(l=0;l<k-1;l++)
						temp[l].c -= 1;
			}
		}
	

	for(int i=0;i<k-1;i++) {
		int ac=0;
		for(int j=0;j<n;j++) 
			if(a[j] == temp[i].e)
				ac++;
		if(ac>n/k)
			System.out.println("Number : "+temp[i].e);
	
	}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n :");
		int n = sc.nextInt();
		System.out.print("Enter k :");
		int k = sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		func(a,n,k);
	}


}
