package strings;

public class RotationOfEachOther {
	static boolean check(String s1,String s2) {
		return(s1.length()==s2.length()&& (s1+s1).indexOf(s2)!=-1);
		
	}//indexof return the first occurrence of a value in the string

	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "DCAB";
		if(check(s1,s2))
			System.out.println("Valid rotation");
		else
			System.out.println("Invalid rotation");
		// TODO Auto-generated method stub
		
	}

}
