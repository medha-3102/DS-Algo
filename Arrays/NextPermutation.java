package arrays;

public class NextPermutation {

	public static void main(String[] args) {
		int a[]  =  {1,2,3,4,5,7,6};
		int n= a.length;
		int j=-1;boolean b=true;
		
		for(int i=1;i<a.length;i++) {
			if(a[i-1]!=i) {
				b=false;
				break;
			}
		}
		
		if(!b) {
		for(int i=n-1;i>0;i--) {
			
			if(a[i]>a[i-1] ) {
				j=i-1;
				break;
			}
				
		}
		
		}
		if(j>=0) {
	for(int i=n-1;i>j;i--) {
			
			if(a[i]>a[j]) {
				a[i]  = a[i]^a[j];
				a[j]  = a[i]^a[j];
				a[i]  = a[i]^a[j];
				break;
		}
		
		}
		}
		for(int i=0;i<=j;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=n-1;i>j;i--) {
			System.out.print(a[i]+" ");
		}
		
		// TODO Auto-generated method stub

	}

}
