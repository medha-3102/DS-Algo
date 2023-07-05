package arrays;

public class MaxProductSubarray {

	public static void main(String[] args) {
		int a[] = {1,2,3,0,-7,8,2};
		int pro=1;
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			pro *=a[i];
			max=Math.max(max, pro);
			if(pro==0)
				pro=1;
		}
		pro=1;
		for(int i=a.length-1;i>=0;i--) {
			pro *=a[i];
			max=Math.max(max, pro);
			if(pro==0)
				pro=1;
		}
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}
