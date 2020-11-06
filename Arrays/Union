package arrays;

import java.util.Scanner;

public class Union {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int a[]=new int[m];
		for(int i=0;i<m;i++)
			a[i]=sc.nextInt();
		int n=sc.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
			b[i]=sc.nextInt();
		int i=0;int j=0;
		while(i<m&&j<n) {
				if(a[i]<b[j])
					System.out.print(a[i++]+" ");
				else if(b[j]<a[i])
					System.out.print(b[j++]+" ");
				else {
					System.out.print(b[j++]+" ");
					i++;
				}
			
		}
			while(i<m)
				System.out.print(a[i++]+" ");
			while(j<n)
				System.out.println(b[j++]+" ");
		// TODO Auto-generated method stub
sc.close();
	}

}
