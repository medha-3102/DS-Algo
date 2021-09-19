package arrays;

import java.util.Scanner;

public class SearchIn2DMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { 	{1,2,5},
						{7,9,10},
						{11,13,30}
			};
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.close();
	System.out.println(func(a,n));

	}
	static boolean func(int[][] matrix,int target) {
		if(matrix.length ==0) return false;
		int n= matrix.length;
		int m = matrix[0].length;
		int lo = 0;
		int hi =(n*m)-1;
		while(lo<=hi) {
			int mid = (lo+(hi-lo)/2);
			if(matrix[mid/m][mid%m]== target) {
				return true;
			}
			if(matrix[mid/m][mid%m]<target) {
				lo=mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		return false;
	}

}
