package college;

import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		String s = "Medha";
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			stack.push(s.charAt(i));
		}
		
		while(!stack.isEmpty())
			System.out.print(stack.pop());
		
//		for(int i=s.length();i>=0;i--) {
//			
//		}
		// TODO Auto-generated method stub

	}

}
