package strings;

import java.util.Stack;

public class ZeroOneSubstring {

	public static void main(String[] args) {
		String s = "010110111000";
		int count=0,check=0;char put='E';
//		Stack<Character> a = new Stack<>();
//		
//		int count=0;
//		
//		for(int i=0;i<s.length();i++) {
//			if(a.isEmpty() || s.charAt(i)==a.peek())
//				a.push(s.charAt(i));
//			
//			else if(!a.isEmpty()&& a.peek()!=s.charAt(i)){
//				a.pop();
//			}
//			
//			if(a.isEmpty()) {
//				count++;
//			}
//			//O(N), O(N) using stack
//				
//		}
		for(int i=0;i<s.length();i++) {
			if(check==0 || s.charAt(i)==put) {
				put=s.charAt(i);
				check++;
			}
			
			else if(check!=0&& put!=s.charAt(i)){
				check--;
			}
			
			if(check==0) {
				count++;
			}
			
				
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}//O(N), O(1)

}
