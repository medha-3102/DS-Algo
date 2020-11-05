package stack;

import linkedList.MyLinkedList;

public class MyStack<E> {
	private MyLinkedList<E> ll=new MyLinkedList<>();
	

	void push(E e) {
		ll.add(e);
	}

	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed");
		}
		return ll.removeLast();
	}
	E peek()throws Exception {
		return ll.getLast();
		
	}
}
