package arrays;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		int a[] = {90,0,3,4};
		/*Arrays.sort(a);
		System.out.println("Min = "+a[0]);
		System.out.println("Max = "+a[a.length-1]);*/
		
		int res = a[0];
		int min=0;
		for(int i=0;i<a.length;i++) {
			min = Math.min(res,a[i]);
		}
		int max=0;
		for(int i=0;i<a.length;i++) {
			max = Math.max(res,a[i]);
		}
		System.out.println("Min = "+min);
		System.out.println("Max = "+max);
		// TODO Auto-generated method stub

	}

}
