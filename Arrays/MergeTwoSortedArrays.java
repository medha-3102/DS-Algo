package arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int a[]= {1,3,5,7,33};
		int b[]= {2,4,6,8,9,11};
		for(int i=0;i<b.length;i++) {
			
		if(b[i]<a[a.length-1]) {
			a[a.length-1]=a[a.length-1]^b[i];
			b[i]=a[a.length-1]^b[i];
			a[a.length-1]=a[a.length-1]^b[i];
			Arrays.sort(a);
		}
	
		}
			
		Arrays.sort(b);
		
		System.out.println("First Array: ");
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Second Array: ");
		for(int i:b)
			System.out.print(i+" ");
		// TODO Auto-generated method stub

	}

}
