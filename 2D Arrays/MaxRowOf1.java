package matrix;

public class MaxRowOf1 {

	public static void main(String[] args) {
		int a[][] =			{	{0,1,0,1},
								{1,1,0,0},
								{1,0,1,0},
								{0,0,0,1}// TODO Auto-generated method stub
		};
		 int i=0,j=0;
		 int m=a.length,n=a[0].length;
		 int count=0;
		 int max=0;
		while(i<m && j<n) {
			
			if(a[i][j]==1)
			count++;
			if(j==n-1) {
				max=Math.max(max,count);
				j=-1;i++;
				count=0;
			}
			
			j++;
		}
		System.out.println(max);
		
	}

}
