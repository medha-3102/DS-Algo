package deque;

public class Deque {

	public static void main(String[] args) {
		
		MyDeque d=new MyDeque(10);
		d.insertfront(1);
		d.insertfront(9);
		d.insertfront(5);
		d.insertfront(10);
		d.deleterear();
		d.deleterear();
		d.insertrear(0);
		System.out.println(d.getFront());
		System.out.println(d.getRear());
		
	}

}
