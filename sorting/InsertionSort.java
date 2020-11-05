package sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();	
		for(int j=1;j<n;j++){
			int key=a[j];
			int i=j-1;
			while(i>=0&&a[i]>key) {
				a[i+1]=a[i];
				i--;
			}
			a[i+1]=key;
		}
		for(int i:a)
			System.out.println(i);
		// TODO Auto-generated method stub

	}

}
