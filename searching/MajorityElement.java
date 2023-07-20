package searchingAndSorting;

public class MajorityElement {

	public static void main(String[] args) {
		int a[] = {3,3,3,0,6,3};
		int n=a.length;
		int count=1;int majorIndex = 0;
		
		for(int i=1;i<n;i++) {
			
			if(a[majorIndex]==a[i]) {
				count++;
			}else 
				count--;
			if(count==0) {
				majorIndex=i;
				count = 1;
		}
			
		}
		count=0;
		for(int i=0;i<n;i++) {
			if(a[majorIndex]==a[i])
				count++;
		}
		if(count>n/2)
			System.out.println(a[majorIndex]);
		else
			System.out.println("None");
		// TODO Auto-generated method stub

	}//O(N) , O(1)

}
