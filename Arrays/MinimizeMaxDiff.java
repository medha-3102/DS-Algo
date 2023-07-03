package arrays;

import java.util.Arrays;

public class MinimizeMaxDiff {

	public static void main(String[] args) {
		int a[] = {1,15,10};
		int k=6;
		Arrays.sort(a);
		int ans=a[a.length-1]-a[0];
		int tmin,tmax;
		tmin=a[0];
		tmax=a[a.length-1];
		for(int i=1;i<a.length;i++) {
			if(a[i]-k<0)
				continue;
		tmin=Math.min(a[0]+k, a[i]-k);
		tmax = Math.max(a[i-1]+k,a[a.length-1]-k);
		ans = Math.min(ans, tmax-tmin);
		}
			System.out.println(ans);
		// TODO Auto-generated method stub

	}

}
