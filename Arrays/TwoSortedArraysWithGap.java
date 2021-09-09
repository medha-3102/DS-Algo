package arrays;

public class TwoSortedArraysWithGap {

	public static void main(String[] args) {
		int a1[] = {10,27,38,43,82};
		int a2[] = {3,9};
		merge(a1,a2,a1.length,a2.length);
		for(int i=0;i<a1.length;i++)
			System.out.print(a1[i]+" ");
		System.out.println();
		for(int i=0;i<a2.length;i++)
			System.out.print(a2[i]+" ");
		// TODO Auto-generated method stub

	}
	 static int nextGap(int gap) {
		 if(gap<=1 )
			 return 0;
		 return(gap/2)+(gap%2);
	 }
	 private static void merge(int[] arr1,int[] arr2, int n,int m)
{
		 int i, j, gap = n + m;
		 for (gap = nextGap(gap); gap > 0;
				 gap = nextGap(gap)){
			 for (i = 0; i + gap < n; i++)
				 if (arr1[i] > arr1[i + gap]){
					 int temp = arr1[i];
					 arr1[i] = arr1[i + gap];
					 arr1[i + gap] = temp;
}


			 for (j = gap > n ? gap - n : 0;i < n && j < m;i++, j++)
				 if (arr1[i] > arr2[j]){
					 int temp = arr1[i];
					 arr1[i] = arr2[j];
					 arr2[j] = temp;
				 }

			 if (j < m){
				 for (j = 0; j + gap < m; j++)
					 if (arr2[j] > arr2[j + gap]){
						 int temp = arr2[j];
						 arr2[j] = arr2[j + gap];
						 arr2[j + gap] = temp;
					 }
			 }
		 }
	}
}
