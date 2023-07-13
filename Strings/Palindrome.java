package strings;

public class Palindrome {

	public static void main(String[] args) {
		String s = "GEEKSFORGEEKS";
		boolean b=true;
		int l=0,h=s.length()-1;
		while(l<h) {
			if(s.charAt(l)!=s.charAt(h))
				b=false;
			l++;h--;
			
		}
		System.out.print(b);//O(N) & O(1)

	}

}
