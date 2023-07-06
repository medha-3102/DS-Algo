package arrays;

import java.util.HashSet;
import java.util.Set;

public class SubarraySumZero {

	public static void main(String[] args) {
		int a[] = {1,2,6,-2,1,-2,-4};
		int sum=0;
		boolean zero=false;
		Set<Integer> n= new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
			if(a[i]==0||sum==0||n.contains(sum)) {
				zero=true;
				break;
			}
			n.add(sum);
		}
		System.out.println(zero);
		// TODO Auto-generated method stub

	}

}
