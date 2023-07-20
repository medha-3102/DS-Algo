package searchingAndSorting;

public class MergeTwoSortedInOne {

	public static void main(String[] args) {
		int a[]= {2,66,90,100,111};
		int b[]= {9,10,45,888,99999};
	//	merge(a,b,a.length-1,b.length-1);
		int i=0,j=0;
		int check=0;
		while(i<a.length&&j<b.length) {
			if(b[j]<a[i]) {
				System.out.print(b[j]+" ");
				j++;
				check=1;
			}
			else {
				System.out.print(a[i]+" ");
				i++;
				check=2;
			}
		}
		
		if(check==1) {
			for(int k=0;k<a.length;k++) {
				if(a[k]>=b[b.length-1])
					System.out.print(a[k]+" ");
			}
		}
		if(check==2) {
			for(int k=0;k<b.length;k++) {
				if(b[k]>=a[a.length-1])
					System.out.print(b[k]+" ");
			}
		}
		// TODO Auto-generated method stub

	}

}
