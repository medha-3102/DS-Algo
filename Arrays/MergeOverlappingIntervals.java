package arrays;

import java.util.*;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		int a[][]= {	{1,3},
						{8,10},
						{2,6},
						{9,9},
						{15,18}			};
			int res[][] =merge(a);
			for(int i=0;i<res.length;i++) {
				System.out.print("{");
				for(int j=0;j<2;j++)
			System.out.print(res[i][j]+" ");
				System.out.print("}");
			}
			
		// TODO Auto-generated method stub

	}
	public static int [][] merge(int intervals[][]){
		List<int[]> res = new ArrayList<>();
		
		if(intervals.length == 0 || intervals==null )
			return res.toArray(new int [0][]);
		Arrays.sort(intervals,(a,b)->a[0]-b[0]);
		int start = intervals[0][0];
		int end = intervals[0][1];
		for(int i[] : intervals) {
			if(i[0] <= end) {
				end = Math.max(end, i[1]);
			}
			else {
				res.add(new int[] {start,end});
				start = i[0];
				end = i[1];
			}
		}
		res.add(new int[] {start,end});
		return res.toArray(new int[0][]);
	}

}
