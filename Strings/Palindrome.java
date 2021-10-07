package strings;

public class Palindrome {

	public static void main(String[] args) {
		String s="WOW";
		String r="";
		for(int i=s.length()-1;i>=0;i--)
			r=r+s.charAt(i);
		if(s.equals(r))
			System.out.println("Yes");
		else
			System.out.println("No");
		// TODO Auto-generated method stub

	}
}
