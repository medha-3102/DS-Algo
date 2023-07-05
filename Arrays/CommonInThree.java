package arrays;

public class CommonInThree {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,8};
		int b[] = {3,8,10,11};
		int c[] = {1,3,8,11};
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length && k<c.length) {
			if(a[i]==b[j] && b[j]==c[k]) {
				System.out.print(a[i]+" ");
				i++;
				j++;
				k++;
			}
			else if(a[i]<b[j])
				i++;
			else if(a[i]>b[j])
				j++;
			else
				k++;
			
		}//O(m1+m2+m3)
		
		// TODO Auto-generated method stub

	}

}
