package recursionBacktracking;

public class Powerset {

	public static void main(String[] args) {
		String s="abc";
		String cur="";
		char a[]=new char [s.length()];
		a=s.toCharArray();
		powerset(a,0,cur);
		// TODO Auto-generated method stub
	}
	static void powerset(char a[],int i,String cur) {
		if(i==a.length) {
			System.out.print("'"+cur+"'"+" ");
			return;		
			}
		powerset(a,i+1,cur+a[i]);
		powerset(a,i+1,cur);
	}
	

}
