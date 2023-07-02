package arrays;

public class NegPos {

	public static void main(String[] args) {
		//twopointeralgo
		int a[] = {-1,12,9,1,-2,-8,};
		int low=0,high=a.length-1;
		while(low<=high) {
			if(a[low]>0&&a[high]<0) {
				a[low]=a[low]^a[high];
				a[high]=a[low]^a[high];
				a[low]=a[low]^a[high];
				low++;
				high--;
			}else if(a[low]<0&&a[high]<0)
				low++;
			else if(a[low]>0&&a[high]>0) {
				high--;
			}else {
				low++;
				high--;
			}
		}
		for(int i:a)
			System.out.print(i+" ");
		// TODO Auto-generated method stub

	}

}
