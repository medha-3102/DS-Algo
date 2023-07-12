package strings;

public class Reverse {

	public static void main(String[] args) {
		String s = "Medha";//O(N) & O(N)
//		char a[] = s.toCharArray();
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(a[i]);
//		}
		int l=0,h=s.length()-1;
		while(l<=h) {
			System.out.print(s.charAt(h));
			h--;
			
		}//O(N) & O(1)
		// TODO Auto-generated method stub

	}

}
