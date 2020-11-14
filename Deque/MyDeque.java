package deque;

public class MyDeque {
	static final int MAX=100;
	int arr[];
	int front;
	int rear;
	int size;
	public MyDeque(int size) {
	    arr=new int[MAX];
		front=-1;
		rear=0;
		this.size=size;
	}
	boolean isFull(){
		return((front==0 && rear==size-1)|| front==rear+1);
	}
	boolean isEmpty() {
		return(front==-1);
	}
	void insertfront(int key) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		if(front==-1) {
			front=0;
			rear=0;
		}
		else if(front==0) 
			front=size-1;
		else
			front=front-1;
		arr[front]=key;
	}
	void insertrear(int key) {
		if(isFull()) {
			System.out.println("Overflow");
		return;
		}
		if(front==-1) {
			front=0;
			rear=0;
		}
		else if(rear==size-1)
			rear=0;
		else
			rear=rear+1;
		arr[rear]=key;
	}
	void deletefront() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return;
		}
		if(front==rear) {
			front=-1;
			rear=-1;
		}
		else
			if(front==size-1)
				front=0;
			else
				front=front+1;
	}
	void deleterear() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return;
		}
		if(front==rear) {
			front=-1;
			rear=-1;
		}
		else if(rear==0) 
		rear=size-1;
		else
			rear=rear-1;
	}
	int getFront() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return-1;
		}
		return arr[front];
	}
	int getRear() {
		if(isEmpty() || rear<0) {
			System.out.println("Underflow");return -1;
		}
		return arr[rear];
	}
	

	

}
