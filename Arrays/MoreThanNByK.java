package arrays;

import java.util.HashMap;

public class MoreThanNByK {

	public static void main(String[] args) {
		int a[] = {3,2,2,2,3,2,3,2,3,2,1};
		int n=a.length;
		int k = 2;
		HashMap<Integer,Integer> s = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(!s.containsKey(a[i]))
				s.put(a[i], 1);
			else
				s.put(a[i],s.get(a[i])+1);
		}
		
		// TODO Auto-generated method stub

	
	for(int key:s.keySet()) {
		if(s.get(key)>n/k)
			System.out.println(key);
	}
	}

}// O(N),O(N)
