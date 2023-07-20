package matrix;

import java.util.*;

public class CommonEleInRows {

	public static void main(String[] args) {
		int a[][] = {	{7,6,9},
						{8,7,6},
						{6,3,7}			
};
		HashMap<Integer,Integer> map = new HashMap<>();
		int m = a.length;
		int n = a[0].length;
		for(int j=0;j<n;j++)
			map.put(a[0][j],1);
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(map.get(a[i][j]) !=null && map.get(a[i][j])==i) {
					map.put(a[i][j],i+1);
					if(i==m-1)
						System.out.print(a[i][j]+" ");
				}
			}
		}
		
		// TODO Auto-generated method stub

	}// O(m*n) , O(N)

}
