package trees;
public class LevelOrder<E> {
	Node<E> root;
	public LevelOrder() {
		root=null;
	}
	void printLevelOrder(){
		int h=height(root);
		int i;
		for(i=1;i<=h;i++)
			printGivenLevel(root,i);
	}
	int height(Node<E> root) {
		if(root==null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.left);
			if(lheight>rheight)
				return(lheight+1);
			else return(rheight+1);

		}
	}
	void printGivenLevel(Node<E> root,int level) {
		if(root==null)return;
		if(level==1)System.out.print(root.data+" ");
		else if(level>1) {
			printGivenLevel(root.left,level-1);
			printGivenLevel(root.right,level-1);
		}
	}

	public static void main(String[] args) {
		LevelOrder<Integer> tree=new LevelOrder<>();
		tree.root=new Node<Integer>(1);
		tree.root.left=new Node<Integer>(2);
		tree.root.right=new Node<Integer>(3);
		tree.root.left.left=new Node<Integer>(6);
		tree.printLevelOrder();
		// TODO Auto-generated method stub
	}

}
