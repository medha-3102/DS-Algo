package twoDArrays;

public class SetMatrixZeros {// T.C = O2(m*n)	S.C = O(1)

	public static void main(String[] args) {
		int a[][] =	{ 	{1,0,3,4},	
						{5,6,7,8},
						{9,10,11,0}};
		int r=3,c=4;
		// TODO Auto-generated method stub
		int col0=1;
		for(int i=0;i<r;i++) {
			if(a[i][0]==0) col0=0;
			for(int j=1;j<c;j++) {
				if(a[i][j]==0)
					a[i][0]=a[0][j]=0;
			}
		}
			for(int i=r-1;i>=0;i--) {
				for(int j=c-1;j>=1;j--)
					if(a[i][0]==0||a[0][j]==0)
						a[i][j]=0;
				if(col0==0)a[i][0]=0;
			}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
