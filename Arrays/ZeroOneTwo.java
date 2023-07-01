package arrays;

public class ZeroOneTwo {

	public static void main(String[] args) {
		int a[] = {1,0,2,0,0,1,2,2,0};
		int count0=0;
		int count1=0;
		int count2=0;
		for(int i =0;i<a.length;i++) {
			if(a[i]==0)
				count0++;	
			else if(a[i]==1)
				count1++;
			else
				count2++;
		}
		for(int i=0;i<count0;i++) {
			a[i] = 0;
			System.out.print(a[i]+" ");		
	}
		for(int i=count0;i<count1+count0;i++) {
			a[i] = 1;
			System.out.print(a[i]+" ");
		// TODO Auto-generated method stub
		}
		for(int i=count0+count1;i<count2+count1+count0;i++) {
			a[i] = 2;
			System.out.print(a[i]+" ");
		// TODO Auto-generated method stub
		}
	}

}
