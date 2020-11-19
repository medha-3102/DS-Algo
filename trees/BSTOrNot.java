package trees;
//import trees.Node1;

public class BSTOrNot {
	Node1 root;
	boolean isBST() {
		return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	boolean isBSTUtil(Node1 root2,int min, int max) {
		if(root2==null)
			return true;
		if(root2.data <min||root2.data>max)
			return false;
		return(isBSTUtil(root2.left,min,root2.data-1)&& isBSTUtil(root2.right,root2.data+1,max));
	}

	public static void main(String[] args) {
		BSTOrNot tree=new BSTOrNot();
		tree.root=new Node1(4);
		tree.root.left=new Node1(2);
		tree.root.right=new Node1(5);
		tree.root.left.left=new Node1(1);
		tree.root.left.right=new Node1(3);
		if(tree.isBST())
			System.out.println("Is BST");
		else
			System.out.println("Not a BST");
		// TODO Auto-generated method stub

	}

}
