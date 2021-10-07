package strings;

public class Anagram {

	public static void main(String[] args) {
		String s1="CAFE";
		String s2="FACE";
		boolean isAnagram=true;
		int a[] = new int[256];
		for(char c : s1.toCharArray()) {
			int index = (int) c;
			a[index]++;
		}
		for(char c : s2.toCharArray()) {
			int index = (int) c;
			a[index]--;
		}
		for(int i=0;i<256;i++) {
			if(a[i]!=0) {
				isAnagram=false;
				break;
			}
		}
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not anagram");
		// TODO Auto-generated method stub

	}

}
