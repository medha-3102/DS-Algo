package stack;
import stack.MyStack;
public class Stack {

	public static void main(String[] args) throws Exception{
		MyStack<Integer> s=new MyStack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		int popped=s.pop();
		System.out.println(popped);
		System.out.println(s.peek());
		// TODO Auto-generated method stub

	}

}
