package strings;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		String s = "{{{{{((()))}}}}}";
		Stack<Character>  a = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='{'||
					s.charAt(i)=='('||s.charAt(i)=='[')
				a.push(s.charAt(i));
			else if(!a.isEmpty()) {
			if(s.charAt(i)=='}'&& a.peek()=='{')
				a.pop();
			else if(s.charAt(i)==')'&& a.peek()=='(')
				a.pop();
			else if(s.charAt(i)==']'&& a.peek()=='[')
				a.pop();
			}
			else {
				a.push(s.charAt(i));break;
			}
		}
		if(a.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");
		// TODO Auto-generated method stub

	}

}//O(N),O(N)
