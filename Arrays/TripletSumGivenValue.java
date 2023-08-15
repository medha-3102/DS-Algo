package arrays;

import java.util.Arrays;

public class TripletSumGivenValue {

	public static void main(String[] args) {
		int a[] = {30,6,29,8,1};
		int sum =60;//{1,6,8,29,30}
		Arrays.sort(a);
		boolean ans =false;
		int n = a.length;
		for(int i=0;i<n-2;i++) {
			int l=i+1;
			int h=n-1;
			while(l<h) {
				if(a[i]+a[l]+a[h]==sum) {
					ans =true;
					break;
				}else if(a[i]+a[l]+a[h]<sum)
					l++;
				else
					h--;
					
			}
		}
		System.out.println(ans);
		// TODO Auto-generated method stub

	}//O(N*N),O(1)

}
