package recursionBacktracking;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(3);
		a.add(1);
		a.add(2);
		System.out.println(subsetSums(a,3));
		// TODO Auto-generated method stub

	}
	static void func(int ind,int sum,ArrayList<Integer> a,int N,ArrayList<Integer> sumSubset) {
	if(ind==N){
		sumSubset.add(sum);
		return;
	}
	func(ind+1,sum+a.get(ind),a,N,sumSubset);
	func(ind+1,sum,a,N,sumSubset);
	}
	static ArrayList<Integer>  subsetSums(ArrayList<Integer> a,int N){
		ArrayList<Integer> sumSubset = new ArrayList<>();
		func(0,0,a,N,sumSubset);
		Collections.sort(sumSubset);
		return sumSubset;
	}

}
