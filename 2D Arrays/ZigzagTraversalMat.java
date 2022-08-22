package twoDArrays;

public class ZigzagTraversalMat {

	public static void main(String[] args) {
		int a[][] =	{ 	{1,2,3,4},	
						{5,6,7,8},
						{9,10,11,12},	
						{13,14,15,16},
						{17,18,19,20}
		};
		int m=5,n=4;
		for(int k=0;k<=m-1;k++) {
			int i=k;
			int j=0;
			while(i>=0&&j<=n-1) {
				System.out.print(a[i][j]);
				i--;
				j++;
			}
			System.out.println();
			
		}
		for(int k=1;k<=n-1;k++) {
			int i=m-1;
			int j=k;
			while(j<=n-1) {
				System.out.print(a[i][j]);
				i--;
				j++;
			}
			System.out.println();
		}
				// TODO Auto-generated method stub

	}

}
