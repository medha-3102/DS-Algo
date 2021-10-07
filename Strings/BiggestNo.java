package strings;

import java.util.Arrays;

public class BiggestNo {

	public static void main(String[] args) {
		String s="6579754";
		 char c[]=s.toCharArray();
		Arrays.sort(c);
		char t;
		int n=c.length;
		for(int i=0;i<n/2;i++) {
			t=c[i];
			c[i]=c[n-i-1];
			c[n-i-1]=t;
		}
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]);
		// TODO Auto-generated method stub

	}

}
