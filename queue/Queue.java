package queue;

public class Queue {

	public static void main(String[] args) {
		MyQueue<Integer> mq=new MyQueue<>();
		mq.enqueue(12);
		mq.enqueue(121);
		mq.enqueue(1);
		mq.enqueue(124);
		System.out.println(mq.dequeue());
		// TODO Auto-generated method stub

	}

}
