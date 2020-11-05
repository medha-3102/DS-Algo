package trees;
//import trees.Node;

public class BST {
		static Node1 root;
		void root(int key){
		root =insert(root,key);
		}
		BST(){
		root=null;
		}
		Node1 insert(Node1 root,int key) {
			if(root==null) {
				root=new Node1(key);
				return root;
			}
			if(key<root.data)
				root.left=insert(root.left,key);
			else if(key>root.data)
				root.right=insert(root.right,key);
			return root;	
		}
	public static void main(String[] args) {
		BST tree=new BST();
		tree.root(50);
		tree.root(10);
		tree.root(60);
		tree.root(20);
		tree.root(80);
		inOrder(tree.root);
		
		// TODO Auto-generated method stub

	}
	static void inOrder(Node1 root) {
		if(root==null) 
			return;
		inOrder(root.left);
				System.out.print(root.data+" ");
				inOrder(root.right);

		
		
	}
}

class Node1{
	int data;
	Node1 left;
	Node1 right;
	 public Node1(int data){
		this.data=data;
		left=null;
		right=null;
	}
}