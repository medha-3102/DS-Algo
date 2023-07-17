package searchingAndSorting;

public class RepeatingAndMissing {

	public static void main(String[] args) {
		int a[] = {1,2,2,3,5};
		int j=a[a.length-1];
		int sum=0;
		int k=1;
		int dup=0,miss=0;
		int newSum=a[0];
		while(k<=j) {
			sum+=k;
			k++;
		}
		for(int i=1;i<a.length;i++) {
			if(a[i-1]==a[i])
				dup=a[i];
			 newSum+=a[i];
		}
		newSum=newSum-dup;
		miss=sum-newSum;
		System.out.println("Duplicate:"+dup);
		System.out.println("Missing:"+miss);
		// TODO Auto-generated method stub
	}

}
