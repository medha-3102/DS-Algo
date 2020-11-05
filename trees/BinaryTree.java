package trees;

public class BinaryTree<E> {
	Node<E> root;
	BinaryTree(){
	root=null;
	}

	public static void main(String[] args) {
	 BinaryTree<Integer> tree=new BinaryTree<Integer>();
		tree.root=new Node<Integer>(1);
		tree.root.left=new Node<Integer>(2);
		tree.root.right=new Node<Integer>(3);
		tree.root.left.left=new Node<Integer>(6);
		
		preOrder(tree.root);System.out.println();
		inOrder(tree.root);System.out.println();
		postOrder(tree.root);
	}

	static void preOrder(Node<Integer> root) {
		if(root==null) 
			return;
				System.out.print(root.data+" ");
				preOrder(root.left);
				preOrder(root.right);
		
	}
	static void inOrder(Node<Integer> root) {
		if(root==null) 
			return;
				inOrder(root.left);
				System.out.print(root.data+" ");
				inOrder(root.right);
	}
	static void postOrder(Node<Integer> root) {
		if(root==null) 
			return;
				postOrder(root.left);
				postOrder(root.right);
				System.out.print(root.data+" ");
	}
}
	   class Node<E>{
		E data;
		Node<E> left;
		Node<E> right;
		 public Node(E data){
			this.data=data;
			left=null;
			right=null;
		 }
	}


