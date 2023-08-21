package arrays;

public class MinSubarraySumGreatX {

	public static void main(String[] args) {
		int a[] = {1,4,45,6,10,19};
		int x  = 51;
		int n =6;
		int min = smallestSubarryWithSum(a,n,x);
		if(min == n+1) {
			System.out.println("Not exists");
		}else {
			System.out.println(min);
		}
		
		// TODO Auto-generated method stub

	}
	static int smallestSubarryWithSum(int a[], int n, int x) {
		int sum =0,minLength = n+1, start = 0, end = 0;
		while(end<n) {
			while(sum<=x &&end<n) {
				sum +=a[end++];
			}
			while(sum>x && start<n) {
				if(end- start< minLength) {
					minLength = end - start;
				}
				sum -=a[start++];
			}
		}
		return minLength;
	}
	//O(N), O(1)
	

}
