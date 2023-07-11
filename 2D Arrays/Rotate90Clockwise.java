package matrix;

public class Rotate90Clockwise {

	public static void main(String[] args) {
		int a[][] = { 	{1,3,5},
						{10,11,16},
						{23,30,34},
				};
		int m  = a.length;
		int n = a[0].length;
		for(int i=0;i<m;i++) {
			for(int j=i+1;j<n;j++) {
				a[i][j]=a[i][j]^a[j][i];
				a[j][i]= a[i][j]^a[j][i];
				a[i][j]=a[i][j]^a[j][i];
			}
		}for(int i=0;i<m;i++) {
			for(int j=n-1;j>=0;j--) {
				System.out.print(a[i][j]+" ");

			}
			System.out.println();
		}
//		for(int i=0;i<m;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		// TODO Auto-generated method stub

	}

}
