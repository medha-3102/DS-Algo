package linkedList;
//import java.util.LinkedList;
import linkedList.MyLinkedList;
//import java.util.*;
public class LinkedList {

	public static void main(String[] args) {
		MyLinkedList<String> r = new MyLinkedList<>();
		r.add("A");
		r.add("B");
		r.beginadd("C");
		/*r.add(M);
		r.add(3);
		r.add(4);
		r.add(5);
		r.add(6);
		r.add(7);*/
		//pm(r);
		// TODO Auto-generated method stub
r.print();
System.out.println(r.length());
r.search("B");
r.search("E");
r.delete(2);
r.delete(1);
//r.delete(1);
r.print();
	}
	/*public static int pm(List<Integer> r) {
		int size=r.size();
		int middle=size/2;
		return r.get(middle);
	}*/

}
