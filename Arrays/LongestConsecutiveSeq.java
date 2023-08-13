package arrays;

import java.util.Arrays;

public class LongestConsecutiveSeq {

	public static void main(String[] args) {
		int a[] = {102,4,100,1,101,3,2,1,1};
//		Arrays.sort(a);
//		int min= a[0];
//		int count=1;
//		int newcount=1;
//		for(int i=1;i<a.length;i++) {
//			if(a[i]==a[i-1])
//				continue;
//			//min=Math.min(min,a[i]);
//			
//				int x=min;
//				x++;
//				if(a[i-1]!=x) {
//					count=Math.max(count, newcount);
//					min=a[i-1];
//					newcount=1;
//				}
//				newcount++;
//		}
//		System.out.print(count);
//		
//	
//		int count=0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				int x=a[i]+1;
//				if(x==a[j])
//					count++;
//					
//			}
//		}
int N=a.length;
		if(N==1)
			System.out.println("1");
			Arrays.sort(a);
		int count =1;
		int max=-1;
		for(int i=0;i<N-1;i++) {
			if(a[i+1]-a[i]==1)
				count++;
			else if(a[i+1]-a[i]==0)
				continue;
			else
				count=1;
			
			max = Math.max(max, count);
		}
		System.out.println(max);
		// TODO Auto-generated method stub
//O(NlogN), O(1)
	}

}
