package college;

import java.util.Scanner;

class NewStack{
	int top=-1;
	int a[] = new int[10];
	 void push(Scanner sc) {
		if(top==9)
			System.out.println("Overflow");
		else {
			System.out.println("Enter an element");
			int ele = sc.nextInt();
			top++;
			a[top]=ele;
				
		}
	}
	 void pop() {
		 if(top==-1)
			 System.out.println("Empty");
		 else {
			 System.out.println(a[top]+" is popped.");top--;
		 }
	 }
	 void print() {
		 for(int i=0;i<=top;i++)
			 System.out.print(a[i]+" ");
	 }
}


public class MyStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NewStack ns = new NewStack();
		ns.push(sc);
		ns.pop();
		ns.push(sc);
		ns.push(sc);
		ns.pop();
		ns.push(sc);
		ns.push(sc);
		ns.print();
		
		// TODO Auto-generated method stub

	}

}
