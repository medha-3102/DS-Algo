package arrays;

public class CyclicallyRotateByOne {

	public static void main(String[] args) {
		int a[] = {1,3,4,2,6};
		int temp=a[a.length-1];
		
		for(int i=a.length-1;i>0;i--) {
			
			a[i]=a[i-1];
			
		}
		a[0]=temp;
		for(int i:a)
		System.out.print(i+" ");
		// TODO Auto-generated method stub

	}

}
