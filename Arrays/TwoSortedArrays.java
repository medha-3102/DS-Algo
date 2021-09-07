package arrays;

public class TwoSortedArrays {

	public static void main(String[] args) {
		int a[] = {1,4,7,8,10};
		int b[] = {2,3,9};
		int m=a.length;
		int n= b.length;
		func(a,m,b,n);
		// TODO Auto-generated method stub
	}
	static void func(int a[],int m,int b[],int n) {
		for(int i=0;i<m;i++) {
			if(a[i]>b[0]) {
				int temp =a[i];
				a[i] = b[0];
				b[0] = temp;
				int first = b[0];
				int k;
				for(k=1;k<n&& b[k]<first;k++) {
					b[k-1] = b[k];
				}
				b[k-1] = first;
			}
		}
		for(int i=0;i<m;i++)
			System.out.print(a[i]+" ");
		for(int i=0;i<n;i++)
			System.out.print(b[i]+" ");
		
	}

}
