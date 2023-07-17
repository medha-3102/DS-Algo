package searchingAndSorting;

public class CountSquareRoots {

	public static void main(String[] args) {
		int n=9;
		
		System.out.println(count(n));
		// TODO Auto-generated method stub
	}

	private static int count(int N) {
		if(N<=0)
	        return Integer.MIN_VALUE;
	        int x=(int)Math.sqrt(N);
	        if(Math.sqrt(N)==(int)Math.sqrt(N))
	        return x-1;
	        else
	        return x;
		// TODO Auto-generated method stub
	
	}//O(log N) & O(1)

}
