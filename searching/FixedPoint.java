package searchingAndSorting;

public class FixedPoint {
	static int binarySearch(int a[],int low,int high) {
		while(low<=high) {
			int mid= low+(high-low)/2;
			if(a[mid]==mid) {
			return mid;
			}
			else if(a[mid]<mid)
				low=mid+1;
			else
				high=mid-1;
				
		}
		return -1;
	}
	

	public static void main(String[] args) {
		int a[] = {-10,-1,3,4,10,11,30};
		int low=0,high=a.length-1;
		int index = binarySearch(a,low,high);
		if(index>=0)
			System.out.println(index);
		else
			System.out.println("No fixed point.");
		// TODO Auto-generated method stub

	}

}
