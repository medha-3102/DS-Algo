package trees;

public class AVLDelete {
	Node3 root;
	int height(Node3 N) {
		if(N==null)
			return 0;
		return N.height;
	}
	 int max(int a,int b) {
		 return(a>b)?a:b;
	 }
	 Node3 rightRotate(Node3 y) {
		 Node3 x=y.left;
		 Node3 T2=x.right;
		 x.right=y;
		 y.left=T2;
		 y.height=max(height(y.left),height(y.right))+1;
		 return x;
	 }
	 Node3 leftRotate(Node3 x) {
		 Node3 y=x.right;
		 Node3 T2=y.left;
		 y.left=x;
		 x.right=T2;
		 x.height=max(height(x.left),height(x.right))+1;
		 y.height=max(height(y.left),height(y.right))+1;
		 return y;
	 }
	 int getBalance(Node3 N){
		 if(N==null)
			 return 0;
		 return height(N.left)-height(N.right);
	 }
	 Node3 insert(Node3 node,int key) {
		 if(node==null)
			 return(new Node3(key));
		 if(key<node.key)
			 node.left=insert(node.left,key);
		 else if(key>node.key)
			 node.right=insert(node.right,key);
		 else
			 return node;
		 node.height=1+max(height(node.left),height(node.right));
		 int balance=getBalance(node);
		 if(balance>1&&key<node.left.key)
			 return rightRotate(node);
		 if(balance<-1&&key>node.right.key)
			 return leftRotate(node);
		 if(balance>1&&key>node.left.key) {
			 node.left=leftRotate(node.left);
			 return rightRotate(node);
		 }
		 if(balance<-1&&key<node.right.key) {
			 node.right=rightRotate(node.right);
			 return leftRotate(node);
	 }
		 return node;
	 }
	 Node3 minValueNode(Node3 node) {
		 Node3 current=node;
		 while(current.left!=null)
			 current=current.left;
		 return current;
	 }
	 Node3 deleteNode(Node3 root,int key) {
		 if(root==null)
			 return root;
		 if(key<root.key)
			 root.left=deleteNode(root.left,key);
		 else if(key>root.key)
			 root.right=deleteNode(root.right,key);
		 else {
			 if((root.left==null)||(root.right==null)) {
				 Node3 temp=null;
				 if(temp==root.left)
					 temp=root.right;
				 else
					 temp=root.right;
				 if(temp==null) {
					 temp=null;
					 root=null;
				 }
				 else
					 root=temp;
			 }
			 else {
				 Node3 temp=minValueNode(root.right);
				 root.key=temp.key;
				 root.right=deleteNode(root.right,temp.key);
			 }
		 }
		 if(root==null)
			 return root;
		 root.height=max(height(root.left),height(root.right))+1;
		 int balance=getBalance(root);
		 if(balance>1&&getBalance(root.left)>=0)
			 return rightRotate(root);
		 if(balance>1 && getBalance(root.right)<0) {
			 root.left=leftRotate(root.left);
		 return rightRotate(root);
		 }
		 if(balance<-1&&getBalance(root.right)<=0)
			 return leftRotate(root);
		 if(balance<-1&& getBalance(root.right)>0) {
			 root.right=rightRotate(root.right);
			 return leftRotate(root);
		 }
		 return root;
	 }

		 void preOrder(Node3 root) {
			if(root!=null) {
					System.out.print(root.key+" ");
					preOrder(root.left);
					preOrder(root.right);
			}
			
		}


	public static void main(String[] args) {
		AVLDelete tree=new AVLDelete();
		tree.root=tree.insert(tree.root,10);
		tree.root=tree.insert(tree.root, 20);
		tree.root=tree.insert(tree.root, 30);
		tree.root=tree.insert(tree.root, 40);
		tree.root=tree.insert(tree.root, 50);
		tree.root=tree.insert(tree.root, 25);
		tree.preOrder(tree.root);
		tree.root=tree.deleteNode(tree.root, 25);
		System.out.println();
		System.out.println("After deletion:");
		tree.preOrder(tree.root);
		// TODO Auto-generated method stub

	}

}
