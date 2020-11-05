package linkedList;
public class MyLinkedList<E> {
	
		Node<E> head;
		public boolean isEmpty() {
			return head==null;
		}
		public void add(E data) {
			Node<E> toAdd = new Node<E>(data);
			Node<E> temp=head;
			if(head==null) {
				head=toAdd;
				return;
			}
			while(temp.next !=null) {
				temp=temp.next;
			}
			temp.next=toAdd;
		}
		void beginadd(E data) {
			Node<E> toAdd=new Node<E>(data);
			if(head==null) {
				head=toAdd;
				return;
			}
			toAdd.next=head;
			head=toAdd;
 		}
			void print(){
			Node<E> temp=head;
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp=temp.next;
			}	
		}
			int length() {
				Node<E> temp=head;
				int count=0;
				while(temp!=null) {
					count++;temp=temp.next;
				}
				//System.out.println(count);
				return count;
			}
			void search(E data) {
				int count=1;
				Node<E> temp=head;
				while(temp!=null) {
					if(temp.data==data) {
						System.out.println(data+" is found at the position "+count+".");
						return ;
					}
					
					temp=temp.next;
					count++;
				}
				System.out.println(data+" isn't in the given linked list.");
			}
			void delete(int pos){
				int size=length();
				if(pos>size||pos<1) {
					System.out.println("Invalid position");
					
				return;
				}
				if(pos==1) {
					Node<E> temp=head;
					head=head.next;
					temp.next=null;
					return;
				}else {
			Node<E> prev=head;
			int count=1;
			while(count<pos-1) {
				prev=prev.next;
				count++;
			}
			Node<E> current=prev.next;
			prev.next=current.next;
			current.next=null;
			}
			}
			public E removeLast() throws Exception {
				Node<E> temp=head;
				if(temp==null) {
					throw new Exception("Cannot remove last element from empty stack");
				}
				
				if(temp.next==null) {
					Node<E> toRemove=head;
					head=null;
					return toRemove.data;
				}
				while(temp.next.next!=null) {
					temp=temp.next;
				}
				Node<E> toRemove=temp.next;
				temp.next=null;
				return toRemove.data;
			}
			public E getLast() throws Exception{
				Node<E> temp=head;
				if(temp==null) {
					throw new Exception("Peeking from empty stack");
				}
				
				while(temp.next.next!=null) {
					temp=temp.next;
				}
				
				return temp.next.data;
				
			}
			// TODO Auto-generated method stub
			public static class Node<E>{
				public E data;
				 public Node<E> next;
			//Node<E> next;
			public Node(E data){
				this.data=data;
				next=null;
			}
}
}
