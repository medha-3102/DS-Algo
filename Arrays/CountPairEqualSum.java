package arrays;

import java.util.*;

public class CountPairEqualSum {
	
	static void subarraySum(int a[],int sum) {
		int count=0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			
			if(map.containsKey(sum-a[i])) {
				count +=map.get(sum-a[i]);
			}
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else{
				map.put(a[i], 1);
			}
		}
			System.out.println(count);
			
		}
		

	public static void main(String[] args) {
		int a[]= {1,1,1,1};
		int sum=2;
		subarraySum(a,sum);
		// TODO Auto-generated method stub

	}

}
