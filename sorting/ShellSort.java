package sorting;

import java.util.Scanner;

public class ShellSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int gap=n/2;gap>=1;gap=gap/2)
		{
			for(int j=gap;j<n;j++) {
				for(int i=j-gap;i>=0;i=i-gap) {
					if(a[i+gap]>a[i])
						break;
					else
					{
						int temp=a[i];
						a[i]=a[i+gap];
						a[i+gap]=temp;
					}
					
				}
			}
		}
		for(int i:a)
			System.out.println(i);
		// TODO Auto-generated method stub

	}

}
