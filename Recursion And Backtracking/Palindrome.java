package recursionBacktracking;

public class Palindrome {

	public static void main(String[] args) {
		String s="racecar";
		// TODO Auto-generated method stub
		char a[]=new char [s.length()];
		a=s.toCharArray();
		System.out.println(isPalin(a,0,a.length-1));
	}
	static boolean isPalin(char a[],int l,int h) {
		if(l>=h)
			return true;
		if(a[l]!=a[h])
			return false;
		return isPalin(a,l+1,h-1);
	}

}
