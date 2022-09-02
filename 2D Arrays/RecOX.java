package twoDArrays;

public class RecOX {

	public static void main(String[] args) { // T = O(m*n) S= O(m*n)
		fillOX(5,6);
		// TODO Auto-generated method stub

	}
	static void fillOX(int m, int n) {
		int i,k =0,l=0;
		int r=m,c=n;
		char a[][]= new char[m][n];
		char x ='X';
		while(k<m&& l<n) {
			for(i=l;i<n;++i)
				a[k][i]=x;
			k++;
			for(i=k;i<m;++i) 
				a[i][n-1]=x;
				n--;
				if(k<m)
				{
					for(i=n-1;i>=l;--i)
						a[m-1][i]=x;
					m--;
				}
				if(l<n) {
					for(i=m-1;i>=k;--i)
						a[i][l]=x;
					l++;
				}
				x=(x=='O')?'X':'O';
				
			}
			for( i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		
}
