package arrays;

import java.util.*;

public class SubsetOfAnotherArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0;
		
		int m = (int) (Math.random()*100);
		do {
		 x=sc.nextInt();
		
		if(x==-1)
			System.out.println(m);
		else if(x==m) {
			System.out.println("Right");break;
		}
			
		else if(x<m)
			System.out.println("small");
		else 
			System.out.println("big");
		}while(x!=-1);
		//System.out.println(m);
//		int a[] = {11,1,4,3,7};
//		int b[]= {11,3,7,1};
//		boolean subset= true;
//		HashMap<Integer,Integer> h = new HashMap<>();
//		for(int i=0;i<a.length;i++) {
//			h.put(a[i],0);
//		}
//		
//		for(int i=0;i<b.length;i++) {
//			if(!h.containsKey(b[i])) {
//				subset=false;break;
//			}
//				
//		}
//		if(subset)
//			System.out.println("True");
//		else
//			System.out.println("False");
//		// TODO Auto-generated method stub

	}//O(M+N),O(N)

}
