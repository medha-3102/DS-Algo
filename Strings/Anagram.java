package strings;

public class Anagram {

	public static void main(String[] args) {
		String s1="CAFE";
		String s2="FACE";
		boolean b=false;
		//System.out.println(s1.contains(s2));
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j))
					b=true;
					
				else b=false;
			}
		}
		System.out.println(b);
		// TODO Auto-generated method stub

	}

}
