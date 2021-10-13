package recursionBacktracking;

public class Permutation {

	public static void main(String[] args) {
		String s="abc";
		permute(s,0,s.length()-1);
		// TODO Auto-generated method stub

	}
	static void permute(String s,int l,int r) {
		if(l==r) {
			System.out.println(s);
			return;
		}
		for(int i=l;i<=r;i++) {
			s= swap(s,l,i);
			permute(s,l+1,r);
			s=swap(s,l,i);
		}
	}
	static String swap(String s,int l,int r) {
		char a[]=new char[s.length()];
		a=s.toCharArray();
		char temp=a[l];
		a[l]=a[r];
		a[r]=temp;
		return String.valueOf(a);
	}

}
