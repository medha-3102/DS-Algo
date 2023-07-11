package arrays;

public class MinimumNoOfJumps {

	public static void main(String[] args) {
		int a[]= {1,3,4,2,1};
		int farthest=0;
		int current = 0;
		int jumps=0;
		boolean path=true;
		
		for(int i=0;i<a.length; i++) {
			
			if(i==a.length-1)
				break;
			
			if ((i<a.length-2 && a[i]==1 && a[i+1]<=0) ||a[0]==0) {
				path=false;
				break;
			}
			farthest = Math.max(farthest, i+a[i]);
				
			if(i==current) {
				current = farthest;
				jumps++;
			}
		
		}
		if(path)
		System.out.println(jumps);
		else
			System.out.println("Not Possible!");
		// TODO Auto-generated method stub

	}

}
